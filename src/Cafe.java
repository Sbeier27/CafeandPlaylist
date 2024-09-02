import java.util.ArrayList;
import java.util.List;

public class Cafe {
    static List<MenuItem> Menu = new ArrayList<MenuItem>();
    public static void addMenuItem(String Name,double price, String Category){
        MenuItem item = new MenuItem(Name,price, Category );
    }
}
