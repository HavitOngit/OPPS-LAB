import java.util.Scanner;

public class pac8 {
    public static void main(String[] args) throws Exception {
        Scanner ScannerObj = new Scanner(System.in);
        System.out.println("Enter Number:");

        int UserInput = ScannerObj.nextInt();
        int i = 2;
        while (i < UserInput) {
            if ((UserInput % i) == 0) {
                System.out.println(i + ",");
            }
            i++;

        }
    }
}
