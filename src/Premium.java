import java.util.Scanner;

public class Premium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите стаж работы");
        int age = sc.nextInt();
        System.out.println("Введите зарплату");
        double prize = sc.nextDouble();

        if (age > 0 && age < 5) {
            prize = prize * 0.1;
            System.out.println("Сумма премии 10% = " +prize);}
        if (age >= 5 && age < 10) {
            prize = prize * 0.15;
            System.out.println("Сумма премии 15% = " +prize);
        }
        if (age >= 10 && age < 15) {
            prize = prize * 0.25;
            System.out.println("Сумма премии 25% = " + prize);
        }
        if (age >= 15 && age < 20) {
            prize = prize * 0.35;
            System.out.println("Сумма премии 35% = " + prize);
        }
        if (age >= 20 && age < 25) {
            prize = prize * 0.45;
            System.out.println("Сумма премии 45% = " +prize);
        }
        if (age >= 25) {
            prize = prize * 0.5;
            System.out.println("Сумма премии 50% = " +prize);
        }
        }
    }

