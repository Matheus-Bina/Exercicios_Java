import java.util.Scanner;

public class Extrato {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double saldo = 5000;
        int totalTransacoes = 5;

        System.out.print("Bem-vindo ao extrato.");

        for(int i = 0;i < totalTransacoes; i++){
            System.out.println();
            System.out.print("Insira qual o valor da sua transferencia: R$");
            double valorTrans = scanner.nextDouble();
            System.out.print("""
                                1 - Entrada
                                2 - Saida
                                Digite qual o tipo de transação:""");
            int escolhaTrans = scanner.nextInt();
            if (escolhaTrans == 1){
                saldo += valorTrans;
            }else if (escolhaTrans == 2){
                saldo -= valorTrans;
            }else{
                System.out.println("Escolha invalida");
            }

            System.out.printf("Seu saldo atual é de: R$%.2f",saldo);
        }
        System.out.println();
        System.out.printf("%nSeu saldo depois de %d transações é: R$%.2f", totalTransacoes, saldo);

        scanner.close();
    }
}
