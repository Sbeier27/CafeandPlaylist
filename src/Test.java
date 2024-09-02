public class Test {


    public static void main(String[] args) {


        Cafe.addMenuItem("Croissant", 3.99, "bread");
        Cafe.addMenuItem("Latte", 5.99, "Drink");
        Cafe.addMenuItem("Smoothie", 6.99,"Drink");
        Cafe.displayMenu();

        Order.addItem("Croissant",3.99);
        Order.addItem("Croissant" ,3.99);
        Order.addItem("Smoothie", 6.99);
        Order.finalOrder();


    }


}
