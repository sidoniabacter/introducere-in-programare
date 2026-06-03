package exercitiu_livrare;

public class LockerDelivery  implements Delivery{
 private static final int FIXED_COST = 10;
private static final double MAX_WEIGHT = 10.0;
private static final double COST_PER_KG = 1.0;


@Override
public String getDeliveryMethodName(){
    return "Locker";
}
@Override
public double calculateCost (double weight) throws DeliveryException{
    if (weight <=0){
        throw new InvalidWeight("Greutatea trebuie sa fie pozitiva", weight);
    }
    if (weight >MAX_WEIGHT){
        throw new InvalidLockerWeight("Greutatea depaseste limita maxima", weight);
    }
    return FIXED_COST + (weight * COST_PER_KG);
}
}
