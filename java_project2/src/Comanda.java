import java.util.List;

public class Comanda {
    private String nrComanda;
    private static int nrProduse;
    private List<Produs>produse;
    public Comanda()
    {

    }
    
    public void setNrComanda(String nrComanda) {
        this.nrComanda = nrComanda;
    }
    public static void setNrProduse() {
        nrProduse++;
    }
    public void setProduse(List<Produs> produse) {
        this.produse = produse;
    }
    public String toString(){
    return "nr comanda: "+ nrComanda+" nr produse: "+nrProduse;
    
}
public void getProduseInfo(){
    System.out.println("lista de produse ");
    for (Produs produs: produse) {
        System.out.println(produs);
    }
    
}
}

