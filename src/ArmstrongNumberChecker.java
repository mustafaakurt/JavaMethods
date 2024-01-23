import java.util.ArrayList;
import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Armstrong sayı olup olmadığı kontrol edilecek sayıyı giriniz: ");
        int number = scanner.nextInt();

        if (isArmstrong(number) == true){
            System.out.println("Girilen sayı ARMSTRONG");
        }else {
            System.out.println("Girilen sayı ARMSTRONG DEĞİL");
        }

    }

    public static boolean isArmstrong(int number){
        int sum = 0;
        int temp = number;
        int digitCount = String.valueOf(number).length();

        while (temp != 0){
            int digit = temp % 10;
            sum += (int) Math.pow(digit,digitCount);
            temp = temp / 10;
        }

        return sum == number;

    }
}
