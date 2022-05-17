import java.lang.*;
import java.util.*;

class hashset_treeset {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>(); // can give initial capacity and load factor
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(1);
        System.out.println(hs.contains(3));
        System.out.println(hs.isEmpty());
        hs.remove(3);
        System.out.println(hs.contains(3));
        System.out.println(hs);
        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs);

        TreeSet<Integer> ts = new TreeSet<>(); // can give initial capacity and load factor
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(1);
        System.out.println(ts.contains(3));
        System.out.println(ts.isEmpty());
        ts.remove(3);
        System.out.println(ts.contains(3));
        System.out.println(ts);
        System.out.println(ts.size());
        ts.clear();
        System.out.println(ts);
    }
}