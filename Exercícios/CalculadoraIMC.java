// Este programa calcula o IMC (Índice de Massa Corporal) com base no peso e altura do usuário.

import java.util.Scanner;

public class CalculadoraIMC {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu peso em kg: ");
    double peso = sc.nextDouble();

    System.out.print("Digite sua altura em metros: ");
    double altura = sc.nextDouble();

    double imc = peso / Math.pow(altura, 2);
    System.out.printf("Seu IMC é: %.2f\n", imc);

    sc.close();

    // Este programa calcula o IMC e classifica o resultado.

if (imc < 18.5) {
  System.out.println("Classificação: Abaixo do peso");
} else if (imc < 25) {
  System.out.println("Classificação: Peso normal");
} else if (imc < 30) {
  System.out.println("Classificação: Sobrepeso");
} else {
  System.out.println("Classificação: Obesidade");
}
  }
}
