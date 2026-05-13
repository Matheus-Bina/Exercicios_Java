import java.util.Scanner;

public class SimuladorLoginBancario {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o Numero da sua Conta: ");
        String conta = scanner.nextLine();

        System.out.print("Digite sua Senha: ");
        String senha = scanner.nextLine();

        double saldo = 10000.00;

        String texto = """
                       
                       Acesso concedido!
                       
                       Seu saldo é de: R$%.2f
                       """.formatted(saldo);

        if (!agencia.equals("1") && conta.equals("5")) {
            System.out.println("Numero da Agência esta incorreta.");
            System.exit(0);
        }
        else if(agencia.equals("1") && !conta.equals("5")) {
            System.out.println("Numero da Conta esta incorreto.");
            System.exit(0);
        }
        else if(agencia.equals("1") && conta.equals("5") && !senha.equals("123")) {
            System.out.println("Sua senha esta incorreta.");
            System.exit(0);
        }
        else if(!agencia.equals("1") && !conta.equals("5") && !senha.equals("123")) {
            System.out.println("Verifique se seus dados estão corretos.");
            System.exit(0);
        }
        else if(agencia.equals("1") && conta.equals("5") && senha.equals("123")) {
            System.out.println(texto);
            if (saldo <= 5000){
                System.out.print("Com base em seus investimentos e saldos, seu perfil é: Cliente Standard");
            } else if (saldo >5000 && saldo <= 20000) {
                System.out.println("Com base em seus investimentos e saldos, seu perfil é: Cliente Gold");
            } else {
                System.out.println("Com base em seus investimentos e saldos, seu perfil é: Cliente Platinium");
            }
        } else {
            System.out.println("Conta Bancaria não encontrada.");
            System.exit(0);
        }

        System.out.println();

        System.out.print("""
                           1 - Saque
                           2 - Depósito
                           3 - Sair
                           """);
        System.out.print("Escolha uma Opção: ");

        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println();
                System.out.print("Digite o valor que deseja sacar de sua conta: R$");
                double saque = scanner.nextDouble();
                scanner.nextLine();
                    if(saque <= saldo) {
                        System.out.println();
                        System.out.print("Insira sua senha:");
                        String senhaSaldo = scanner.nextLine();
                            if(senhaSaldo.equals("123")){
                                double calculoSaque = saldo - saque;
                                System.out.println();
                                System.out.printf("Seu saldo agora é: R$%.2f%n", calculoSaque);
                            } else{
                                System.out.println("Senha incorreta.");
                            }
                    } else{
                        System.out.println("Saldo insuficientes");
                    }
            break;
            case 2:
                System.out.println();
                System.out.print("Digite quanto deseja Depositar em sua conta: R$");
                double deposito = scanner.nextDouble();
                scanner.nextLine();
                System.out.println();
                System.out.print("Digite sua Senha: ");
                String senhaDepo = scanner.nextLine();
                System.out.println();
                    if(senhaDepo.equals("123")) {
                        double calculoDepo = saldo + deposito;
                        System.out.printf("Seu saldo atual é: R$%.2f%n", calculoDepo);
                    } else{
                        System.out.println("Senha incorreta.");
                    }
                break;
            case 3:
                System.out.println();
                System.out.println("Até a Próxima!");
                break;
            default:
                System.out.println("Opção invalida!");
        }

        scanner.close();
    }
}
