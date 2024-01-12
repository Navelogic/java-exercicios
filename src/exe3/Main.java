package exe3;

import exe3.Model.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos tês trimestres do ano
        * (primero trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno
        * no ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
        * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
        * resolver este problema.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student estudante = new Student();

        estudante.setNome(sc.nextLine());
        estudante.setPrimeiroTrimestre(sc.nextDouble());
        estudante.setSegundoTrimestre(sc.nextDouble());
        estudante.setTerceiroTrimestre(sc.nextDouble());

        System.out.printf("Grade Final: %.2f%n", estudante.somatorio());

        if (estudante.somatorio() < 60){
            System.out.println("REPROVADO");
            System.out.printf("Faltando: %.2f pontos%n", estudante.pontosFaltantes());
            estudante.setAprovado(false);
        } else {
            System.out.println("Aprovado!");
            estudante.setAprovado(true);
        }

    }
}
