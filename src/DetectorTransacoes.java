import java.util.Scanner;

public class DetectorTransacoes {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int totalTransacoes = 3;
        double limiteAlerta = 200.00;
        double saldo = 1000;
        int aprovadas = 0;
        int suspeitas = 0;

        for(int i = 0;i < totalTransacoes; i++){
            System.out.println();
        System.out.print("Digite qual o valor da transferencia: R$");
        double valorTrans = scanner.nextDouble();
        if (valorTrans <= limiteAlerta){
            System.out.printf("""
                              Transação %d no valor de R$%.2f APROVADA""",i + 1, valorTrans);
            saldo -= valorTrans;
            aprovadas += 1;
            System.out.println();
        }else{
            System.out.printf("""
                              Transação %d no valor de R$%.2f SUSPEITA""",i + 1, valorTrans);
            suspeitas += 1;
            System.out.println();
        }
        }

        System.out.println();
        System.out.printf("""
                          Ao longo de %d transações identificamos:
                          %d transações sem nenhum erro.
                          %d transações suspeitas em sua conta.""",totalTransacoes,aprovadas,suspeitas);
        scanner.close();
    }
}
