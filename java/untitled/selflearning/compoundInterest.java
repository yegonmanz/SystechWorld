package selflearning;

import java.util.Scanner;
public class compoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal, rate, amount;
        int timesCompounded,years;

        System.out.println("Enter principal amount: ");
        principal=scanner.nextDouble();

        System.out.println("Enter the rate of interest (in %): ");
        rate=scanner.nextDouble();

        System.out.println("Enter the number of times the interest is compounded per year: ");
        timesCompounded=scanner.nextInt();

        System.out.println("Enter the number of years: ");
        years=scanner.nextInt();

        amount=principal*Math.pow(1+rate/timesCompounded,(years*timesCompounded));
        System.out.printf("The total amount after %d years is $%.2f",years , amount);

        scanner.close();
    }
}
