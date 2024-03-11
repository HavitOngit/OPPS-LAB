import java.util.Random;
import java.util.Scanner;

public class pac6 {
    public static void main(String[] args) throws Exception {

        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("Enter Any Value:");
        String UserInput = ScannerObj.nextLine();

        String vowels = "aeiou";
        Boolean check = vowels.contains(UserInput);

        if (check) {
            System.out.println(UserInput + " is  Vowel");
        } else {
            System.out.println(UserInput + " is  Constant");
        }
    }
}
