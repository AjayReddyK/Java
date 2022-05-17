package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class comp implements Comparator<Pair> {
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

public class k_closest_element {
    public static void main(String[] args) {
        // given an array and a element. find k closest elements.
        int arr[] = { 5, 6, 7, 8, 9 };
        int key = 7;
        int k = 3;
        PriorityQueue<Pair> hp = new PriorityQueue<>(new comp());
        int size = 0;
        for (int i = 0; i < 5; i++) {
            int d = arr[i] - key;
            if (d < 0) {
                d *= -1;
            }
            hp.add(new Pair(d, arr[i]));
            size++;
            if (size > k) {
                hp.poll();
                size--;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.print(hp.poll().element);
        }

    }
}
