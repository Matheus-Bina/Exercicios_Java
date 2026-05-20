import java.util.Scanner;

public class Revisao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String usuario = "the";
        String senha = "789";
        double saldo = 1000;
        String relacionamento = "alto";

        double limitEmpresBaixo = 5000;
        double limitEmpresMedio = 10000;
        double limitEmpresAlto = 15000;

        System.out.println("Bem-vindo a área de Emprestimos, por favor insira suas credencias para ter acesso.");

        System.out.print("Digite seu usuário:");
        String inputUser = scanner.nextLine();
        System.out.print("Digite sua senha:");
        String inputSenha = scanner.nextLine();

        if(inputUser.equals(usuario) && inputSenha.equals(senha)){
            System.out.println();
            System.out.println("Acesso concedido");
            System.out.println();

            if(relacionamento.equals("alto") || relacionamento.equals("medio")) {
                System.out.print("""
                        Com base em seu relacionamento faça sua simulação agora.
                        Insira um valor: R$""");
                double inputEmpres = scanner.nextDouble();
                scanner.nextLine();

                if (inputEmpres <= limitEmpresAlto){
                    System.out.print("""
                                       6x - taxa de 1,5%
                                       12x - taxa de 2%
                                       18x - taca de 2,5%
                                       24x - taxa de 3%
                                       Escolha em quantas parcelas quer parcelar:""");
                    String escolhaPagamento = scanner.nextLine();

                        switch (escolhaPagamento){
                            case "6x":
                                double calculoEmpres6 = (inputEmpres * 1.5) / 6;
                                double calculoTotalEmpres6 = inputEmpres * 1.5;
                                System.out.println();
                                System.out.printf("""
                                                  O valor a ser pago é de: R$%.2f ao mês
                                                  O valor total a ser pago no fim do contrato é de: R$%.2f""", calculoEmpres6,calculoTotalEmpres6);
                                break;
                            case "12x":
                                double calculoEmpres12 = (inputEmpres * 2) / 12;
                                double calculoTotalEmpres12 = inputEmpres * 2;
                                System.out.println();
                                System.out.printf("""
                                                  O valor a ser pago é de: R$%.2f ao mês
                                                  O valor total a ser pago no fim do contrato é de: R$%.2f""", calculoEmpres12,calculoTotalEmpres12);
                                break;
                            case "18x":
                                double calculoEmpres18 = (inputEmpres * 2.5) / 18;
                                double calculoTotalEmpres18 = inputEmpres * 2.5;
                                System.out.println();
                                System.out.printf("""
                                                  O valor a ser pago é de: R$%.2f ao mês
                                                  O valor total a ser pago no fim do contrato é de: R$%.2f""", calculoEmpres18,calculoTotalEmpres18);
                                break;
                            case "24x":
                                double calculoEmpres24 = (inputEmpres * 3) / 24;
                                double calculoTotalEmpres24 = inputEmpres * 3;
                                System.out.println();
                                System.out.printf("""
                                                  O valor a ser pago é de: R$%.2f ao mês
                                                  O valor total a ser pago no fim do contrato é de: R$%.2f""", calculoEmpres24,calculoTotalEmpres24);
                                break;
                            default:
                                System.out.println("Valor inserido indisponivel");
                                break;
                        }
                } else{
                    System.out.println("Valor indiponivel para emprestimo.");
                }
            }else{
                System.out.println("Seu relacionamento com a instituição precisa de melhorias para ter acesso a empréstimos.");
            }

        }else {
            System.out.println("Usuário ou senha incorreto.");
        }
    }
}
