import java.util.Scanner;

public class ZipZapPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number N: ");
        int N = scanner.nextInt();

        // Loop from 1 to N and apply the ZipZap rules
        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("ZipZap");
            } else if (i % 3 == 0) {
                System.out.println("Zip");
            } else if (i % 5 == 0) {
                System.out.println("Zap");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}