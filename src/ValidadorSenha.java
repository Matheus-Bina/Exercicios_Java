import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String senha = "1234";
        int tentativas = 2;

        while(tentativas > 0){
            System.out.print("Insira sua senha para ter acesso:");
            String inserirSenha = scanner.nextLine();

            if (inserirSenha.equals(senha)){
                System.out.println("Acesso concedido!");
                break;
            }else{
                System.out.println("Senha incorreta tente novamente");
            }
        }

        scanner.close();
    }
}
