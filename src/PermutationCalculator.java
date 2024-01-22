import java.util.Scanner;

public class PermutationCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Permütasyonu hesaplanacak n değerini giriniz: ");
        int number = scanner.nextInt();
        System.out.print("Permütasyonu hesaplanacak r değerini giriniz: ");
        int number2 = scanner.nextInt();

        System.out.println(permutation(number,number2));

        //System.out.println(factorial(5));
        //System.out.println(permutation(3,2));
    }

    public static int factorial(int number){
        int result = 1;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                result = result * i;
            }
            return result;
        }
       return 0;
    }

    public static int permutation(int n, int r){
        int result = 0;
        result = factorial(n)/factorial(n-r);

        return result;
    }
}
