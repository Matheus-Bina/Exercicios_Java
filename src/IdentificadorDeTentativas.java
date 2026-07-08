import java.util.Scanner;

public class IdentificadorDeTentativas {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    String senha = "123";
    String user = "ma";
    double saldo = 5000;

    int maxSaquesDia = 3;
    int maxErrosSenha = 3;
    int maxTentativasSus = 2;
    int limiteSaque = 2000;


    System.out.println("""
                       Bem-vindo a área de Saque
                       Insira suas credenciais abaixo para ter acesso.""");

    while (maxErrosSenha > 0) {

        System.out.print("Usuario:");
        String inputUser = scanner.nextLine();

        System.out.print("Senha:");
        String inputSenha = scanner.nextLine();

        if (inputUser.equals(user) && inputSenha.equals(senha)) {
            System.out.println("Acesso concedido");
            System.out.println();

            System.out.print("Digite o quanto quer sacar: R$");
            double inputSaque = scanner.nextDouble();

            scanner.nextLine();

            while(maxTentativasSus > 0) {
                if (inputSaque > limiteSaque) {
                    maxTentativasSus--;
                    System.out.println("Saque acima do limite. Tentativa registrada como suspeita.");
                } else {
                    maxSaquesDia--;
                    saldo -= inputSaque;
                    System.out.println();
                    System.out.print("""
                            
                            Saque concluido com sucesso!
                            Seu saldo restante é de: R$%.2f
                            Deseja fazer outro saque? Digite 'Novo Saque' ou 'Sair':""".formatted(saldo));
                    String novoSaque = scanner.nextLine();

                    if (novoSaque.equalsIgnoreCase("sair")) {
                        System.out.println("Deslogando com segurança.");
                    } else {
                        while (novoSaque.equalsIgnoreCase("Novo Saque") && maxSaquesDia > 0) {
                            System.out.println();
                            System.out.print("Digite o quanto quer sacar: R$");
                            double inputSaque2 = scanner.nextDouble();
                            scanner.nextLine();

                            maxSaquesDia--;              // 1º decrementa
                            saldo -= inputSaque2;        // 2º processa o saque
                            System.out.println();
                            System.out.printf("Saque concluído! Saldo: R$%.2f%n", saldo);

                            if (maxSaquesDia > 0) {      // 3º só depois checa se ainda tem saques disponíveis
                                System.out.print("Deseja fazer outro saque?...");
                                novoSaque = scanner.nextLine();
                            } else {
                                System.out.println("Limite diário de saques atingido.");
                                novoSaque = "sair";
                            }
                        }
                    }
                    break;
                }

                if (maxTentativasSus == 0) {
                    System.out.println("Conta bloqueada temporariamente.");
                }
                break;
            }
        } else {
            System.out.println("Credenciais incorretas, tente novamente.");
            maxErrosSenha --;
        }

    }

    if (maxErrosSenha == 0){
        System.out.println("Conta bloqueada temporariamente.");
    }

    scanner.close();

    }
}

