// Este programa calcula a divisão de pares de números inteiros, informando "divisao impossivel" caso o denominador seja zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if (B == 0) {
                System.out.println("divisao impossivel");
            } else {
                double divisao = (double) A / B;
                System.out.printf("%.1f%n", divisao);
            }
        }

        scanner.close();
    }
}
