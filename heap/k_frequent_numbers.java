package heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class compa implements Comparator<Pair> {
    @Override
    public int compare(Pair arg0, Pair arg1) {
        if (arg0.distance < arg1.distance) {
            return -1;
        } else if (arg0.distance > arg1.distance) {
            return 1;
        } else {
            return 0;
        }
    }
}

public class k_frequent_numbers {
    public static void main(String[] args) {
        int arr[] = { 2, 2, 2, 3, 3, 5, 5, 1, 6, 3 };
        HashMap<Integer, Integer> hm = new HashMap<>();
        int k = 3;
        int size = 0;

        for (int i = 0; i < 10; i++) {
            int v = hm.getOrDefault(arr[i], 0);
            v++;
            hm.put(arr[i], v);
        }
        PriorityQueue<Pair> hp = new PriorityQueue<>(new compa());
        for (Map.Entry element : hm.entrySet()) {
            hp.add(new Pair((int) element.getValue(), (int) element.getKey()));
            size++;
            if (size > k) {
                hp.poll();
                size--;
            }
        }
        for (int i = 0; i < k; i++) {
            Pair p = hp.poll();
            System.out.println(p.element + " " + p.distance);
        }

    }
}
