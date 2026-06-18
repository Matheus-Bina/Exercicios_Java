import java.util.Scanner;

public class SimuladorMetaEconomia {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        int maxMeses = 24;
        double rendMensal = 0.005;
        double saldo = 0;

        System.out.println("Bem-vindo ao Meta Economia.");

        System.out.print("Insira um valor que deseja alcançar: R$");
        double meta = scanner.nextDouble();

        if (meta > 0){
            System.out.print("Insira em quantos meses deseja atingir esta meta:");
            int metaMes = scanner.nextInt();
            if (metaMes <= 24){
                System.out.print("Insira o valor que deseja depositar este mês:R$");
                double depoMensal = scanner.nextDouble();

                for (int repMes = 1; repMes <= maxMeses; repMes++){
                   double calculoRend = saldo * rendMensal;
                   saldo += depoMensal + calculoRend;
                   System.out.println("""
                                      Seu deposito foi de: R$%.2f
                                      Estamos no mês :%d
                                      Quanto rendeu este mês: %.2f
                                      Valor total acumulado: R$%.2f""".formatted(depoMensal,repMes,calculoRend,saldo));
                   if (saldo >= meta){
                       break;
                   }
               }
            }else{
                System.out.println("Limite de meses acima do permitido");
            }
        }else{
            System.out.println("Valor invalido");
        }
        scanner.close();
    }
}
