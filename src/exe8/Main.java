package exe8;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Faça um programa que leia N números reais e armazene-os num vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor
        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe a quantidade de números totais.");
        int n = sc.nextInt();

        double soma, media;
        double[] vect = new double[n];

        for (int i=0; i<vect.length; i++){
            System.out.println("Por favor insira o " + (i + 1) + "° número.");
            vect[i] = sc.nextDouble();
        }

        soma = 0;
        for (int i=0; i<vect.length; i++){
            soma = soma + vect[i];
        }

        media = soma / n;
        System.out.println("Valores = ");
        for (int i=0; i<vect.length; i++){
            System.out.printf("%.1f ", vect[i]);
        }

        System.out.printf("\nSoma = %.2f\n", soma);
        System.out.printf("\nMédia = %.2f\n", media);
        sc.close();
    }
}
