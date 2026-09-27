public class GroceryManagement {

    public static void main(String[] args) 
    {
        String[] itemNames = new String[10];
        double[] itemPrices = new double[10];
        int[] itemStocks = new int[10];
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