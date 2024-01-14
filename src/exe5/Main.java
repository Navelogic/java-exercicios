package exe5;

import exe5.Model.Conta;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Conta> contas = new ArrayList<>();

        System.out.println("Estudante, por favor insira seus dados.");
        System.out.println("NOME: ");
        String titular = sc.nextLine();

        System.out.println(titular + ", pretende fazer um depósito agora? Sim (Y) Não (N)");
        String escolhaDeDeposito = sc.next();
        Conta conta;

        if (Objects.equals(escolhaDeDeposito, "N")) {
            conta = new Conta(titular);
        } else {
            System.out.println("Por favor, informe o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta = new Conta(titular, deposito);
        }

        contas.add(conta);

        System.out.println(conta);
        boolean loop = true;
        System.out.println("Estamos fazendo todas as configurações... Por favor, aguarde.");
        TimeUnit.SECONDS.sleep(3);

        do {
            System.out.println("---MENU---");
            System.out.println("1) Mudar meu nome.");
            System.out.println("2) Realizar depósito.");
            System.out.println("3) Realizar saque.");
            System.out.println("4) Exibir todas as transações.");
            System.out.println("5) Fechar terminal e encerrar programa.");
            int escolhaMenu = sc.nextInt();

            if (escolhaMenu == 1) {
                System.out.println("Qual seu novo nome?");
                sc.nextLine();
                titular = sc.nextLine();
                conta.setTitular(titular);
                System.out.println(conta);
            } else if (escolhaMenu == 2) {
                System.out.println("Por favor, informe o valor do depósito: ");
                double deposito = sc.nextDouble();
                conta.deposito(deposito);
                System.out.println(conta);
            } else if (escolhaMenu == 3) {
                if (conta.negativado) {
                    System.out.println("Você está negativado. Por favor, regularize seu débito.");
                } else {
                    System.out.println("Por favor, informe o valor do saque: ");
                    double saque = sc.nextDouble();
                    conta.saque(saque);
                    System.out.println(conta);
                }
            } else if (escolhaMenu == 4) {
                exibirTodasTransacoes(conta);
            } else if (escolhaMenu == 5) {
                loop = false;
            }
        } while (loop);

        sc.close();
    }

    private static void exibirTodasTransacoes(Conta conta) {
        System.out.println("\n--- EXIBINDO TODAS AS TRANSAÇÕES ---");
        conta.exibirExtrato();
    }
}
