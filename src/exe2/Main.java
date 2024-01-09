package exe2;

import exe2.Model.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        /*Fazer um programa para ler os dados um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os
        * dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário com base em uma
        * porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do
        * funcionário.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Nome:");
        employee.name = sc.nextLine();

        System.out.println("Salário Bruto:");
        employee.grossSalary = sc.nextDouble();

        System.out.println("Imposto:");
        employee.tax = sc.nextDouble();

        System.out.println("Empregado: " + employee);

        System.out.println("Qual a porcentagem para o novo salário?");
        double porcentagem = sc.nextDouble();
        employee.increaseSalary(porcentagem);

        System.out.println("Empregado: " + employee);

        sc.close();
    }
}
