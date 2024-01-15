package exe6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Fazer um programa para ler um número inteiro N e os dados (nome e preço) de N produtos. Armazene os N
        * produtos num vetor. Em seguida, mostrar o preço médio dos produtos.*/
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, informe a quantidade de produtos.");
        int n = sc.nextInt();

        String[] vectNome = new String[n];
        double[] vectPreco = new double[n];

        for (int i=0; i<n; i++){
            System.out.println("Por favor, insira os nome do produto: " + (i + 1));
            vectNome[i] = sc.next();

            System.out.println("Agora o preço do produto: " + (i + 1));
            vectPreco[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<n; i++){
            soma += vectPreco[i];
        }

        double media = soma / n;
        System.out.printf("A média do preço dos produtos é: R$%.2f%n", media);

        sc.close();
    }
}
