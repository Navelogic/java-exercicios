import Model.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*Fazer um programa para ler os valores da largura e altura
        * de um retângulo. Em seguida, mostrar na tela o valor de sua área,
        * perímetro e diagonal.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Qual é a Altura (h) e Base (b)?");
        retangulo.h = sc.nextDouble();
        retangulo.b = sc.nextDouble();

        System.out.printf("Área = %.2f%n", retangulo.area());
        System.out.printf("Perímetro = %.2f%n", retangulo.perimetro());
        System.out.printf("Diagonal = %.2f%n", retangulo.diagonal());

        sc.close();
    }
}