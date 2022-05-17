package heap;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer> {
    @Override
    public int compare(Integer arg0, Integer arg1) {
        if (arg0 < arg1) {
            return 1;
        } else if (arg0 > arg1) {
            return -1;
        } else {
            return 0;
        }
    }
}

public class kth_smallest_element {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 6, 20, 15 }; // find 3 rd smallest element
        PriorityQueue<Integer> hp = new PriorityQueue<>(new MyComp());
        int k = 3; // since third smallest element
        int size = 0;
        for (int i = 0; i < 7; i++) {
            hp.add(arr[i]);
            size++;
            if (size > k) {
                hp.poll();
                size--;
            }
        }
        System.out.println(hp.peek());
    }
}
