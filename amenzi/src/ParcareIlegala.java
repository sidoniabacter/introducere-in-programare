public class ParcareIlegala extends Amenda {
public static final int AMENDA = 50;

public ParcareIlegala(Long cnp, int valoare, String tipAmenda) {
    super(cnp, valoare, tipAmenda);
}

@Override
public String getTipAmenda(){
    return "Parcare Ilegala";
}

@Override
public int  calculareValoareAmenda (int valoare) {
    return AMENDA; // amenda fixa de 50 lei
}

}
