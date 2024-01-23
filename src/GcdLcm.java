import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz : ");
        int number1 = scanner.nextInt();
        System.out.print("2. sayıyı giriniz : ");
        int number2 = scanner.nextInt();

        System.out.println(number1 + " ve " + number2 + " sayılarının EBOB'u: " + gcd(number1,number2));
        System.out.println(number1 + " ve " + number2 + " sayılarının EKOK'u: " + lcm(number1,number2));
    }

    public static int gcd(int a, int b){

        int min = Math.min(a,b);
        int gcd = 1;

        for (int i = 2; i <= min; i++){
            if (a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }

    public static int lcm(int a, int b){
        int abs = Math.abs(a*b);
        return abs/gcd(a,b);
    }

}
