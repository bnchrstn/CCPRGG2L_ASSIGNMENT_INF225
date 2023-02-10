public class App {
    public static void main(String[] args) throws Exception {
        
        // grocery items
        GroceryItem item1 = new GroceryItem();
        item1.name = "floss";
        item1.price = 35.49;
        item1.showItemName();

        GroceryItem item2 = new Toothbrush();
        item2.name = "Dental B";
        item2.price = 20.69;
        item2.showItemName();

        GroceryItem item3 = new Toothpaste();
        item3.name = "Colgate";
        item3.price = 40.29;
        item3.showItemName();

        // cashier object
        Cashier c1 = new Cashier();
        c1.checkOut(item1);
        c1.showPrice(item1);

        c1.checkOut(item2);
        c1.showPrice(item2);

        c1.checkOut(item3);
        c1.showPrice(item3);

        // polymorphic array
        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item2;
        itemArray[1] = item3;

        // loop thru all items
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i].showItemName();
        }

        Cat myCat = new Cat();
        myCat.eat();

        Cheetah myCheetah = new Cheetah();
        myCheetah.walk();
        myCheetah.run();

    }
}
