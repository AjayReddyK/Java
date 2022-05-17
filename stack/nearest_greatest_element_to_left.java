package stack;

import java.util.ArrayDeque;

public class nearest_greatest_element_to_left {
    public static void main(String[] args) {
        int a[] = { 3, 2, 10, 1, 6, 4, 9, 3 };
        ArrayDeque<Integer> l = new ArrayDeque<>();
        int min[] = new int[8];
        for (int i = 0; i < 8; i++) {
            if (l.isEmpty()) {
                min[i] = -1;
                l.addFirst(a[i]);
            } else {
                while (l.peekFirst() != null && l.peekFirst() <= a[i]) {
                    l.pollFirst();
                }
                if (l.isEmpty()) {
                    min[i] = -1;
                    l.addFirst(a[i]);
                } else {
                    min[i] = l.peekFirst();
                    l.addFirst(a[i]);
                }

            }
        }
        for (int i = 0; i < 8; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(min[i] + " ");
        }

    }
}
