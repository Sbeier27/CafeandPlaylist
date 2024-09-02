import java.util.*;

public class Cafe {
    static Map<String, Double> Menu = new HashMap<String, Double>();



    public static void addMenuItem(String Name,double price, String Category){
        MenuItem item = new MenuItem(Name,price, Category );
        Menu.put(Name,price);
    }


    public static void displayMenu(){
        System.out.println("Our Menu today is: " + Menu);
    }
}
