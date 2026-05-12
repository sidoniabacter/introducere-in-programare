import java.util.HashSet;

public class SmartCity {

    private HashSet<Vehicul> vehicule;

    public SmartCity() {
      vehicule = new HashSet<Vehicul>();
    }

     public SmartCity(HashSet<Vehicul> vehicule) {
        this(); // apelul la constructorul fara parametri din clasa
        this.vehicule.addAll(vehicule);
    }
    
    public void adaugaVehicul(Vehicul v){
        vehicule.add(v);
    }
    public void stergeVehicul(Vehicul v){
        vehicule.remove(v);
    }
    public String toString(){
        String s="Smart City cu" + vehicule.size() + "vehicule\n";
        for (Vehicul v: vehicule){
            s+= "\t"+v. toString()+"\n";
        }
        return s;
    }
    public static void main(String[] args) {
        SmartCity sc = new SmartCity();
        sc.adaugaVehicul(new EMasina(1, "dacia", 23, 4, 6, 250));
        sc.adaugaVehicul(new Autobuz(7, "n", 12, 5));
        sc.adaugaVehicul(new Drona(6, "dacia", 6, 89, 6));
System.out.println(sc);
System.out.println(sc.afisareVehiculeElectrice());
System.out.println(sc.afisareVehiculeTRansportMarfa());
System.out.println(sc.afisareVehiculeTransportaPersoane());
System.out.println(sc.afisareVehiculeZburatoare());
    }
    
    public String afisareVehiculeElectrice(){
        String s= "vehicule electrice :\n";
        for(Vehicul v: vehicule){
            if(v instanceof EVehicul){
                s+= "\t "+ v.toString() +"\n";
            }
        }
        return s;
    }
 public String afisareVehiculeZburatoare(){
        String z= "vehicule zburatoare :\n";
        for(Vehicul v: vehicule){
            if(v instanceof Zburator){
                z+= "\t "+ v.toString() +"\n";
            }
        }
        return z;
    }

    public String afisareVehiculeTransportaPersoane(){
        String s= "vehicule care transporta persoane :\n";
        for(Vehicul v: vehicule){
            if(v instanceof TransportPersoane){
                s+= "\t "+ v.toString() +"\n";
            }
        }
        return s;
    }

    public String afisareVehiculeTRansportMarfa(){
        String z= "vehicule care transporta marfa :\n";
        for(Vehicul v: vehicule){
            if(v instanceof TransportMarfa){
                z+= "\t "+ v.toString() +"\n";
            }
        }
        return z;
    }



}
