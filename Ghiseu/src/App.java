// La ghi ̧seul de ˆıncas ̆ari a taxelor locale se prezint ̆a un contribuabil. Operatorul de la
// ghi ̧seu caut ̆a contribuabilul (dup ̆a nume sau CNP), ˆıi spune cˆat are de pl ̆atit pentru
// anul curent ˆın total pentru toate propriet ̆at ̧ile dup ̆a care poate ˆıncasa bani (o sum ̆a
// total ̆a sau part ̧ial ̆a). Fiecare contribuabil poate det ̧ine mai multe propriet ̆at ̧i: cl ̆adiri
//  ̧si/sau terenuri. Fiecare proprietate e situat ̆a la o adres ̆a (o adres ̆a are strad ̆a  ̧si
// num ̆ar). Suma datorat ̆a ˆın fiecare an pentru fiecare tip de proprietate se calculeaz ̆a
// ˆın felul urm ̆ator:
// • pentru cl ̆adire: 500 * suprafat ̧a cl ̆adirii(m2)
// • pentru teren: 350 * suprafat ̧a terenului(m2) / rangul localit ̆at ̧ii ˆın care se afl ̆a
// terenul. Rangul unei localit ̆at ̧i poate fi 1, 2, 3 sau 4.
// Contribuabilul, indiferent dac ̆a pl ̆ate ̧ste sau nu, poate solicita un flutura ̧s cu toate
// propriet ̆at ̧ile pe care le det ̧ine al ̆aturi de suma pe care trebuie s ̆a o pl ̆ateasc ̆a ˆın anul
// curent pentru o proprietate (flutura ̧sul arat ̆a la fel indiferent dac ̆a pentru anul ˆın
// curs contribuabilul a achitat ceva sau nu). Flutura ̧sul are urm ̆atoarea structur ̆a:
// Contribuabil: Ion Popescu
// Proprietati
// Cladire: Strada V Parvan Nr. 2
// Suprafata: 20
// Cost: 10000
// Teren: Strada V. Parvan Nr. 2
// Suprafata: 10, Rang: 1
// Cost: 3500
// Cladire: Strada Lugoj Nr. 4
// Suprafata: 25
// Cost: 12500
// Suma totala: 26000
// Se cere:
// • s ̆a se construiasc ̆a diagrama UML pentru clasele necesare la realizarea operat ̧iilor
// descrise anterior.
// • s ̆a se implementeze o parte din clasele identificate mai sus astfel ˆıncˆat s ̆a
// poat ̆a fi executat ̆a operat ̧ia: operatorul, dup ̆a ce a g ̆asit contribuabilul Ion
// Popescu, afi ̧seaz ̆a flutura ̧sul coresupunz ̆ator acestui contribuabil. ˆIn metoda
// main se instant ̧iaz ̆a clasa ce modeleaz ̆a conceptul de contribuabil, se seteaz ̆a
// proprietat ̧ile aferente acestuia dupa care se face afi ̧sarea lor.

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
