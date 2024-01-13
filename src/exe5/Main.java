package exe5;


import exe5.Model.Conta;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        /*Num banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular
        * da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Esse valor de depósito
        * inicial, entretanto, é opicional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir a
        * sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
        *
        * Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já o nome
        * do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
        *
        * Por fim, o saldo da conta não pode ser alterado livrimente. É preciso haver um mecanismo para proteger isso.
        * O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, o banco
        * cobra uma taxa de R$5,00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente para
        * realizar o saque e/ou pagar a taxa.
        *
        * Você deve fazer um programa que realize o cadastro de uma conta, dando opção para ser ou não informado
        * o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados
        * da conta após cada operação.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Estudante, por favor insira seus dados.");
        System.out.println("NOME: ");
        String titular = sc.nextLine();

        System.out.println(titular + ", pretende fazer um depósito agora? Sim (Y) Não (N)");
        String escolhaDeDeposito = sc.next();
        Conta conta;

        if (Objects.equals(escolhaDeDeposito, "N")){
            conta = new Conta(titular);
        } else {
            System.out.println("Por favor, informe o valor do depósito: ");
            double deposito = sc.nextDouble();
            conta = new Conta(titular, deposito);
        }

        System.out.println(conta);
        boolean loop = true;
        System.out.println("Estamos fazendo todas as configuraçãoes... Por favor, aguarde.");
        TimeUnit.SECONDS.sleep(3);

        do {
            System.out.println("---MENU---");
            System.out.println("1) Mudar meu nome.");
            System.out.println("2) Realizar depósito.");
            System.out.println("3) Realizar saque.");
            System.out.println("4) Fechar terminal e encerrar programa.");
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
                System.out.println("Por favor, informe o valor do saque: ");
                double saque = sc.nextDouble();
                conta.saque(saque);
                System.out.println(conta);
            } else if (escolhaMenu == 4) {
                loop = false;
            }
        } while (loop);
        sc.close();
    }
}
