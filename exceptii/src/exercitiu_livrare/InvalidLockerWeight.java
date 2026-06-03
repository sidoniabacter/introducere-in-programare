package exercitiu_livrare;

public class InvalidLockerWeight extends DeliveryException {
 private double weight;

 public InvalidLockerWeight(String message, double weight) {
    super("Greutatea maxima este de 10 kg. acest colet are :" + weight + "kg");
    this.weight = weight;
 }
 public double getWeight (){
    return weight;
 }

}
