import java.util.Scanner;

public class AnaliseDeCredito {
    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        System.out.println("""
                           Bem-vindo a analise de Crédito.
                           Precisamos que você insira algumas informações para fazermos sua análise de crédito..
                           """);

        System.out.print("Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Insira seu salario: R$");
        double salario = scanner.nextDouble();

        System.out.print("Digite sua divida atual: R$");
        double dividaAtual = scanner.nextDouble();

        System.out.print("Digite seu Score atual: ");
        int score = scanner.nextInt();
        System.out.println();

        double limite1 = salario * 2;
        double limite2 = salario * 4;
        double limite3 = salario * 6;

        if (dividaAtual >= (salario/2)){
            System.out.println("Crédito negado por comprometimento da renda.");
        } else if (dividaAtual < (salario/2) && score < 300) {
            System.out.println("Crédito negado por Score insuficiente.");
        } else if (dividaAtual < (salario/2) && score >= 300 && score <= 600) {
            System.out.printf("%s,com base em nossa analise o limite de crédito liberado foi de:R$%.2f%n", nome, limite1);
        }else if (dividaAtual < (salario/2) && score >= 601 && score <= 900){
            System.out.printf("%s,com base em nossa analise o limite de crédito liberado foi de:R$%.2f%n", nome, limite2);
        }else{
            System.out.printf("%s,com base em nossa analise o limite de crédito liberado foi de:R$%.2f%n", nome, limite3);
        }

        scanner.close();
    }
}
