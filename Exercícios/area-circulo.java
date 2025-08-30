// Este programa calcula a área de um círculo com base no raio informado pelo usuário.

import java.util.Scanner;

public class AreaCirculo {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o raio do círculo: ");
    double raio = sc.nextDouble();
    double area = 3.14159 * Math.pow(raio, 2);
    System.out.printf("A área do círculo é: %.4f\n", area);

    sc.close();
  }
}
