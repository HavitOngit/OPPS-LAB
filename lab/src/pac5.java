import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

public class pac5 {
    public static void main(String[] args) {

        Integer user_input[] = new Integer[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            user_input[i] = sc.nextInt();
        }
        Arrays.sort(user_input);
        Arrays.sort(user_input, Collections.reverseOrder());
        for (int i : user_input) {
            System.out.print(i + " ");
        }

    }

}
