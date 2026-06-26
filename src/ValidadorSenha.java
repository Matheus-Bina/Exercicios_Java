import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String senha = "1234";
        int tentativas = 3;

        while(tentativas > 0){
            System.out.print("Insira sua senha para ter acesso:");
            String inserirSenha = scanner.nextLine();

            if (inserirSenha.equals(senha)){
                System.out.println("Acesso concedido!");
                break;
            }else{
                tentativas --;
                System.out.println("Senha incorreta tente novamente. Resta %d tentivas".formatted(tentativas));
            }
        }

        if (tentativas == 0){
            System.out.println("Conta bloqueada temporariamente.");
        }

        scanner.close();
    }
}
