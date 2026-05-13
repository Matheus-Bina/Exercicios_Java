import java.util.Scanner;
public class DiasBancoAberto {
    public static void main(String[] args) {

        int dias = 7;
        String diaSemana = "";
        String abertoOuFechado = "";
        int calculoDia = dias % 7;

        switch (calculoDia) {
            case 1:
                diaSemana = "Domingo";
                abertoOuFechado = "fechado";
                break;
            case 2:
                diaSemana = "Segunda";
                abertoOuFechado = "Aberto até as 17!";
                break;
            case 3:
                diaSemana = "Terça";
                abertoOuFechado = "Aberto até as 17!";
                break;
            case 4:
                diaSemana = "Quarta";
                abertoOuFechado = "Aberto até as 17!";
                break;
            case 5:
                diaSemana = "Quinta";
                abertoOuFechado = "Aberto até as 17!";
                break;
            case 6:
                diaSemana = "Sexta";
                abertoOuFechado = "Aberto até as 17!";
                break;
            case 0:
                diaSemana = "Sabado";
                abertoOuFechado = "fechado";
                break;
            default:
                diaSemana = "Dia invalido";
                break;
        }

        String exibirDia = """
                           No dia %d que cai em uma %s, o banco vai estar %s.
                           """.formatted(dias, diaSemana, abertoOuFechado);

        if (dias == calculoDia) {
            System.out.println(exibirDia);
        } else {
            System.out.println("Dia invalido");
        }

    }
}
