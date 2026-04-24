public class Record {
private String nume;
private int record;
private String specializarea;

public Record(String nume, int record, String specializarea){
    this.nume=nume;
    this.record = record;
    this.specializarea =specializarea;
}

@Override
public String toString() {
    return "Record{Name='" + nume + "', Record=" + record + ", Specializare='" + specializarea + "'}";
}
}
