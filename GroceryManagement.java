import java.util.Scanner;

public class GroceryManagement {

    public static void main(String[] args) {
        // String[] itemNames = new String[10];
        // double[] itemPrices = new double[10];
        // int[] itemStocks = new int[10];
        
        String[] itemNames = {"Oranges" , "Apples", "Milk", "Lettuce"};
        double[] itemPrices = {50, 30, 15, 20};
        int[] itemStocks = {3, 7, 3,2};

        // System.out.println("-----Testing Restock (if exists)---");
        // //expecting Oranges stock to increase from 50 to 55
        // restockItem(itemNames, itemStocks, "Oranges", 5);
        // System.out.println("Updated Orange Stock: " + itemStocks[0]);
        // System.out.println(" ");

        // //expecting error message "Item not found"
        // System.out.println("-----Testing restock(Missing Item)---");
        // restockItem(itemNames, itemStocks, "Chicken Wings", 5);
        // System.out.println(" ");

        /* Dang Nguyen
         * Display the menu and calling feature based on customer choice
         */
        int choice = 0;
        while (choice != 3) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View");
            System.out.println("2. Restock");
            System.out.println("3. Exit");
            System.out.print("Please enter your choice (1-3): ");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println("Your choice is " + choice);
            switch(choice) {
                case 1:
                    printInventory(itemNames, itemPrices, itemStocks);
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.print("What item do you want to restock: ");
                    String item = scanner.nextLine();

                    System.out.print("Enter amount: ");
                    int amount = scanner.nextInt();

                    restockItem(itemNames, itemStocks, item, amount);
                    break;
                case 3:
                    System.out.println("Exit sucessfully. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
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


     //Static keyword allows to be called directly without creating an object instance
    public static void restockItem(String[] names, int[] stocks, String target, int amount){
        //flag variabklke to track if the target item is successfully located during the search
        boolean itemFound = false;

        for(int i = 0; i < names.length; i++){
            //Using .equals() because == checks memory refrence identity
            if (names[i] != null && names[i].equals(target)){
                //Updates the stock at the parrallel index mapping 
                stocks[i] += amount;
                

                //flip tracking flag to true since element was located 
                itemFound = true;

                //Break out when the loop once item name is found
                break;
            }
        }

        if(!itemFound){
            System.out.println("Item not found");
        }  
    }
}