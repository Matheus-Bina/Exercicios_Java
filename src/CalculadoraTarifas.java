import java.util.Scanner;

public class CalculadoraTarifas {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                         1 - Corrente
                         2 - Poupança
                         Digite o tipo da sua conta:""");
        String tipoConta = scanner.nextLine();

        System.out.println();

        System.out.print("""
                         1 - Saque
                         2 - Transferencia
                         3 - Extrato
                         Digite o que deseja fazer:""");
        String operacao = scanner.nextLine();

        double saldo = 2000;

        double tarifaSaqueCor = 6.50;
        double tarifaTransCor = 12.00;
        double tarifaExtraCor = 2.00;

        double tarifaSaquePou = 0;
        double tarifaTransPou = 8.00;
        double tarifaExtraPou = 0;

        if (tipoConta.equals("1") && operacao.equals("1")){
            System.out.print("Insira o valor do saque: ");
            double valorSaqueCor = scanner.nextDouble();
            double calculaSaqueCor = (valorSaqueCor + tarifaSaqueCor);
            double calculoSaqueTaxaCor = saldo - calculaSaqueCor;
                if(calculaSaqueCor < saldo){
                    System.out.printf("""
                                       Saque feito com sucesso.
                                       Seu saldo atual é de: R$%.2f
                                       """, calculoSaqueTaxaCor);
                } else{
                    System.out.println("Saldo Insuficiente para saque.");
                }
        } else if (tipoConta.equals("1") && operacao.equals("2")){
            System.out.print("Digite quanto quer transferir:");
            double valorTransCor = scanner.nextDouble();
            double calculaTransCor = (valorTransCor + tarifaTransCor);
            double calculoTransTaxaCor = saldo - calculaTransCor;
            if (valorTransCor < saldo){
                System.out.printf("""
                                  Transferencia feita com sucesso.
                                  Seu saldo atual é de: R$%.2f
                                  """, calculoTransTaxaCor);
            } else{
                System.out.println("Saldo Insuficiente para Transferencia.");
            }
        } else if (tipoConta.equals("1") && operacao.equals("3")){
                if (saldo > tarifaExtraCor){
                    System.out.printf("""
                                  
                                  Extrato enviado por e-mail.
                                  Foi cobrado uma taxa de: R$%.2f
                                  """, tarifaExtraCor);
                } else{
                    System.out.println("Saldo Insuficiente para exibir Extrato.");
                }
        } else if (tipoConta.equals("2") && operacao.equals("1")) {
            System.out.print("Insira o valor do saque: ");
            double valorSaquePou = scanner.nextDouble();
            double calculaSaquePou = (valorSaquePou + tarifaSaquePou);
            double calculoSaqueTaxaPou = saldo - calculaSaquePou;
            if(calculaSaquePou < saldo){
                System.out.printf("""
                                       Saque feito com sucesso.
                                       Seu saldo atual é de: R$%.2f
                                       """, calculoSaqueTaxaPou);
            } else{
                System.out.println("Saldo Insuficiente para saque.");
            }
        } else if (tipoConta.equals("2") && operacao.equals("2")) {
            System.out.print("Digite quanto deseja transferir:");
            double valorTransPou = scanner.nextDouble();
            double calculaTransPou = (valorTransPou + tarifaTransPou);
            double calculoTransTaxaPou = saldo - calculaTransPou;
            if (valorTransPou < saldo) {
                System.out.printf("""
                        Transferencia feita com sucesso.
                        Seu saldo atual é de: R$%.2f
                        """, calculoTransTaxaPou);
            } else {
                System.out.println("Saldo Insuficiente para Transferencia.");
            }
        } else if (tipoConta.equals("2") && operacao.equals("3")) {
            if (saldo > tarifaExtraPou) {
                System.out.printf("""
                        
                        Extrato enviado por e-mail.
                        Foi cobrado uma taxa de: R$%.2f
                        """, tarifaExtraPou);
            } else {
                System.out.println("Saldo Insuficiente para exibir Extrato.");
            }
        }else{
            System.out.println("Conta ou operação invalida.");
        }

        scanner.close();
    }
}

// - perguntar quanto quer sacar
// - verificar se o saque é maior que o saldo
// - fazer a subtração da taxa do saldo mais o valor do saque
// - verificar se tem saldo suficiente para fazer o saque junto da taxa