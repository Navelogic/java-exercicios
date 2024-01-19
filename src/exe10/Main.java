package exe10;

import exe10.Util.Invert;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* Escreva um programa que solicita um número inteiro para o utilizador e imprime na sáida com os digitos
        invertidos. Por exemplo, se o número digitado for 98765, a saída deve ser 56789.

        Este é um exercicio intermediario, porque precisará usar as suas habilidade em lógica. É possivel fazer isso
        apenas com um ‘loop’ e cálculos matemáticos. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Invert invert = new Invert();

        System.out.println("Por favor, digite um número interio:");
        Integer i = sc.nextInt();
        System.out.println("Número invertido: " + invert.calc(i));

        sc.close();
    }
}
