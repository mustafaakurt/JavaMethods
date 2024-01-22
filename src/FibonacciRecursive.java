import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        int adet = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaçıncı adıma kadar gelinmesini istiyorsunuz? : ");
        adet = scanner.nextInt();

        for (int a = 1; a <= adet; a++ ){
            System.out.print(fibonaccirecursive(a) + " ");
        }
        scanner.close();
    }
    public static int fibonaccirecursive(int i){
        if (i<=2){
            return 1;
        }
        else {
            return (fibonaccirecursive(i-2)+fibonaccirecursive(i-1));
        }
    }
}
