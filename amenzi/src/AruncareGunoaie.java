
public class AruncareGunoaie extends Amenda {
private static final int AMENDA = 200;
private int factorZonal =1;

public AruncareGunoaie(Long cnp, int valoare, String tipAmenda, int factorZonal) {
    super(cnp, valoare, tipAmenda);
    this.factorZonal = factorZonal;
}

@Override
public String getTipAmenda(){
    return "Aruncare Gunoaie pe jos";
}

@Override
public int  calculareValoareAmenda (int valoare) {
    if(factorZonal==1 || factorZonal == 2 || factorZonal == 3|| factorZonal == 4){
        factorZonal = this.factorZonal;
    }
   return valoare = valoare + factorZonal* AMENDA;
}
}
