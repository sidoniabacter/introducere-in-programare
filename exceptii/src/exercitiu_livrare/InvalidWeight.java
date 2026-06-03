package exercitiu_livrare;

public class InvalidWeight extends DeliveryException {
 private double weight;

 public InvalidWeight(String message, double weight) {
    super("Greutatea este invalida:" + weight + "." + message);
    this.weight = weight;
 }
 public double getWeight (){
    return weight;
 }
 
}
