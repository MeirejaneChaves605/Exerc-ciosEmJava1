
// Este programa lê dois números inteiros e exibe a soma entre eles.

import java.util.Scanner;

public class SomaSimples {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite dois valores inteiros:");
    int a = sc.nextInt();
    int b = sc.nextInt();
    int soma = a + b;
    System.out.println("SOMA = " + soma);
    
    sc.close();
  }

}
