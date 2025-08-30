// programa com duas funcoes, uma para converter a temperatura de celsius para fahrenheit, e outra para converter de fahrenreit para celsius

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual conversao deseja fazer");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        int opcao = sc.nextInt();
        if (opcao == 1) {
        System.out.println("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = celsiusParaFahrenheit(celsius);
            System.out.printf("A temperatura em Fahreinheit é: %.1f%n", fahrenheit);
        }
        else if (opcao == 2)  {
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = fahrenheitParaCelsius(fahrenheit);
        System.out.printf("A temperatura em Celsius é: %.1f%n", celsius);
        }
        sc.close();
    }
    public static double celsiusParaFahrenheit(double celsius) {
    return (celsius * 9 / 5) + 32;
    
    }
    public static double fahrenheitParaCelsius(double fahrenheit) {

        return (fahrenheit - 32) * 5 / 9;
        }
}
