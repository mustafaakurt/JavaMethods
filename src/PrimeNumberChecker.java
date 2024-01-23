import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Asallığını kontrol etmek istediğiniz sayıyı giriniz : ");
        int number = scanner.nextInt();

        if (isPrime(number) == true){
            System.out.println("Girilen sayı ASAL");
        }else {
            System.out.println("Girilen sayı ASAL DEĞİL");
        }
    }

    public static boolean isPrime(int number){

        if (number <= 1){
            return false;
        }

        if (number == 2 || number == 3){
            return true;
        }

        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(number); i += 2){
            if (number % 2 == 0){
                return false;
            }
        }
        return true;
    }
}
