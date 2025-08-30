// Este programa exibe uma lista de números inteiros ímpares dentro de um intervalo de 1 até X

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int y = sc.nextInt();

        for (int i = 1; i <= y; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
