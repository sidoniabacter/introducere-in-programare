package exercitiu_livrare;

public interface Delivery {

    String getDeliveryMethodName();
    double calculateCost(double weight) throws DeliveryException;

}
