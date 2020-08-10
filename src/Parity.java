import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        long num = sc.nextLong();

        if (num % 2 == 0) {
            System.out.println("Число кратно двум");}
        else {
            System.out.println("Число не кратно двум");
        }
    }

}
