// programa para ler o valor do raio de um circulo e retorne sua area utilizando funcao.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        
        double raio = sc.nextDouble();
        
        double area = Conversao(raio);

        System.out.println("A area do circulo é: " + area);
       
       

        sc.close();
    }

    public static double Conversao(double raio) {
   
    double area = Math.PI * Math.pow(raio, 2);
    
    return area;
    } 
}
