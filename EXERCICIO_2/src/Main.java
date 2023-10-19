import entities.Trabalho;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Trabalho trabalho = new Trabalho();
        System.out.println("Name: ");
        Trabalho.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        Trabalho.GrossSalary = sc.nextDouble();
        System.out.println("Tax: ");
        Trabalho.Tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " +  Trabalho.name +  ", " + Trabalho.NetSalary());

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        trabalho.IncreaseSalary(percentage);
        System.out.println("Updated data: " + Trabalho.name + ", " + Trabalho.NetSalary());

        sc.close();

    }
}
