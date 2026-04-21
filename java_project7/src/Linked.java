import java.util.*;

public class Linked {
     public static void main(String[] args){ 
 LinkedList<String> names = new LinkedList<>();
names.add("JOhn");
names.add("jane");
names.addFirst("First");
names.addLast("last");
 names.remove("JOhn");

Collections.sort(names);
 Collections.sort(names, Collections.reverseOrder());

 for (String name:names) {
        System.out.println(name);
    }
}
}
