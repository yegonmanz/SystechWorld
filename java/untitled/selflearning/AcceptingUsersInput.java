package selflearning;

import java.util.Scanner;
import java.util.Random;

public class AcceptingUsersInput {
    public static void main(String[] args){
//        Scanner scanner= new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = scanner.nextLine();
//
//        System.out.print("Enter your age: ");
//                int age= scanner.nextInt();
//
//        System.out.print("The price of Rice :");
//             double price= scanner.nextDouble();
//        System.out.println("Are you a student? (true/false): ");
//        boolean isStudent=scanner.nextBoolean();
//
//        System.out.println("Hello " + name );
//        System.out.println("Your age is "+ age + " Your purchaced Rice of $ " + price);
//
//        if(isStudent){
//            System.out.println("You are enrolled as student");
//        }
//        else {
//            System.out.println("You are not enrolled as student");
//        }

        // Calculate the area of a rectangle
//        double width=0;
//        double height=0;
//        double area=0;
//
//        Scanner scanner= new Scanner(System.in);
//        System.out.println("Enter the width of the rectangle: ");
//        width=scanner.nextDouble();
//        System.out.println("Enter the height of the rectangle: ");
//        height=scanner.nextDouble();
//        area=width*height;
//        System.out.println("The area of the rectangle is: "+area +"cm");
//

     //MAD LIPS GAME
//        Scanner scanner= new Scanner(System.in);
//        String adjective1;
//        String noun1;
//        String adjective2;
//        String verb1;
//        String adjective3;
//
//        System.out.println("Enter an Adjective:(description): ");
//        adjective1=scanner.nextLine();
//        System.out.println("Enter a Noun:(person / animal): ");
//        noun1=scanner.nextLine();
//        System.out.println("Enter an Adjective:(description ): ");
//        adjective2=scanner.nextLine();
//        System.out.println("Enter a Verb ending with -ing:(action): ");
//        verb1=scanner.nextLine();
//        System.out.println("Enter an Adjective:(description): ");
//        adjective3=scanner.nextLine();
//
//
//        System.out.println("\nToday I went to a " +adjective1 +" zoo.");
//        System.out.println("In an exhibit, I saw a " +noun1 +".");
//        System.out.println(noun1 +" was " +adjective2 +" and " +verb1 +"!");
//        System.out.println("I was "+ adjective3 +" !");

        //BASIC USERS INPUT
//        Scanner scanner=new Scanner(System.in);
//
//        String item;
//        double price;
//        int quantity;
//        char currency ='$';
//        double total;
//
//        System.out.print("What item are you purchasing? ");
//        item=scanner.nextLine();
//
//        System.out.println("Enter the price of the item: ");
//        price=scanner.nextDouble();
//
//        System.out.println("How many would you like to purchase? ");
//        quantity= scanner.nextInt();
//
//        total=price*quantity;
//        System.out.println("You bought "+ item +" for "+currency+total);
//
//        scanner.close();

        //IF STATEMENTS :Performs a line of code if a condition is TRUE

//        Scanner scanner=new Scanner(System.in);
//
//        String name;
//        double age;
//        boolean isLecturer;
//
//
//        System.out.println("Enter your name: ");
//        name=scanner.nextLine();
//
//        System.out.println("Enter your age: ");
//        age=scanner.nextDouble();
//
//        System.out.println("Are you a Lecturer? (true/false): ");
//        isLecturer=scanner.nextBoolean();
//
//        //GROUP 1
//     if(name.isEmpty()){
//         System.out.println("You have not entered a name");
//     }
//     else {
//         System.out.println("Hello " + name);
//     }
//
//        //GROUP 2
//        if(age>=18){
//            System.out.println("You can vote");
//        } else if (age>=65) {
//            System.out.println("You can drive");
//
//        } else if(age <= 0){
//            System.out.println("Invalid age");
//        }
//        else{
//            System.out.println("You can not vote");
//        }
//        // THE OUTPUT WILL BE (YOU CAN VOTE) this is because it will check from the first sttemnt if it's true first
//
//        //GROUP 3
//        if(isLecturer){
//            System.out.println("You can teach");
//        } else {
//            System.out.println("You can not teach");
//        }
//
//        scanner.close();

        //RANDOM

//        Random random= new Random();
//
//        int number1;
//        int number2;
//        int number3;
//
//        number1 =random.nextInt(1, 10);
//        number2 =random.nextInt(1, 6);
//        number3 =random.nextInt(1, 20);
//
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);

        //COIN FLIPPING
//        Random random= new Random();
//        boolean isHeads=random.nextBoolean();
//        if(isHeads){
//            System.out.println("You have flipped a coin and it is heads");
//        }
//        else{
//            System.out.println("You have flipped a coin and it is tails");
//        }


        //MATH METHODS & CONSTANTS
//        System.out.println(Math.PI);
//        System.out.println(Math.E);

//        double result;
//
//        result=Math.pow(2, 3);
//        result=Math.sqrt(9);
//        result=Math.abs(-9);
//        result=Math.ceil(9.1);
//        result=Math.floor(9.1);
//        result=Math.round(9.1);
//        result=Math.max(9, 10);
//        result=Math.min(9, 10);
//        result=Math.random();
//        result=Math.round(Math.random()*100);
//        result=Math.pow(2, 3);
//
//
//        System.out.println(result);
        //HYPOTENUSE C=Math.sqrt(a*b)

//

        //SPHERE calculation
//
//        double radius;
//        double volume;
//        double surfaceArea;
//        double sphereVolume;
//        double sphereSurfaceArea;
//
//        System.out.println("Enter the radius of the sphere: ");
//        radius=new Scanner(System.in).nextDouble();
//
//        sphereVolume=4.0/3.0*Math.PI*Math.pow(radius, 3);
//        sphereSurfaceArea=4.0*Math.PI*Math.pow(radius, 2);
//
//        System.out.println("The volume of the sphere is: "+sphereVolume);
//        System.out.println("The surface area of the sphere is: "+sphereSurfaceArea);
//        //END OF SPHERE

    }
}
