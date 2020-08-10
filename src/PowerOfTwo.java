import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        if ((num & (num - 1)) == 0 ){
            System.out.println("Число является степенью 2");}
         else {
            System.out.println("Число не является степенью 2");
        }
    }
}

