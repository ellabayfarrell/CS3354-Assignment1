import java.util.Scanner;

/**
 * A simple grocery management system built with parallel arrays.
 * <p>
 * Item data is stored across three arrays (names, prices, and stock
 * amounts), where the same index in each array refers to the same item.
 * The user can view the inventory, restock an item, or exit through a
 * text-based menu.
 * </p>
 * <p>
 * Contributions:
 * </p>
 * <ul>
 *   <li>Dang Nguyen - user menu ({@code feature-menu})</li>
 *   <li>Ella Farrell - inventory display ({@code feature-display})</li>
 *   <li>Hunter Norris - restock and search ({@code feature-restock})</li>
 *   <li>Kalie Newman - input validation, cleanup, and documentation ({@code cleanup})</li>
 * </ul>
 *
 * @author Dang Nguyen
 * @author Ella Farrell
 * @author Hunter Norris
 * @author Kalie Newman
 */

public class GroceryManagement {
    /**
     * Entry point of the program. Sets up the parallel arrays with sample
     * data, then runs a menu loop that lets the user view the inventory,
     * restock an item, or exit.
     * <p>
     * Menu options:
     * </p>
     * <ul>
     *   <li>1 - View the inventory</li>
     *   <li>2 - Restock an item</li>
     *   <li>3 - Exit the program</li>
     * </ul>
     * <p>
     * Written by Dang Nguyen ({@code feature-menu}).
     * </p>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Oranges"; itemPrices[0] = 50; itemStocks[0] = 3;
        itemNames[1] = "Apples";  itemPrices[1] = 30; itemStocks[1] = 7;
        itemNames[2] = "Milk";    itemPrices[2] = 15; itemStocks[2] = 3;
        itemNames[3] = "Lettuce"; itemPrices[3] = 20; itemStocks[3] = 2;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");

            int choice = readInt(scanner, "Please enter your choice (1-3): ");
            switch(choice) {
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    System.out.print("What item do you want to restock: ");
                    String item = scanner.nextLine().trim();

                    int amount = readInt(scanner, "Enter amount: ");
                    if (amount <= 0) {
                        System.out.println("Amount must be greater than 0.");
                    } else {
                        restockItem(itemNames, itemStocks, item, amount);
                    }
                    break;
                case 3:
                    System.out.println("Exited successfully. Have a nice day!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
    }

    /**
     * Repeatedly prompts the user until a valid whole number is entered.
     * Non-numeric input is rejected with a message instead of crashing
     * the program, and the prompt is shown again.
     * <p>
     * Written by Kalie Newman ({@code cleanup}).
     * </p>
     *
     * @param scanner the {@code Scanner} to read input from
     * @param prompt  the message to display before each read attempt
     * @return the valid integer entered by the user
     */
    public static int readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a whole number.");
            }
        }
    }

    /**
     * Displays every non-empty item in the inventory with its price and
     * stock amount. Slots where the item name is {@code null} are skipped
     * and counted as empty; the total number of empty slots is printed
     * after the inventory listing.
     * <p>
     * Written by Ella Farrell ({@code feature-display}).
     * </p>
     *
     * @param names  the array of item names
     * @param prices the array of item prices, parallel to {@code names}
     * @param stocks the array of stock amounts, parallel to {@code names}
     */
    public static void printInventory(String[] names, double[] prices, int[] stocks)
    {
        int emptySlots = 0;
        for(int i = 0; i < names.length; i++)
        {
            if(names[i] != null)
            {
                System.out.printf("%s - $%.2f, Stock: %d%n", names[i], prices[i], stocks[i]);
            }
            else
            {
                emptySlots++;
            }
        }
        System.out.println("Empty slots: " + emptySlots);
    }

    /**
     * Searches for an item by name and adds the given amount to its stock.
     * The name comparison is case-sensitive. If the item is not found after
     * checking the whole array, prints "Item not found."
     * <p>
     * Written by Hunter Norris ({@code feature-restock}).
     * </p>
     *
     * @param names  the array of item names
     * @param stocks the array of stock amounts, parallel to {@code names}
     * @param target the name of the item to restock
     * @param amount the quantity to add to the item's stock
     */
    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        //flag variable to track if the target item is successfully located during the search
        boolean itemFound = false;

        for(int i = 0; i < names.length; i++){
            //Using .equals() because == checks memory reference identity
            if (names[i] != null && names[i].equals(target)){
                //Updates the stock at the parallel index mapping
                stocks[i] += amount;

                //flip tracking flag to true since element was located
                itemFound = true;

                System.out.println("Restocked " + names[i] + ". New stock: " + stocks[i]);

                //Break out of the loop once the item name is found
                break;
            }
        }

        if(!itemFound){
            System.out.println("Item not found.");
        }
    }
}
