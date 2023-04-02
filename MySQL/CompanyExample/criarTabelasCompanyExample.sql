CREATE TABLE employee (
	Fname varchar(15) not null,
	Ssn char(9) not null,
	Bdate DATE,
	Address varchar(30),
	Sex char,
	Salary decimal(10,2),
	Super_ssn char(9),
	Dno int not null,
	CONSTRAINT chk_salary_employee CHECK (Salary > 2000.0),
	CONSTRAINT pk_employee PRIMARY KEY (Ssn)
);

CREATE TABLE department (
	Dname varchar(15) not null,
	Dnumber int not null,
	Mgr_ssn char(9),
	Mgr_start_date date,
	Dept_create_date date,
	CONSTRAINT chk_date_dept CHECK (Dept_create_date < Mgr_start_date),
	CONSTRAINT pk_dept PRIMARY KEY (Dnumber),
	CONSTRAINT unique_name_dept unique(Dname),
	FOREIGN KEY (Mgr_ssn) REFERENCES employee(Ssn)
);

CREATE TABLE dept_location (
	Dnumber int not null,
	Dlocation varchar(15) not null,
	CONSTRAINT pk_dept_location PRIMARY KEY (Dnumber, Dlocation),
	CONSTRAINT fk_dept_location FOREIGN KEY (Dnumber) REFERENCES department(Dnumber)
);

CREATE TABLE project (
	Pname varchar(15) not null,
	Pnumber int not null,
	Plocation varchar(15),
	Dnum int not null,
	PRIMARY KEY (Pnumber),
	CONSTRAINT unique_project unique(Pname),
	CONSTRAINT fk_project FOREIGN KEY (Dnum) REFERENCES department(Dnumber)
);

CREATE TABLE works_on (
	Essn char(9) not null, 
	Pno int not null,
	Hours decimal(3,1) not null,
	PRIMARY KEY (Essn, Pno),
	CONSTRAINT fk_workson_essn FOREIGN KEY (Essn) REFERENCES employee(Ssn),
	CONSTRAINT fk_workson_pnumber FOREIGN KEY (Pno) REFERENCES project(Pnumber)
);

CREATE TABLE dependent (
	Essn char(9) not null,
	Dependent_name varchar(15) not null,
	Sex char,
	Bdate date,
	Relationship varchar(15),
	Age int not null,
	CONSTRAINT chk_dependent_age CHECK (Age < 22),
	PRIMARY KEY (Essn, Dependent_name),
	CONSTRAINT fk_dependent FOREIGN KEY (Essn) REFERENCES employee(Ssn)
);