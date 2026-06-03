package exercitiu_livrare;

import java.util.ArrayList;

public class App {

    ArrayList<Order> orders = new ArrayList<>();
    public void calculateTotalCost(){
        double totalCost = 0.0;
        for (Order order : orders){
            try{
                totalCost += order.getDeliveryMethod().calculateCost(order.getWeight());
                order.displayInfo();
            }catch(DeliveryException e){
                System.out.println( e.getMessage() );
            }
        }
        System.out.println("Cost total al comenzii: " + totalCost + "lei");
    }

    public void addOrder(Order order){
        orders.add(order);
    }
public static void main(String[] args) {
    App app = new App();
app.addOrder(new Order ("Popescu", 5.0, new CurierDelivery()));
app.addOrder(new Order ("Ionescu", 3.0, new LockerDelivery()));
app.addOrder(new Order ("Georgescu", 10.0, new StorePickupDelivery()));
app.addOrder(new Order ("Vasilescu", 15.0, new LockerDelivery()));
app.calculateTotalCost();
}
}
