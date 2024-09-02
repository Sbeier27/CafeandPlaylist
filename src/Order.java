import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {

    static List<MenuItem> CurrentOrder = new ArrayList<MenuItem>();
    static List<Integer> totalAmount = new ArrayList<Integer> ();
    /* a list of the current order being taken which holds an instance of the menu item
    and a list housing the current total for the order*/
    public static int sum;

    public static List Menu= Cafe.Menu; //a variable to gain the current menu
    // from the cafe class

    public static void addItem(MenuItem item){
        if(Arrays.asList(Menu).contains(item)){
            CurrentOrder.add(item);


        }
    }/*a method which checks if the menu item being ordered is on the menu and if so
    *adds it to the current order*/

    public static void Total(){
        for (double i = 0; i< CurrentOrder.length; i++){
            sum += CurrentOrder[i];
        }
    }

}
