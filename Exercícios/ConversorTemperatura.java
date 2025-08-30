// Este programa converte uma temperatura de Celsius para Fahrenheit.

import java.util.Scanner;

public class ConversorTemperatura {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a temperatura em Celsius: ");
    double celsius = sc.nextDouble();
    double fahrenheit = (9 * celsius / 5) + 32;
    System.out.printf("Temperatura em Fahrenheit: %.1f°F\n", fahrenheit);

    sc.close();
  }
}
