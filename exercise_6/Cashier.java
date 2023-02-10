public class Cashier {
    
    public void checkOut(GroceryItem item) {
       System.out.println("You have bought a " + item.name);
    }

    public void showPrice(GroceryItem item) {
        System.out.println("The price of this item is " + item.price);
    }
}
