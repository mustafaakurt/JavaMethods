import java.util.Scanner;

public class PalindromChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kelimeyi girin: ");
        String string = scanner.nextLine();
        isPalindrome(string);

        System.out.println(isPalindrome(string));

    }

    public static boolean isPalindrome(String string){
        int a =string.length();
        for (int i =0; i < a; i++){
            if (string.charAt(i) == string.charAt(a-1)){
                i++;
                a--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}
