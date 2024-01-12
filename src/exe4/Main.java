package exe4;

import exe4.Util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado por uma pessoa
        * em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a pessoa terá
        * que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser responsável
        * pelos cálculos. Use Membros estáticos.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o preço do dólar?");
        double cotacao = sc.nextDouble();

        System.out.println("Quantos dólares serão comprados?");
        double quantidade = sc.nextInt();


        double totalReais = CurrencyConverter.converterParaReais(quantidade, cotacao);
        System.out.printf("Quantidade a ser paga em reais: R$ %.2f%n", totalReais);

        sc.close();
    }
}
