public class GroceryManagement {

    public static void main(String[] args) 
    {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];

        itemNames[0] = "Apples";
        itemPrices[0] = 2.99;
        itemStocks[0] = 10;

        itemNames[1] = "Milk";
        itemPrices[1] = 3.49;
        itemStocks[1] = 5;

        printInventory(itemNames, itemPrices, itemStocks);
    }

    /*
     * Ella Farrell (tuw18)
     * Displays all of not empty inventory items with their prices and stockamoutns.
     * 
     * @param names the arry contains item anmes
     */
    public static void printInventory(String[]names, double[] prices, int[] stocks)
    {
        for(int i = 0; i < names.length; i++)
        {
            if(names[i] != null)
            {
                System.out.println(names[i] + " - $" + prices[i] + " - Stock: " + stocks[i]);
            }
            else
            {
                System.out.println("Empty");
            }
        }
    }
}