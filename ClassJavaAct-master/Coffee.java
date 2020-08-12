public class Coffee {

    String size;
    double price;
    int ordered;
    String typeCoffee;

    public Coffee(String servingSize, double Receipt, int coffeesOrdered, String whichCoffee){
        size = servingSize;
        price = Receipt;
        ordered = coffeesOrdered;
        typeCoffee = whichCoffee;
    }



    public static void main(String[] args){

        Coffee usualOrder = new Coffee("tall", 2.75, 2, "Americano");
        Coffee luxuryOrder = new Coffee("venti", 4.9, 3, "Strawberry frappe");

        System.out.println("My usual coffee is a " + usualOrder.size + " " + usualOrder.typeCoffee);
        System.out.println("If I'm making a luxury order, it comes to " + luxuryOrder.price);
        System.out.println("If there's multiple people, it would be very expensive at " + luxuryOrder.price * luxuryOrder.ordered);

    }

}