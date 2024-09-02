import java.util.*;

public class Cafe {
    static Map<String, Double> Menu = new HashMap<String, Double>();
    //a hashmap holding the menu items



    public static void addMenuItem(String Name,double price, String Category){
        Menu.put(Name,price);
        MenuItem item = new MenuItem(Name,price, Category );
    }
    //a method adding new menu items to the menu hashmap, creating a new menuitem object


    public static void displayMenu(){
        System.out.println("Our Menu today is: " + Menu);
    }
    //a method that prints out the current menu
}
