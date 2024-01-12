package exe4;

import exe4.Model.Combustivel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /*Ter dois tipos de combustivel (gasolina e etanol), setar informações de preço, gasto médio e descobrir com qual
    * das duas teremos mais gasto. */
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Combustivel gasolina = new Combustivel();
        Combustivel etanol = new Combustivel();

        System.out.println("Informe o preço da GASOLINA:");
        gasolina.setPreco(sc.nextDouble());

        System.out.println("Informe o preço do ETANOL:");
        etanol.setPreco(sc.nextDouble());

        gasolina.setGastoMedio(12);
        etanol.setGastoMedio(16);

        System.out.println("Informe a distância em KM:");
        int km = sc.nextInt();

        if (gasolina.quantiaGasta(km) > etanol.quantiaGasta(km)){
            System.out.println("A opção que gasta menos combustivel é: ETANOL");
        } else {
            System.out.println("A opção que gasta menos combustivel é: GASOLINA");
        }

        sc.close();
    }
}
