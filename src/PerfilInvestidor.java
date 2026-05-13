public class PerfilInvestidor {
    public static void main(String[] args){

        int idade = 30;
        double patrimonio = 30000.00;

        if (idade < 25 && patrimonio < 10000.00) {
            System.out.println("Investidor iniciante!");
        } else if(idade >= 25 && idade < 50 || patrimonio <= 50000.00) {
            System.out.println("investidor intermediario");
        }else {
            System.out.println("Investidor experiente");
        }


    }
}
