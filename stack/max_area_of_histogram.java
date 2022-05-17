package stack;

import java.util.ArrayDeque;

class object {
    int value;
    int index;

    object(int v, int i) {
        this.value = v;
        this.index = i;
    }
}

public class max_area_of_histogram {

    public static void main(String[] args) {
        int a[] = { 6, 2, 5, 4, 5, 1, 6 };
        int nsr[] = new int[7];
        int nsl[] = new int[7];

        ArrayDeque<object> s = new ArrayDeque<>();
        for (int i = 6; i >= 0; i--) {
            if (s.isEmpty()) {
                s.addFirst(new object(a[i], i));
                nsr[i] = 7;
            } else {
                while (s.peekFirst() != null && s.peekFirst().value >= a[i]) {
                    s.pollFirst();
                }
                if (s.isEmpty()) {
                    nsr[i] = 7;
                    s.addFirst(new object(a[i], i));
                } else {
                    nsr[i] = s.peekFirst().index;
                    s.addFirst(new object(a[i], i));
                }
            }
        }
        ArrayDeque<object> l = new ArrayDeque<>();
        for (int i = 0; i < 7; i++) {
            if (l.isEmpty()) {
                nsl[i] = -1;
                l.addFirst(new object(a[i], i));
            } else {
                while (l.peekFirst() != null && l.peekFirst().value >= a[i]) {
                    l.pollFirst();
                }
                if (l.isEmpty()) {
                    nsl[i] = -1;
                    l.addFirst(new object(a[i], i));
                } else {
                    nsl[i] = l.peekFirst().index;
                    l.addFirst(new object(a[i], i));
                }

            }
        }
        int width[] = new int[7];
        int area[] = new int[7];
        int max = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print(nsr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            System.out.print(nsl[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 7; i++) {
            width[i] = nsr[i] - nsl[i] - 1;
            area[i] = width[i] * a[i];
            if (area[i] > max) {
                max = area[i];
            }
            System.out.print(area[i] + " ");
        }
        System.out.println();
        System.out.println("max=" + max);

    }
}
