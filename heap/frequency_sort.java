package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MyCompa implements Comparator<Pair> {
    @Override
    public int compare(Pair arg0, Pair arg1) {
        if (arg0.distance < arg1.distance) {
            return 1;
        } else if (arg0.distance > arg1.distance) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class frequency_sort {
    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 2, 3, 5, 3, 6, 7, 7, 5 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < 11; i++) {
            int v = hm.getOrDefault(arr[i], 0);
            v++;
            hm.put(arr[i], v);
        }
        PriorityQueue<Pair> hp = new PriorityQueue<>(new MyCompa());
        for (Map.Entry entry : hm.entrySet()) {
            hp.add(new Pair((int) entry.getValue(), (int) entry.getKey()));
        }
        while (hp.peek() != null) {
            Pair p = hp.poll();
            for (int i = 0; i < p.distance; i++) {
                System.out.print(p.element + " ");
            }
        }

    }
}
