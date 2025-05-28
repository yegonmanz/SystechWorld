package products;

import java.util.Scanner;

public class UserImpl implements UserI {


    @Override
    public User createUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String name = scanner.nextLine();
        System.out.println("Please enter IdNumber");
        String idNumber = scanner.nextLine();
        System.out.println("Enter Email");
        String email = scanner.nextLine();
        System.out.println("Enter Password");
        String password = scanner.nextLine();


        User user = new User();
        user.setName(name);
        user.setEmail(email);
        user.setIdNumber(idNumber);
        

        return user;

    }

    @Override
    public Product puchaseProduct(Product product, User user) {
        System.out.println("Welcome " + user.getName() + " purchased " + product.getName() + " for $" + product.getPrice() );

        return product;
    }
}