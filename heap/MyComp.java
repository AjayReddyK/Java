package heap;

import java.util.Comparator;

public class MyComp implements Comparator<Pair> {
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
