import java.util.Random;
import java.util.Scanner;

public class guessGame {

    public static void main(String[] args) {

        while (true) {
            Player p = new Player(1);
            Player p2 = new Player(2);
            Player p3 = new Player(3);

        }
    }

}

class Player {
    static boolean isover = false;
    static boolean iswinner = false;

    static int current = setCurrent();

    Player(int playerNum) {
        if (!isover) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Player(" + playerNum + ") \s4" + "Enter a number between 1 and 10:");
            int number = sc.nextInt();

            if (current == number) {
                System.out.println("Player " + playerNum + " wins!");
                iswinner = true;

                NextRound();

                current = setCurrent();
            }
        }
    }

    static int setCurrent() {
        Random rd = new Random();
        int mynum = (int) (rd.nextInt(10));
        return mynum;
    }

    void NextRound() {
        System.out.println("Want to play again? (y/n)");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if (answer.equals("n")) {
            System.out.println("Thanks For Playing!");
            isover = true;
            System.exit(0);
        } else {
            System.out.println("Next Round Started!");
        }
    }

}