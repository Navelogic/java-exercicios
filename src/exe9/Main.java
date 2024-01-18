package exe9;

import exe9.Model.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /* A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados
        * pelos números 0 a 9.
        *
        * Fazer um programa que inicie com todos os dez quartos vazios, depois leia uma quantidade N representando o
        * número de estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N
        * estudantes, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago.
        * Ao final, o seu programa deve imprimir um relatório de todas opupações do pensionato, por ordem de quarto. */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.println("Quantos quartos serão alugados?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Aluguel #" + (i + 1) + ":");
            System.out.println("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("E-mail: ");
            String email = sc.next();
            System.out.println("Quarto: ");
            int roomNumber = sc.nextInt();

            Rent rent = new Rent(name, email);
            vect[roomNumber] = rent;
        }
        System.out.println("Quartos alugados: ");
        for (int i = 0; i < 10; i++){
            if (vect[i] != null){
                System.out.println("" + i + " " + vect[i]);
            }
        }

        sc.close();
    }
}
