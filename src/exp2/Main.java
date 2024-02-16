package exp2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Criando o padrão Brasileiro para datas.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua data de nascimento (dd/MM/yyyy): ");
        String dataUser = sc.nextLine();

        Date dataNascimento = sdf.parse(dataUser);
        Calendar calNascimento = Calendar.getInstance();
        calNascimento.setTime(dataNascimento);

        // Obtém o ano, mês e dia de nascimento do usuário
        int anoNascimento = calNascimento.get(Calendar.YEAR);
        int mesNascimento = calNascimento.get(Calendar.MONTH) + 1; // Mês começa do zero
        int diaNascimento = calNascimento.get(Calendar.DAY_OF_MONTH);

        // Obtém o ano, mês e dia atual
        Calendar calAtual = Calendar.getInstance();
        int anoAtual = calAtual.get(Calendar.YEAR);
        int mesAtual = calAtual.get(Calendar.MONTH) + 1;
        int diaAtual = calAtual.get(Calendar.DAY_OF_MONTH);

        // Calcula a idade do usuário
        int idade = anoAtual - anoNascimento;
        if (mesAtual < mesNascimento || (mesAtual == mesNascimento && diaAtual < diaNascimento)) {
            idade--; // Ainda não completou o aniversário deste ano
        }

        System.out.println("Sua idade é: " + idade + " anos");

        // Calcula o signo do usuário
        String[] signos = {
                "Capricórnio", "Aquário", "Peixes", "Áries", "Touro", "Gêmeos",
                "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio"
        };

        int diaMes = mesNascimento * 100 + diaNascimento;
        String signo = (diaMes >= 321 && diaMes <= 419) ? signos[3] :
                (diaMes >= 420 && diaMes <= 520) ? signos[4] :
                        (diaMes >= 521 && diaMes <= 620) ? signos[5] :
                                (diaMes >= 621 && diaMes <= 722) ? signos[6] :
                                        (diaMes >= 723 && diaMes <= 822) ? signos[7] :
                                                (diaMes >= 823 && diaMes <= 922) ? signos[8] :
                                                        (diaMes >= 923 && diaMes <= 1022) ? signos[9] :
                                                                (diaMes >= 1023 && diaMes <= 1121) ? signos[10] :
                                                                        (diaMes >= 1122 && diaMes <= 1221) ? signos[11] :
                                                                                signos[0];

        System.out.println("Seu signo é: " + signo);

        sc.close();


    }
}
