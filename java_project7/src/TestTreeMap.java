import java.util.*;


public class TestTreeMap {
public static void main(String[] args) {
    HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(3, "Three") ;
    hashMap.put(1, "One") ;
    hashMap.put(2, "Two") ;

    TreeMap<Integer, String> treeMap = new TreeMap<>();
    treeMap.putAll(hashMap);
    System.out.println(treeMap);
    System.out.println(treeMap.get(2));
    System.out.println(treeMap.firstKey());
    System.out.println(treeMap.lastKey());
    System.out.println(treeMap.size());
    System.out.println(treeMap.isEmpty());

    Set<Integer> keys = treeMap.keySet();
    Iterator<Integer> iterator = keys.iterator();
    while(iterator.hasNext()){
        Integer key = iterator.next();
        System.out.println(key + "=>" + treeMap.get(key));
        
    }
    

}
}
