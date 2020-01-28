package se.nackademin;

import java.sql.SQLException;
import java.util.Scanner;

public class View {
    Scanner scanner = new Scanner(System.in);
    Controller controller = new Controller();

    public View() throws SQLException {
    }

    //METHODS
    public void start() {
        System.out.println();
        System.out.println("                    *****Shoes Database*****");
        controller.login();
    }


    public void menu (){
        while (true) {
            System.out.println();
            System.out.println("Show all products(1) - Add product in your cart(2) - Show all products in your cart(3) - New order(4) - Exit(5)");
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    controller.showAllProducts();
                    break;
                case "2":
                    System.out.print("Add model: ");
                    String model = scanner.nextLine().trim();
                    System.out.print("Add color: ");
                    String color = scanner.nextLine().trim();
                    System.out.print("Add size: ");
                    String size = scanner.nextLine().trim();

                    controller.addItemInYourCart(model, color, size);
                    break;
               case "3":
                    controller.showAllProductsInYourCart();
                    break;
               case "4":
                    controller.newOrder();
                    break;
                case "5":
                    controller.exit();
                    break;
                default:
                    System.out.println("Input error. Retry");
            }
        }
    }



    public static void main(String[] args) throws SQLException {
        View view = new View();
        view.start();

        view.menu();
    }
}



//quando si scrive "" nel modello


//visa flera av samma