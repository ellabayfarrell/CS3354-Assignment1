//Task 2: Restock and Search

/**
    *Main entry point execution block for testing the grocery application
    *
    *@param args command line arguements 
    */

    public static void main(String[] args) {
        //Initializing sample parrallel arrays for the inventory management
        String[] itemNames = {"Oranges" , "Apples", "Milk", "Lettuce"};
        int[] itemStocks = {50, 30, 15, 20};

        System.out.println("-----Testing Restock (if exists)---");
        //expecting Oranges stock to increase from 50 to 55
        restockItem(itemNames, itemStocks, "Oranges", 5);
        System.out.println("Updated Orange Stock: " + itemStocks[0]);
        System.out.println(" ");

        //expecting error message "Item not found"
        System.out.println("-----Testing restock(Missing Item)---");
        restockItem(itemNames, itemStocks, "Chicken Wings", 5);
        System.out.println(" ");
        
    }
    /**
    *Searches for a target item name within the inventory system and adds a 
    *specified amount to its stock total if found. If not found after scanning 
    *the array, an error message is printed. 
    *
    *@param names An array of Strings representing the item names
    *@param stocks An array of integers representing the stock counts(total)
    *@param target The name of the item to search for 
    *@param amount The quantity of stock to add
    *
    */

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
