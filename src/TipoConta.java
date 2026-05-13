public class TipoConta {
    public static void main(String [] args) {

        int idConta = 3;
        String categoriaConta = "";

        switch(idConta) {
            case 1:
                categoriaConta = "Conta Corrente.";
                break;
            case 2:
                categoriaConta = "Conta Poupança.";
                break;
            case 3:
                categoriaConta = "Somente para Investimentos";
                break;
            default:
                categoriaConta = "invalida.";
        }
        String mensagemConta = """
                               A conta que esta sendo acessada é: %s
                               """.formatted(categoriaConta);
        System.out.println(mensagemConta);
    }
}
