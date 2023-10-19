package entities;


public class Trabalho {

    public static String name;
    public static Double GrossSalary;
    public static Double Tax;

    public static Double NetSalary() {
        return GrossSalary - Tax;
    }

    public void IncreaseSalary(double percentage) {
        double increaseAmount = NetSalary() * (percentage / 100);
        GrossSalary += increaseAmount;
    }

}
