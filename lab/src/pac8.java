import java.util.Scanner;

public class pac8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        for (int i = 2; i <= Num; i++) {
            while (Num % i == 0) {
                System.out.print(i + " ");
                Num = Num / i;
            }
        }
        sc.close();
    }
}