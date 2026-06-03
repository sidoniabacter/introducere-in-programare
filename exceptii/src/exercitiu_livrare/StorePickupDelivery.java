package exercitiu_livrare;

public class StorePickupDelivery implements Delivery{


    @Override
public String getDeliveryMethodName(){
    return "Locker";
}
@Override
public double calculateCost (double weight) throws DeliveryException{
    if (weight <=0){
        throw new InvalidWeight("Greutatea trebuie sa fie pozitiva", weight);
    }
    return 0.0; //Ridicarea din magazin este gratis
}
}

