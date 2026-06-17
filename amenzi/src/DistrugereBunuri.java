public class DistrugereBunuri extends Amenda {
public int valoareBun;
public static final int AMENDA = 30;



public DistrugereBunuri(Long cnp, int valoare, String tipAmenda, int valoareBun) {
    super(cnp, valoare, tipAmenda);
    this.valoareBun = valoareBun;
}

public int getValoareBun() {
    return valoareBun;
}


public void setValoareBun(int valoareBun) {
    this.valoareBun = valoareBun;
}


public static int getAmenda() {
    return AMENDA;
}

@Override
public String getTipAmenda(){
    return "Distrugerea Bunurilor din parcuri";
}

@Override
public int  calculareValoareAmenda (int valoare) {
    
   return valoare = valoare + AMENDA* valoareBun;
}



}
