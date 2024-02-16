package exp1;

import java.time.Duration;
import java.time.Instant;

public class Main {
    public static void main(String[]args) {
        // Instante inicial (Criação de Recurso)
        // Segue padrão GMT
        Instant criacao = Instant.now();
        System.out.println("Instante inicial: " + criacao);

        // Loop para calcular o tempo decorrido
        while (true) {
            Instant agora = Instant.now();
            Duration duracao = Duration.between(criacao, agora);

            // Converter a duração em dias, meses e anos
            long segundos = duracao.getSeconds();
            long minutos = segundos / 60;
            long horas = minutos / 60;
            long dias = horas / 24;
            long meses = dias / 30;
            long anos = meses / 12;

            String decorrido = "";

            if (anos > 0) {
                decorrido = "Há " + anos + (anos == 1 ? " ano" : " anos");
            } else if (meses > 0) {
                decorrido = "Há " + meses + (meses == 1 ? " mês" : " meses");
            } else if (dias > 0) {
                decorrido = "Há " + dias + (dias == 1 ? " dia" : " dias");
            } else if (horas > 0) {
                decorrido = "Há " + horas + (horas == 1 ? " hora" : " horas");
            } else if (minutos > 0) {
                decorrido = "Há " + minutos + (minutos == 1 ? " minuto" : " minutos");
            } else {
                decorrido = "Agora";
            }

            System.out.println(decorrido);

            // Aguarda um dois antes de verificar novamente.
            // Simulando uma req
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
};
