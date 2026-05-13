public class Saldo {
    public static void main (String[] args){

        double saldo = 150.00;
        double valorSaque = 150.00;
        double calculoResto = (saldo - valorSaque);

        if (saldo > valorSaque) {
            String mensagemResto = ("""
                                    Saque feito com sucesso!
                                    Ainda resta R$%.2f em sua conta
                                    """).formatted(calculoResto);
            System.out.println(mensagemResto);
        } else if (saldo < valorSaque) {
            System.out.println("Saque acima do Saldo!");
        } else if (valorSaque == saldo) {
            System.out.println("Necessario senha para seguir com este saque.");
        }
    }
}

