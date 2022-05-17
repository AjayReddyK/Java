package heap;

import java.util.PriorityQueue;

public class k_sorted_array {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 4, 3, 8, 10, 9 };
        int k = 3;
        int size = 0;
        int b[] = new int[7];
        int j = 0;
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for (int i = 0; i < 7; i++) {
            hp.add(arr[i]);
            size++;
            if (size > k) {
                b[j++] = hp.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            b[j++] = hp.poll();
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
