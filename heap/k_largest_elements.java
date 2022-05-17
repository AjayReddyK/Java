package heap;

import java.util.PriorityQueue;

public class k_largest_elements {
    public static void main(String[] args) {
        int arr[] = { 7, 10, 4, 3, 20, 15 };
        int k = 3; // third largest element
        int size = 0;
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for (int i = 0; i < 6; i++) {
            hp.add(arr[i]);
            size++;
            if (size > k) {
                hp.poll();
                size--;
            }
        }
        for (int i = 0; i < k; i++) {
            System.out.println(hp.poll());
        }
    }
}
