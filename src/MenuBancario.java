import java.util.Scanner;

public class MenuBancario {
    public static void main(String[] args){

        Scanner scanner = new Scanner (System.in);

        int tentativas = 3;
        String user = "ma";
        String senha = "123";
        double saldo = 1000;

        System.out.println("Insira suas credenciasi para ter acesso");


        while(tentativas > 0) {
            System.out.print("Usuário:");
            String inputUser = scanner.nextLine();

            System.out.print("Senha:");
            String inputSenha = scanner.nextLine();

            if (inputUser.equals(user) && inputSenha.equals(senha)) {
                System.out.println("Acesso concedido!");
                System.out.println();

                int inputEscolha = 0;
                do {
                    System.out.print("""
                                               1 - Saldo
                                               2 - Sacar
                                               3 - Depositar
                                               4 - Sair
                                               Bem-vindo ao nosso menu, escolha qual area deseja acessar:""");
                    inputEscolha = scanner.nextInt();
                    System.out.println();

                    switch(inputEscolha) {
                        case 1:
                            System.out.println("Seu saldo é de: R$%.2f".formatted(saldo));
                            System.out.println();
                            break;
                        case 2:
                            System.out.print("Insira o valor para saque: R$");
                            double inputSaque = scanner.nextDouble();
                            double calculoSaque = saldo - inputSaque;

                            if (inputSaque <= saldo) {
                                saldo -= inputSaque;
                                System.out.println("""
                                        Saque concluido com sucesso.
                                        Seu saldo atual é de: R$%.2f""".formatted(calculoSaque));
                                System.out.println();
                            } else {
                                System.out.println("Valor acima do saldo em conta.");
                            }
                            break;

                        case 3:
                            System.out.print("Insira quanto deseja depositar: R$");
                            double inputDeposito = scanner.nextDouble();

                            double calculoDepo = saldo + inputDeposito;
                            saldo += inputDeposito;

                            System.out.println("Seu saldo atual é de: R$%.2f".formatted(calculoDepo));
                            System.out.println();
                            break;

                        case 4:
                            System.out.println("Até a proxima!");
                            break;

                        default:
                            break;
                    }
                } while (inputEscolha != 4);
                break;

            } else {
                System.out.println("Credenciais incorretas.");
                System.out.println();
                tentativas --;
            }

            if (tentativas == 0){
                System.out.println("Conta bloqueada, entre em contato com o Suporte ou seu Gerente.");
            }
        }

        scanner.close();
    }
}
