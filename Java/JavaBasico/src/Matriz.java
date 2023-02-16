import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
     
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        System.out.println("Matriz randômica:");
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}