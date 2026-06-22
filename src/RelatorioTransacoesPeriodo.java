import java.util.Scanner;

public class RelatorioTransacoesPeriodo {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Relatorio de Transações.");
        System.out.println();

        int maxSemanas = 4;
        double limiteAlerta = 1000.00;
        double totalMes = 0;
        double totalEntradas = 0;
        double totalSaidas = 0;

// for externo — semanas
        for (int semana = 1; semana <= maxSemanas; semana++) {
            double totalSemana = 0;
            double entradasSemana = 0;
            double saidasSemana = 0;

            System.out.printf("Semana %d — quantas transações foram feitas? ", semana);
            int qtdTransacoes = scanner.nextInt();

            // for interno — transações
            for (int trans = 1; trans <= qtdTransacoes; trans++) {
                System.out.print("Valor da transação: R$");
                double vlTrans = scanner.nextDouble();

                System.out.print("1 - Entrada | 2 - Saída: ");
                int tipo = scanner.nextInt();

                if (tipo == 1) {
                    entradasSemana += vlTrans; // acumula entrada
                } else {
                    saidasSemana += vlTrans;   // acumula saída
                }
            }

            // resumo da semana
            totalEntradas += entradasSemana;
            totalSaidas += saidasSemana;
            System.out.printf("Entradas: R$%.2f | Saídas: R$%.2f%n", entradasSemana, saidasSemana);
        }

// relatório final
        double mediaSemanal = totalSaidas / maxSemanas;

// classificação
        if (totalSaidas > limiteAlerta * 2) {
            // gastos elevados + dicas
        } else if (totalSaidas > limiteAlerta) {
            // atenção
        } else {
            // sob controle
        }

        scanner.close();
    }
}
