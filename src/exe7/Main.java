package exe7;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os num vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe a quantidade de números totais.");
        int n = sc.nextInt();

        double[] vect = new double[n];



        for (int i=0; i<vect.length; i++){
            System.out.println("Por favor insira o " + (i + 1) + "° número.");
            vect[i] = sc.nextDouble();
        }

        System.out.println("Eis os números negativos");
        for (int i=0; i<vect.length; i++){
            if (vect[i] < 0){
                System.out.println(vect[i]);
            }
        }

        sc.close();
    }
}
