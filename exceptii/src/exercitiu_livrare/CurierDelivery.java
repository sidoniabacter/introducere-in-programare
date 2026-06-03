package exercitiu_livrare;

public class CurierDelivery implements Delivery{
    private static final int FIXED_COST = 20;
private static final double MAX_WEIGHT = 50.0;
private static final double COST_PER_KG = 50.0;



@Override
public String getDeliveryMethodName(){
    return "Curier";
}
@Override
public double calculateCost (double weight) throws DeliveryException{
    if (weight <=0){
        throw new InvalidWeight("Greutatea trebuie sa fie pozitiva", weight);
    }
    if (weight >MAX_WEIGHT){
        throw new InvalidCurierWeight("Greutatea depaseste limita maxima", weight);
    }
    return FIXED_COST + (weight * COST_PER_KG);
}
}
