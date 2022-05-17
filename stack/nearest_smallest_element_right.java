package stack;

import java.util.ArrayDeque;

public class nearest_smallest_element_right {
    public static void main(String[] args) {
        int[] a = { 1, 7, 2, 5, 9, 0, 2 };
        ArrayDeque<Integer> s = new ArrayDeque<>();
        int min[] = new int[7];
        for (int i = 6; i >= 0; i--) {
            if (s.isEmpty()) {
                s.addFirst(a[i]);
                min[i] = -1;
            } else {
                while (s.peekFirst() != null && s.peekFirst() >= a[i]) {
                    s.pollFirst();
                }
                if (s.isEmpty()) {
                    min[i] = -1;
                    s.addFirst(a[i]);
                } else {
                    min[i] = s.peekFirst();
                    s.addFirst(a[i]);
                }
            }
        }
        for (int i = 0; i < 7; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(min[i] + " ");
        }
    }
}
