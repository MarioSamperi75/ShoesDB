package se.nackademin;

import se.nackademin.model.Customer;

import java.sql.SQLException;
import java.util.Scanner;

public class Controller {

    Repository rep = new Repository();
    Customer customer;

    String model;
    int shoesId = 0;
    int orderId = 0;

    public Controller() throws SQLException {}

        public void login() {
            String lastname;
            String password;
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("Lastname: ");
                lastname = sc.nextLine().trim();
                System.out.println("Password: ");
                password = sc.nextLine().trim();

                customer = rep.checkpassword(lastname, password);
                System.out.println(customer.getId());
                if (customer != null)
                    break;
            }
        }


        public void showAllProducts() {
            System.out.println("All the products: ");
            rep.getAllProducts().forEach((k, v) -> v.print());
            System.out.println();
        }


        public void addItemInYourCart(String model, String color, String size ) {
            shoesId = rep.getOneProductID(model, color, size);
            if (shoesId!=0) {
                rep.addToCart(customer.getId(), orderId, shoesId);
                orderId = (rep.getLastOrdersID(customer.getId()));
            }
        }


        public void showAllProductsInYourCart() {
            System.out.println("Your cart: ");
            rep.getProductsInTheCart(customer.getId(), orderId).forEach(c -> c.print());
            System.out.println();
        }


        public void newOrder() {
            orderId = 0;
            System.out.println("New order - Your cart is empty.");
        }


    public void exit() {
        System.out.println("See you soon!");
        System.exit(0);
    }

/*


        orderId = (rep.getLastOrdersID(customer.getId()));
//
//
//
//        //show den aktuella cart
        System.out.println("Your cart: ");
        rep.getProductsInTheCart(customer.getId(), orderId).forEach(c -> c.print());
        System.out.println();



*/
}
