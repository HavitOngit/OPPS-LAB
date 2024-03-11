import java.util.Random;

public class pac7 {

    public static void main(String[] args) throws Exception {
        int i = 0;
        while (i < 10) {
            RandomString Rdser = new RandomString();
            System.out.println(Rdser.GetString() + "-" + Rdser.GetNumber() + "\n");
            i++;
        }
    }

}

/**
 * RandomString
 */
class RandomString {
    String latter = "";

    String GetString() {
        for (int i = 0; i < 3; i++) {
            latter = latter + GetChars();
        }

        return latter;
    }

    char GetChars() {
        Random rdObj = new Random();
        char one = (char) ('a' + rdObj.nextInt(26));
        return one;
    }

    Number GetNumber() {
        Random rd = new Random();
        Number mynum = (int) (rd.nextInt(100) + rd.nextInt(900));
        return mynum;
    }
}