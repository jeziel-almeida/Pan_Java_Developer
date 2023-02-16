import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) throws Exception {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite o seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite a sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite a sua altura: ");
            double altura = scanner.nextDouble();

            System.out.println("Nome: " + nome + " " + sobrenome);
            System.out.println("Idade: " + idade);
            System.out.println("Altura: " + altura);
        }
    }
}
