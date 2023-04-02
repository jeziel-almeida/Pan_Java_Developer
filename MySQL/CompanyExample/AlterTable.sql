ALTER TABLE department DROP FOREIGN KEY department_ibfk_1;

ALTER TABLE department ADD CONSTRAINT fk_dept FOREIGN KEY(Mgr_ssn) REFERENCES employee(Ssn) 
	ON UPDATE CASCADE;

