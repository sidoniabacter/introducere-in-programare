public abstract class Amenda {
private long cnp;
private int valoare;
private String tipAmenda;
public Amenda(Long cnp, int valoare, String tipAmenda) {
    cnp = cnp;
    valoare = valoare;
    tipAmenda = tipAmenda;
}
public Long getCnp() {
    return cnp;
}
public void setCnp(String cnp) {
    cnp = cnp;
}
public int getValoare() {
    return valoare;
}
public void setValoare(int valoare) {
    valoare = valoare;
}
public String getTipAmenda();
public void setTipAmenda(String tipAmenda) {
    tipAmenda = tipAmenda;
}
public int calculareValoareAmenda(int valoare);
}
