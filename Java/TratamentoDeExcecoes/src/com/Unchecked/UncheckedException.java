package com.Unchecked;

import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {

        try (var scan = new Scanner(System.in)) {
            var continuarLoop = true;

            do {
                System.out.println("Numerador: ");
                String a = scan.next();
                System.out.println("Denominador: ");
                String b = scan.next();
    
                try {
                    int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
                    System.out.println(String.format("Resultado: %d", resultado));
                    continuarLoop = false;
    
                } catch(NumberFormatException e) {
                    System.out.println("Não foi possível converter a string para número: " + e.toString());
    
                } catch(ArithmeticException e) {
                    System.out.println("Não é possível divisão por zero: " + e.toString());
    
                } finally {
                    System.out.println("Bloco finally");
    
                }

            } while(continuarLoop);

        }
    }

    private static int dividir(int a, int b) {
        return a / b;
    }
}
