import java.util.Scanner;

public class Investimentos {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("""
                           1 - Conservador
                           2 - Moderado
                           3 - Arrojado
                           Digite qual o seu perfil: """);
        int perfil = scanner.nextInt();
        System.out.println();

        switch(perfil) {
            case 1: System.out.print("""
                                        Com base no perfil escolhido te indicamos a Poupança, ela rende 0,5% ao mês.
                                        Insira um valor para fazermos uma simulação: R$ """);
                double valorInvestPou = scanner.nextDouble();
                    if(valorInvestPou < 100){
                        System.out.println();
                        System.out.println("O valor minimo para investimento é R$100,00");
                    }else {
                        double calculoPou = (valorInvestPou * 0.5) / 100;
                        double investMaisCalculoPou = valorInvestPou + calculoPou;
                        System.out.printf("""
                                Com base na nossa simulação com o valor desejado para investimento.
                                Seu rendimento ao mês seria de: R$%.2f
                                Totalizando: R$%.2f
                                """, calculoPou,investMaisCalculoPou);
                    }
            break;
            case 2:System.out.print("""
                                        Com base no perfil escolhido te indicamos o CDB, ele rende 1,0% ao mês.
                                        Insira um valor para fazermos uma simulação: R$ """);
                double valorInvestCdb = scanner.nextDouble();
                if(valorInvestCdb < 100){
                    System.out.println("Valor mínimo para investimento é R$100,00");
                }else{
                    double calculoCdb = (valorInvestCdb) / 100;
                    double investMaisCalculoCdb = valorInvestCdb + calculoCdb;
                    System.out.printf("""
                                Com base na nossa simulação com o valor desejado para investimento.
                                Seu rendimento ao mês seria de: R$%.2f
                                Totalizando: R$%.2f
                                """, calculoCdb,investMaisCalculoCdb);
                }
            break;
            case 3:
                System.out.print("""
                                        Com base no perfil escolhido te indicamos o Tesouro Direto, ele rende 1,5% ao mês.
                                        Insira um valor para fazermos uma simulação: R$ """);
                double valorInvestTesouro = scanner.nextDouble();
                if(valorInvestTesouro < 100){
                    System.out.println("Valor mínimo para investimento é R$100,00");
                }else{
                    double calculoTesouro = (valorInvestTesouro * 1.5) / 100;
                    double investMaisCalculoTesouro = valorInvestTesouro + calculoTesouro;
                    System.out.printf("""
                                Com base na nossa simulação com o valor desejado para investimento.
                                Seu rendimento ao mês seria de: R$%.2f
                                Totalizando: R$%.2f
                                """, calculoTesouro,investMaisCalculoTesouro);
                }
            break;
            default:
                System.out.println("Opção invalida.");
        }

        scanner.close();
    }
}
