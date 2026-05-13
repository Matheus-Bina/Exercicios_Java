import java.util.Scanner;

public class Pix {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double saldo = 10000;
        double limiteDiario = 5000;
        String senha = "123";

        System.out.print("""
                           1 - CPF
                           2 - E-mail
                           3 - Telefone
                           4 - Aleatoria
                           Digite qual o tipo de chave Pix:""");
        int escolha = scanner.nextInt();
        scanner.nextLine();

        System.out.println();

        switch(escolha){
            case 1:
                System.out.print("Insira sua chave Pix:");
                String chaveCpf = scanner.nextLine();

                System.out.println();

                System.out.print("Insira o valor que deseja transferir: R$");
                double valorTransCpf = scanner.nextDouble();
                scanner.nextLine();

                if(valorTransCpf <= 5000) {
                    System.out.printf("Deseja transferir R$%.2f? ", valorTransCpf);
                    String confirmacaoTrans = scanner.nextLine();
                        if (confirmacaoTrans.equals("sim")){
                            System.out.print("Insira sua senha:");
                            String leituraSenha = scanner.nextLine();
                                if (leituraSenha.equals(senha)){
                                    double saldoMenosPixCpf = saldo - valorTransCpf;
                                    System.out.printf("""
                                                    Foi feito uma transferencia para a chave: %s
                                              O valor transferido foi de : R$%.2f
                                              O saldo restante em sua conta é: R$%.2f""", chaveCpf,valorTransCpf,saldoMenosPixCpf );
                                } else{
                                    System.out.println("Senha incorreta. Cancelando transferencia.");
                                }
                        }else{
                            System.out.println("Cancelando processo de transferencia.");
                        }
                }else{
                    System.out.println("Valor acima do limite diario.");
                    scanner.nextLine();
                }
                break;
            case 2:
                System.out.print("Insira sua chave Pix:");
                String chaveEmail = scanner.nextLine();

                System.out.println();

                System.out.print("Insira o valor que deseja transferir: R$");
                double valorTransEmail = scanner.nextDouble();
                scanner.nextLine();

                if(valorTransEmail <= 5000) {
                    System.out.printf("Deseja transferir R$%.2f? ", valorTransEmail);
                    String confirmacaoTransEmail = scanner.nextLine();
                    if (confirmacaoTransEmail.equals("sim")){
                        System.out.print("Insira sua senha:");
                        String leituraSenhaEmail = scanner.nextLine();
                        if (leituraSenhaEmail.equals(senha)){
                            double saldoMenosPixEmail = saldo - valorTransEmail;
                            System.out.println();
                            System.out.printf("""
                                              Foi feito uma transferencia para a chave: %s
                                              O valor transferido foi de : R$%.2f
                                              O saldo restante em sua conta é: R$%.2f""", chaveEmail,valorTransEmail,saldoMenosPixEmail);
                        } else{
                            System.out.println("Senha incorreta. Cancelando transferencia.");
                        }
                    }else{
                        System.out.println("Cancelando processo de transferencia.");
                    }
                }else{
                    System.out.println("Valor acima do limite diario.");
                    scanner.nextLine();
                }
                break;
            case 3:
                System.out.print("Insira sua chave Pix:");
                String chaveCelular = scanner.nextLine();

                System.out.println();

                System.out.print("Insira o valor que deseja transferir: R$");
                double valorTransCelular = scanner.nextDouble();
                scanner.nextLine();

                if(valorTransCelular <= 5000) {
                    System.out.printf("Deseja transferir R$%.2f? ", valorTransCelular);
                    String confirmacaoTransCelular = scanner.nextLine();
                    if (confirmacaoTransCelular.equals("sim")){
                        System.out.print("Insira sua senha:");
                        String leituraSenhaCelular = scanner.nextLine();
                        if (leituraSenhaCelular.equals(senha)){
                            double saldoMenosPixCelular = saldo - valorTransCelular;
                            System.out.println();
                            System.out.printf("""
                                              Foi feito uma transferencia para a chave: %s
                                              O valor transferido foi de : R$%.2f
                                              O saldo restante em sua conta é: R$%.2f""", chaveCelular,valorTransCelular,saldoMenosPixCelular );
                        } else{
                            System.out.println("Senha incorreta. Cancelando transferencia.");
                        }
                    }else{
                        System.out.println("Cancelando processo de transferencia.");
                    }
                }else{
                    System.out.println("Valor acima do limite diario.");
                    scanner.nextLine();
                }
                break;
            case 4:
                System.out.print("Insira sua chave Pix:");
                String chaveAle = scanner.nextLine();

                System.out.println();

                System.out.print("Insira o valor que deseja transferir: R$");
                double valorTransAle = scanner.nextDouble();
                scanner.nextLine();

                if(valorTransAle <= 5000) {
                    System.out.printf("Deseja transferir R$%.2f? ", valorTransAle);
                    String confirmacaoTransAle = scanner.nextLine();
                    if (confirmacaoTransAle.equals("sim")){
                        System.out.print("Insira sua senha:");
                        String leituraSenhaAle = scanner.nextLine();
                        if (leituraSenhaAle.equals(senha)){
                            double saldoMenosPixAle = saldo - valorTransAle;
                            System.out.println();
                            System.out.printf("""
                                              Foi feito uma transferencia para a chave: %s
                                              O valor transferido foi de : R$%.2f
                                              O saldo restante em sua conta é: R$%.2f""", chaveAle,valorTransAle,saldoMenosPixAle);
                        } else{
                            System.out.println("Senha incorreta. Cancelando transferencia.");
                        }
                    }else{
                        System.out.println("Cancelando processo de transferencia.");
                    }
                }else{
                    System.out.println("Valor acima do limite diario.");
                }
                break;
            default:
                System.out.println("Opção invalida.");
        }
        scanner.close();
    }
}
