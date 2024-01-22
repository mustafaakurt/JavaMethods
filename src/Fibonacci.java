import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int adet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaçıncı adıma kadar gelinmesini istiyorsunuz? : ");
        adet = scanner.nextInt();

        fibbonacci(adet);
        scanner.close();
    }

    public static void fibbonacci(int adet){
        int a = 1;
        int b = 1;
        int temp=0;
        System.out.println(a);
        for (int i=0; i < adet-1; i++){
            System.out.println(a);
            temp = a;
            a= a+b;
            b= temp;
        }


    }
}
