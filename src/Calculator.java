import java.util.Objects;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz : ");
        double sayi1 = scanner.nextDouble();

        System.out.print("2. Sayıyı giriniz : ");
        double sayi2 = scanner.nextDouble();

        System.out.println("Yapılacak işlemi giriniz : ");
        String islem = scanner.next();

        if (Objects.equals(islem, "+")){
            System.out.println("Sayıların toplamı : " + sum(sayi1,sayi2));;
        }else if (Objects.equals(islem, "-")){
            System.out.println("Sayıların farkı : " + sub(sayi1,sayi2));;
        }else if (Objects.equals(islem, "*")){
            System.out.println("Sayıların çarpımı : " + mul(sayi1,sayi2));;
        }else if (Objects.equals(islem, "/")){
            System.out.println("Sayıların bölümü : " + div(sayi1,sayi2));;
        }else {
            System.out.println("Hatalı giriş yaptınız.");
        }




    }
    public static double sum(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double mul(double a, double b){
        return a*b;
    }

    public static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Hatalı giriş yapıldı.");
            return 0;
        } else {
            return a / b;
        }


    }

}
