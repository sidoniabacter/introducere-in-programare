package exercitiu_livrare;

public class InvalidCurierWeight extends DeliveryException {

     private double weight;

 public InvalidCurierWeight(String message, double weight) {
    super("Greutatea maxima pentru curier dete de 50 kg. Acest pachet are: " + weight + "." + message);
    this.weight = weight;
 }
 public double getWeight (){
    return weight;
 }
}
