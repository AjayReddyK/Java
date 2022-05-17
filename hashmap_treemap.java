import java.util.*;
import java.lang.*;

public class hashmap_treemap {
    public static void main(String[] args) {
        HashMap<Integer, String> a = new HashMap<>(Map.of(1, "a", 2, "b", 3, "c", 4, "d", 5, "e", 6, "f"));
        a.put(7, "g");
        System.out.println(a);
        System.out.println(a.containsKey(2));
        System.out.println(a.containsValue("a"));
        System.out.println(a.get(5));

        TreeMap<Integer, String> b = new TreeMap<>(Map.of(1, "b", 2, "b", 3, "c", 4, "d", 5, "e", 6, "f"));
        b.put(7, "g");
        System.out.println(b);
        System.out.println(b.containsKey(2));
        System.out.println(b.containsValue("b"));
        System.out.println(b.get(5));

    }
}
