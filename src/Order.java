import java.util.*;

public class Order {
    public static double sum;
    //a blank variable to be added to in the doubletotal Function

    public static Map<String, Double> Menu= Cafe.Menu; //a variable to gain the current menu
    // from the cafe class

    static List<Double> totalAmount = new ArrayList<Double>();
    /* a list of the current order being taken which holds an instance of the menu item
    and a list housing the current total for the order*/

    static List<String> CurrentOrder = new ArrayList<String>();
    //a list holding the items in the current order

    public static void addItem(String item,Double price){
        if(Cafe.Menu.containsValue(item)){
            CurrentOrder.add(item);
            totalAmount.add(price);
        }
    }/*a method which checks if the menu item being ordered is on the menu and if so
    *adds it to the current order*/

    public static double doubleTotal(){
        for (Double i: totalAmount){
            sum += i;


        }
        return sum;
    }
    //adds together the items in the total amount list to give the total

    public static void finalOrder(){
        doubleTotal();
        System.out.println("Your order is: " + CurrentOrder + "your total is: " + sum);

    }
    //initiates the doubleTotal method, and then prints out the current order and
    //the current total

}
