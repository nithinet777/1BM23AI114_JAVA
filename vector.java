import java.util.Vector;

class Product {
    String name;
    double price;
    String category;
    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}
public class vector  {
    private Vector<Product> inventory;
    public vector () {
        inventory = new Vector<>();
    }
    public void addProduct(String name, double price, String category) {
        Product product = new Product(name, price, category);
        inventory.add(product);
    }
    public void removeProduct(String name) {

        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).name.equalsIgnoreCase(name)) {
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory() {
        System.out.println("Inventory:");
        for (Product product : inventory) {
            System.out.println("Name: "+ product.name + ", Price: " + product.price +",Category: " + product.category );
        }
    }
    public static void main(String[] args) {
        vector  manager = new vector ();

        manager.addProduct("bat", 40000, "Electronics");
        manager.addProduct("team india jersey", 2050, "Clothing")
        ;
        manager.addProduct("cndm", 920, "Books");

        manager.displayInventory();

        manager.removeProduct("Book");

        manager.displayInventory();
        manager.removeProduct("Laptop");

        manager.displayInventory();
    }
}

//Inventory:
//Name: bat, Price: 40000.0,Category: Electronics
//Name: team india jersey, Price: 2050.0,Category: Clothing
//Name: cndm, Price: 920.0,Category: Books
//Inventory:
//Name: bat, Price: 40000.0,Category: Electronics
//Name: team india jersey, Price: 2050.0,Category: Clothing
//Name: cndm, Price: 920.0,Category: Books
//Inventory:
//Name: bat, Price: 40000.0,Category: Electronics
//Name: team india jersey, Price: 2050.0,Category: Clothing
//Name: cndm, Price: 920.0,Category: Books
//
//Process finished with exit code 0