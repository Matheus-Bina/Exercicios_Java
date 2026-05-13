public class Rendimento {
    public static void main(String[]args){

        double saldo = 245.58;
        double rendimento = ((saldo * 102) / 100) - saldo;
        double calculoRend = rendimento + saldo;

        String mensagemRend = """
                              Seu saldo antes do rendimento era de: R$ %.2f
                              Você teve o rendimento de ao mês: R$ %.2f
                              Logo somando com seu saldo anterior, você tem: R$ %.2f
                              """.formatted(saldo, rendimento, calculoRend);
        System.out.println(mensagemRend);

    }
}
