package Module1.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Daniel Solo on 30.05.2016.
 */

public interface Collections {

    int repetition = 100;
    int size1 = 10000;
    int size2 = 100000;
    int size3 = 1000000;

    long getTimeForAdd(List<Integer> list);
    long getTimeForGet(List<Integer> list);
    long getTimeForRemove(List<Integer> list);
    long getTimeForContains(List<Integer> list);
    long getTimeForPopulate(List<Integer> list, int size);
    long getTimeForIteratorAdd(List<Integer> list);
    long getTimeForIteratorRemove(List<Integer> list);

    long getTimeForAdd(Set<Integer> set);
    long getTimeForGet(Set<Integer> set);
    long getTimeForRemove(Set<Integer> set);
    long getTimeForContatins(Set<Integer> set);
    long getTimeForPopulate(Set<Integer> set, int size);

    long getAverageTime(ArrayList<Long> list);



}