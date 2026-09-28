import java.util.Scanner;

public class GroceryManagement {

    public static void main(String[] args) {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        /* Dang Nguyen
         * Display the menu and calling feature based on customer choice
         */
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
        switch(option) {
            case 1:
                printInventory(itemNames, itemPrices, itemStocks);
            case 2:
                //
        }
    
    }

     /*
     * Ella Farrell (tuw18)
     * Displays all of not empty inventory items with their prices and stockamoutns.
     * 
     * @param names the array containing item names
     * @param prices the array containing item prices
     * @param stocks the array containing item stock amounts
     */
    public static void printInventory(String[]names, double[] prices, int[] stocks)
    {
        for(int i = 0; i < names.length; i++)
        {
            if(names[i] != null)
            {
                System.out.println(names[i] + " - $" + prices[i] + ", Stock: " + stocks[i]);
            }
            else
            {
                System.out.println("Empty");
            }
        }
    }
}