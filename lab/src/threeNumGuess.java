import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class threeNumGuess {
    public static void main(String[] args) {
        engine game = new engine();
    }
}

class engine {

    Random rd = new Random();
    int num1 = rd.nextInt(5);
    static int winCount = 0;

    engine() {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(num1);
        numList.add(num1 + 1);
        numList.add(num1 + 2);

        Scanner userin = new Scanner(System.in);
        while (winCount < 3000) {
            int input = userin.nextInt();
            if (numList.contains(input)) {

                System.out.println("hit");
                winCount += 1000;

            } else {
                System.out.println("miss");
            }
        }
        System.out.println("kill");
    }
}
