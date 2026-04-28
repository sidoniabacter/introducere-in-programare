import java.util.*;


public class TestTreeSet {
public static void main(String[] args) {
    TreeSet<String> set = new TreeSet <String>();
    set.add("Pineapple");
    set.add("Mango");
    set.add("Mango");
    set.add("Apple");
     set.add("Orange");
     set.add("Mango");
     set.add("Pear");
    System.out.println(set);
    Iterator<String> iterator = set.iterator();
    while(iterator.hasNext()){
        System.out.println(iterator.next());
        
    }

}
}

