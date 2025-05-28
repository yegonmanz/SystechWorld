package selflearning;

public class nestedIfStatement {
    public static void main(String[]args) {
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 100;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are a Student and get a discount of 10%");
                System.out.println("You are a senior and have a discount of 20%");
                price *= 0.7;
            }
            else {
                System.out.println("You are a Student and get a discount of 10%");
                price *= 0.9;
            }
        }
        else {
            if (isSenior) {
                System.out.println("You are a Senior and have a discount of 20%");
                price *= 0.8;
            }
            else {
                System.out.println("You don't have any Discount");
                price *= 1;
            }

        }
        System.out.println("Total Price: " + "$" + price);
    }
}