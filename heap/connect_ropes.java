package heap;

import java.util.PriorityQueue;

public class connect_ropes {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        PriorityQueue<Integer> hp = new PriorityQueue<>();
        for (int i = 0; i < 5; i++) {
            hp.add(arr[i]);
        }
        int sum = 0;
        while (hp.size() >= 2) {
            int first = hp.poll();
            int second = hp.poll();
            sum += (first + second);
            hp.add(first + second);
        }
        System.out.println(sum);
    }
}
