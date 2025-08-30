import java.util.Scanner;

public class MediaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();

        sc.nextLine(); // Limpa o buffer após nextDouble

        // Cálculo da média
        double media = (nota1 + nota2) / 2;

        System.out.print("O aluno fez trabalho extra? (s/n): ");
        String bonus = sc.nextLine();

        if (bonus.equalsIgnoreCase("s")) {
            media += 1;
        }

        media = Math.round(media * 10.0) / 10.0;

        // Verificação da situação
        if (media >= 7) {
            System.out.println(nome + " foi Aprovado com louvor! Média: " + media);
        } else if (media >= 5) {
            System.out.println(nome + " está de Recuperação. Força! Média: " + media);
        } else {
            System.out.println(nome + " foi Reprovado. Bora estudar mais! Média: " + media);
        }

        sc.close();
    }
}
