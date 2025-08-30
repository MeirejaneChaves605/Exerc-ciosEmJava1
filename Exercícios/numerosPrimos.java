// programa para ler um numero inteiro e retornar se e primo ou nao, utilizando funcao.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        int numero = sc.nextInt();    
        boolean resultado = Verificar(numero);
        System.out.println("O numero " + numero + " e primo? " + resultado);
      
        sc.close();
    }
    public static boolean Verificar(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
