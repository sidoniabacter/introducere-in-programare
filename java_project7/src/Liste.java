import java.util.*;

public class Liste {
   public static void main(String[] args){ 
ArrayList<String> names = new ArrayList<>();
names.add("Ionut");
names.add("riius");
names.add("Maki");


Collections.sort(names);
Collections.sort(names, Collections.reverseOrder());

 for (String name:names) {
        System.out.println(name);
    }

    
}
}
