package exercitiu_livrare;

public class Order  {

    private String clientName;
    private double weight;
    private Delivery deliveryMethod;

    
    public Order(String clientName, double weight, Delivery deliveryMethod) {
        this.clientName = clientName;
        this.weight = weight;
        this.deliveryMethod = deliveryMethod;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public Delivery getDeliveryMethod() {
        return deliveryMethod;
    }
    public void setDeliveryMethod(Delivery deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public String displayInfo(){
        return clientName + "-" + deliveryMethod.getDeliveryMethodName() + "- Cost livrare" + deliveryMethod;
    }
    
}

