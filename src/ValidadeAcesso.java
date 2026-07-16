import java.util.Scanner;

public class ValidadeAcesso {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Insira sua agencia:");
            String agencia = scanner.nextLine();

            System.out.print("Insira o numero de sua conta: ");
            String numConta = scanner.nextLine();

            System.out.print("Agora digite sua Senha: ");
            String senha = scanner.nextLine();

            if (agencia.equals("1") && numConta.equals("5") && senha.equals("123")){
                System.out.println("Acesso concedido!");
            } else if (!agencia.equals("1") && numConta.equals("5") && senha.equals("123")) {
                System.out.println("Agencia incorreta!");
            }else if (agencia.equals("1") && !numConta.equals("5") && senha.equals("123")) {
                    System.out.println("Numero da Conta incorreto!");
            } else if (!agencia.equals("1") && !numConta.equals("5") && senha.equals("123")) {
                System.out.println("Agencia e Numero da conta incorretos!");
            } else if (agencia.equals("1") && numConta.equals("5") && !senha.equals("123")){
                System.out.println("Senha incorreta!");
            } else{
                System.out.println("Acesso negado!");
            }
            scanner.close();
    }
}
