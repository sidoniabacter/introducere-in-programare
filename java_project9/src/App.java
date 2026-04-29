import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
       HashSet<Carte> hashset= new HashSet<>();
       TreeSet<Carte> treeset= new TreeSet<>();
       Carte carte1 = new Carte("Razboi si pace", "Mike Avenue" , 1, 1879);
       Carte carte2 = new Carte("Snow", "Millie Minuet" , 1, 1945);
       Carte carte3 = new Carte("The Canterville Gost", "John Jimm" , 389, 1720);
       Carte carte5 = new Carte("The Canterville Gost", "John Jimm" , 389, 1720);
       Carte carte4 = new Carte("Shadow", "King Illie" , 40, 1799);
       hashset.add(carte1);
       hashset.add(carte2);
       hashset.add(carte3);
       hashset.add(carte4);
       hashset.add(carte5);

       treeset.addAll(hashset);

    //    System.out.println(carte1);
    //    System.out.println(carte2);
    //    System.out.println(carte3);
    //    System.out.println(carte4);

    //   System.out.println(hashset);

     // hashset.forEach(System.out::println);
      treeset.forEach(System.out::println);

    }
}
