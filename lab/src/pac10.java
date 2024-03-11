import java.util.Scanner;

public class pac10 {
    public static void main(String[] args) {
        Logic l = new Logic();
        System.out.print(l.output().length);

    }
}

/**
 * Logic
 */
class Logic {
    String[] userInput;

    public Logic() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers separated by comma(,):");
        String input = sc.nextLine();
        userInput = input.split(",");

    }

    String[] output() {

        return userInput;
    }

}
