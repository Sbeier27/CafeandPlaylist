import java.util.*;

public class Order {

    static List<String> CurrentOrder = new ArrayList<String>();

    public static double sum;

    public static Map<String, Double> Menu= Cafe.Menu; //a variable to gain the current menu
    // from the cafe class

    static Collection<Double> totalAmount = Menu.values();
    /* a list of the current order being taken which holds an instance of the menu item
    and a list housing the current total for the order*/

    public static void addItem(String item){
        if(Cafe.Menu.containsValue(item)){
            CurrentOrder.add(item);
            totalAmount.add(Cafe.Menu.get(item));
        }
    }/*a method which checks if the menu item being ordered is on the menu and if so
    *adds it to the current order*/

    public static void doubleAmount(){
        for (double i: totalAmount){
            sum = sum +i;
        }

    }

    public static void finalOrder(){
        doubleAmount();
        System.out.println("Your order is: " + CurrentOrder + "your total is: " + sum);

    }

}
