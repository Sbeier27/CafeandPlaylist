public class MenuItem {

    private String Name; //defines the name, price and category of the menu item

    private double price;

    private String Category;

    public MenuItem(String Name, double price, String Category){
        this.Name = Name;
        this.price = price;
        this.Category = Category;
    } /*constructs a menu item object from the getters and setters
    *which then edit the variables setting them to the appropriate
    *data for that instance of Menu item*/


    public String getName(){
        return Name;
    }

    public void setName(String Name){
        this.Name = Name;
    }
    public double getPrice(){
        return price;
    }

    public void setPrice(double Price){
        this.price = price;
    }

    public String getCategory(){
        return Category;
    }

    public void setCategory(String Category){
        this.Category = Category;
    }

    public void displayItemInfo() {
        System.out.println("Name: " + Name);
        System.out.println("Price: " + price);
        System.out.println("Item Type " + Category);

    }
    //displays all info about the menu item instance



}
