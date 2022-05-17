package stack;

import java.util.ArrayDeque;

public class max_area_of_rectangle_in_2d_matrix {
    public static int mah(int[] a) {
        int nsr[] = new int[7];
        int nsl[] = new int[7];

        ArrayDeque<object> s = new ArrayDeque<>();
        for (int i = 3; i >= 0; i--) {
            if (s.isEmpty()) {
                s.addFirst(new object(a[i], i));
                nsr[i] = 4;
            } else {
                while (s.peekFirst() != null && s.peekFirst().value >= a[i]) {
                    s.pollFirst();
                }
                if (s.isEmpty()) {
                    nsr[i] = 4;
                    s.addFirst(new object(a[i], i));
                } else {
                    nsr[i] = s.peekFirst().index;
                    s.addFirst(new object(a[i], i));
                }
            }
        }
        ArrayDeque<object> l = new ArrayDeque<>();
        for (int i = 0; i < 4; i++) {
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
        int width[] = new int[4];
        int area[] = new int[4];
        int max = 0;
        for (int i = 0; i < 4; i++) {
            width[i] = nsr[i] - nsl[i] - 1;
            area[i] = width[i] * a[i];
            if (area[i] > max) {
                max = area[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int a[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 } };
        int v[] = a[0];
        int max = 0;
        int value = 0;
        value = mah(v);
        if (value > max) {
            max = value;
        }
        for (int i = 1; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] != 0) {
                    v[j] += a[i][j];
                } else {
                    v[j] = 0;
                }
            }
            value = mah(v);
            if (value > max) {
                max = value;
            }
        }
        System.out.println(max);

    }
}
