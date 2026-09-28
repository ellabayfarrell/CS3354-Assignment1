import java.util.Scanner;

public class GroceryManagement {

    public static void main(String[] args) {
        System.out.println("Menu Display");
        System.out.println("1. View");
        System.out.println("2. Restock");
        System.out.println("3. Exit");
        System.out.print("Please enter an interger: ");

        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        if (option < 1 || option > 3) {
            System.out.println("Invalid choice. Please choose (1-3)");

        }
        System.out.println("Your choice is " + option);
    
    }
}