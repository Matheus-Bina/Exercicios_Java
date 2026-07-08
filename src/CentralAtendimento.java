import java.util.Scanner;

public class CentralAtendimento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Cartão
        String senha = "123";
        double faturaAtual = 100;
        double limiteCartao = 5000;

        //Conta Corrente
        String extratoConta = "";
        double saldoConta = 1000;
        double tarifas = 1.5;

        System.out.print("""
                           Bem-vindo a nossa central de atendimento.
                           1 - Cartões
                           2 - Conta Corrente
                           3 - Investimentos
                           4 - Sair
                           Escolha um dos assuntos para seguirmos com seu atendimento: """);
        int escolha = scanner.nextInt();
        System.out.println();

        switch (escolha){
            case 1:
                System.out.print("""
                                 1 - Fatura
                                 2 - Bloqueio
                                 3 - Limite
                                 Escolha uma dessas opções referente ao seu Cartão: """);
                int escolhaCart = scanner.nextInt();
                scanner.nextLine();

                if(escolhaCart == 1){
                        if (faturaAtual > saldoConta){
                            System.out.println();
                            System.out.print("""
                                               Seu saldo atual é menor que sua fatura.
                                               Deseja adquirir um emprestimo?""");
                            String escolhaEmpre = scanner.nextLine();
                            if (escolhaEmpre.equalsIgnoreCase("sim")){
                                System.out.println("Acesse nosso Aplicativo e faça uma simulação agora.");
                            }else {
                                System.out.println("Caso queira recorrer entre em contato com seu gerente.");
                            }
                        }else {
                            System.out.printf("Sua fatura atual é de: R$%.2f",faturaAtual);
                        }
                } else if (escolhaCart == 2) {
                    System.out.println();
                    System.out.print("""
                            Necessario inserir sua senha para confirmar.
                            Insira sua senha: """);
                    String leitorSenha = scanner.nextLine();
                    System.out.println();
                    if (leitorSenha.equals("123")) {
                        System.out.println("Cartão bloqueado");
                    } else {
                        System.out.println("Entre em contato com seu gerente para seguir com o bloqueio.");
                    }
                }else{
                    System.out.printf("Seu limite atual é de: R$%.2f", limiteCartao);
                }
                break;
            case 2:
                System.out.print("""
                                 1 - Saldo
                                 2 - Extrato
                                 3 - Tárifas
                                 Escolha uma dessas opções referente ao sua Conta: """);
                int escolhaContaCorrente = scanner.nextInt();

                if (escolhaContaCorrente == 1){
                    System.out.println();
                    System.out.print("Deseja fazer um saque?");
                    String escolhaSaque = scanner.nextLine();
                        if (escolhaSaque.equalsIgnoreCase("sim")){
                            System.out.print("Digite quanto deseja sacar: R$");
                            double saqueConta = scanner.nextDouble();
                            double calculoSaque = saldoConta - saqueConta;
                                if (saqueConta < saldoConta){
                                    System.out.printf("""
                                                       Saque feito com sucesso.
                                                       Seu saldo atual é de: R$%.2f""", calculoSaque);
                                }else{
                                    System.out.println("Saldo insuficiente para saque.");
                                }
                        }else {
                            System.out.printf("Seu saldo atual é de: R$%.2f", saldoConta);
                        }
                }else if (escolhaContaCorrente == 2) {
                    System.out.println("Para ser exibido seu extrato é necessario entrar em seu Aplicativo do Banco.");
                }else{
                    System.out.println("""
                                        Tarifas de sua conta:
                                        Saque =  1%%
                                        Transferencia = 2%%
                                        Investimento = 0.5%%""");
                }
                break;
            case 3:
                System.out.print("""
                                 1 - Saldo
                                 2 - Resgatar
                                 3 - Aplicar
                                 Escolha uma dessas opções referente aos seus investimentos: """);
                int escolhaInvest = scanner.nextInt();
                scanner.nextLine();
                if (escolhaInvest == 1){
                    System.out.print("Insira sua senha para verificar seu saldo: ");
                    String saldoInvest = scanner.nextLine();
                        if (saldoInvest.equals(senha)){
                            System.out.printf("Seu saldo atual é de: R$%.2f", saldoConta);
                        }else{
                            System.out.println("Senha incorreta. Entre em seu app e verifique seu acesso.");
                        }
                }else if(escolhaInvest == 2) {
                    System.out.printf("""
                            Seu saldo atual: R$%.2f
                            Quanto deseja resgatar de seus investimentos?""", saldoConta);
                    double escolhaSaqueInvest = scanner.nextDouble();
                    scanner.nextLine();
                    if (escolhaSaqueInvest <= saldoConta) {
                        System.out.print("Insira sua senha para saque: ");
                        String verificaSenha = scanner.nextLine();
                        if (verificaSenha.equals(senha)) {
                            double calculoSaldoInvest = saldoConta - escolhaSaqueInvest;
                            System.out.printf("""
                                    Saque feito com sucesso!
                                    Esse é o saldo restante em sua conta; R$%.2f
                                    """, calculoSaldoInvest);
                        } else {
                            System.out.println("Senha incorreta. Conta bloqueada por condutas suspeitas");
                        }
                    } else {
                        System.out.println("Saldo insuficiente para saque.");
                     }
                }else{
                    System.out.print("Insira quanto deseja aplicar para render em seu cofrinho: R$");
                    double aplicaInvest = scanner.nextDouble();
                        if (aplicaInvest > 0.01){
                            System.out.print("""
                                             1 - CDB
                                             2 - CDI
                                             Escolha uma das opções para investimento:""");
                            double escolhaAplicaInvest = scanner.nextDouble();
                                if (escolhaAplicaInvest == 1){
                                    double calculoCdbInvest = (aplicaInvest * 105) / 100;
                                    System.out.printf("""
                                                        Seu dinheiro esta rendendo cerca de 105%% do CDB.
                                                        Estima-se que em um mês você terá: R$%.2f
                                                        """, calculoCdbInvest);
                                }else{
                                    double calculoCdiInvest = (aplicaInvest * 103) / 100;
                                    System.out.printf("""
                                                       Seu dinheiro esta rendendo cerca de 103%% do CDB.
                                                       Estima-se que em um mês você terá: R$%.2f
                                                       """, calculoCdiInvest);
                                }
                        }else{
                            System.out.println("Saldo insuficiente para aplicar.");
                        }
                }
                break;
            case 4:
                System.out.println("Até a próxima.");
                break;
            default:
                System.out.println("Opção invalida");
        }

        scanner.close();
    }
}
