import java.util.Scanner;

public class RendimentoMensal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double jurosAoMes = 0.008;
        int meses = 12;

        System.out.println("Bem-vindo ao Rende Mais.");
        System.out.println();
        System.out.print("Insira qual quantia você quer investir: R$");
        double quantiaInvest = scanner.nextDouble();

        double saldo = quantiaInvest;

        for (int mes = 1;mes <= meses; mes++){
            double calculoRend = saldo * jurosAoMes;
            saldo += calculoRend;
            System.out.println("""
                               Seu rendimento no mês %d foi de: R$%.2f
                               Saldo atual: R$%.2f
                               """.formatted(mes, calculoRend, saldo));
        }

    scanner.close();
    }
}
