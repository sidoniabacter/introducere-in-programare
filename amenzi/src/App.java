import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class App {
ArrayList<Amenda> amenzi = new ArrayList<>();
public void calculateTotalCost(){
        double totalCost = 0.0;
        for (Amenda amenda  : amenzi){
            try{
                totalCost += amenda.getTipAmenda().calculareValoareAmenda(amenda.getValoare());
                amenda.getTipAmenda();
            } catch (Exception e) {
                // TODO: handle exception
            }
               
            }
        }
        System.out.println(cnp + "Cost total al Amenzii: " + calculateCost + "RON");
    }

    public void adaugaAmenda(Amenda amenda){
        amenzi.add(amenda);
    }

    // polimorfisnul est folosit pentru a nu folosi instanceOf pentru fiecare obiect creat
    public static void main(String[] args) throws Exception {
         App app = new App();
         app.adaugaAmenda(new );
app.adaugaAmenda(new AruncareGunoaie(1032174456709, 70, "Aruncare gunoaie", 1));
app.adaugaAmenda(new ParcareIlegala(123456789, 500, "Parcare ilegala" ) );
app.adaugaAmenda(new DistrugereBunuri(1032174456709, 50, "Distrugere Bunuri", 20) );
app.calculateTotalCost();

public void scoateAmenda(Amenda amenda){
        amenzi.remove(amenda);
    }

ArrayList<AruncareGunoaie> amenziGunoi = new ArrayList<>();
ArrayList<DistrugereBunuri> amenziDistrugere = new ArrayList<>();
ArrayList<ParcareIlegala> amenziParcare = new ArrayList<>();

public String getSubCategorie (String AruncareGunoaie, String DistrugereBunuri, String ParcareIlegala){
    if(this.AruncareGunoaie== AruncareGunoaie.getTipAmenda()){
    Iterator<AruncareGunoaie> iterator1 = set.iterator();
    while(iterator1.ArrayList()){
        System.out.println(iterator1.next());
    }else if (this.ParcareIlegala == ParcareIlegala.getTipAmenda()){
        Iterator<ParcareIlegala> iterator2 = set.iterator();
    while(iterator2.ArrayList()){
        System.out.println(iterator2.next());
    }
    }else if (this.DistrugereBunuri==DistrugereBunuri.getTipAmenda())
        Iterator<DistrugereBunuri> iterator = set.iterator();
    while(iterator.ArrayList()){
        System.out.println(iterator.next());
}
    }
    }

    public String getSubCategorieDupaCnp (Long cnp){
    
    Iterator<Amenda> iterator3 = set.iterator();
    while(iterator3.ArrayList()){
        System.out.println(iterator3.next());
    }
}
    }

    

