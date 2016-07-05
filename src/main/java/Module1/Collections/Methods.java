package Module1.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/**
 * Created by Daniel Solo on 30.05.2016.
 */

public class Methods implements Collections {

    ArrayList<Long> averageTimeRecords;


    @Override
    public long getTimeForAdd(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for(int i = 0; i < repetition; i++){

            long startTime = System.nanoTime();
            list.add(list.size() / 2, i);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForGet(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for(int i = 0; i < repetition; i++){

            long startTime = System.nanoTime();
            list.get(list.size() / 3);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForRemove(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for(int i = 0; i < repetition; i++){

            long startTime = System.nanoTime();
            list.remove(list.size() / 5);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForContains(List<Integer> list) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for(int i = 0; i < repetition; i++){

            long startTime = System.nanoTime();
            list.contains(1000);
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForPopulate(List<Integer> list, int size) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for(int i = 0; i < repetition; i++){

            list.clear();

            long startTime = System.nanoTime();
            for (int j = 0; j < size; j++){
                list.add(j);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForIteratorAdd(List<Integer> list) {
        ListIterator<Integer> listite = list.listIterator();

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i<repetition; i++){
            long startTime = System.nanoTime();
            while (listite.hasPrevious()){
                listite.add(5);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }
        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForIteratorRemove(List<Integer> list) {
        ListIterator<Integer> listite = list.listIterator();

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i<repetition; i++){
            long startTime = System.nanoTime();
            while (listite.hasPrevious()){
                listite.remove();
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }
        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForAdd(Set<Integer> set) {

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i < repetition; i++) {
            long startTime = System.nanoTime();
            set.add(i);

            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForGet(Set<Integer> set) {

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i < repetition; i++) {
            long startTime = System.nanoTime();

            for (Integer j : set)
                set.iterator().next();

            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForRemove(Set<Integer> set) {

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i < repetition; i++) {
            long startTime = System.nanoTime();
            set.remove(i);

            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForContatins(Set<Integer> set) {

        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i < repetition; i++) {
            long startTime = System.nanoTime();

            for (int j = 0; j <set.size(); j++)
                set.contains(1000);

            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getTimeForPopulate(Set<Integer> set, int size) {
        averageTimeRecords = new ArrayList<Long>();
        long result = 0;

        for (int i = 0; i < repetition; i++) {
            set.clear();

            long startTime = System.nanoTime();
            for (int j = 0; j < size; j++){
                set.add(j);
            }
            result = System.nanoTime() - startTime;
            averageTimeRecords.add(result);
        }

        return getAverageTime(averageTimeRecords);
    }

    @Override
    public long getAverageTime(ArrayList<Long> list) {
        int result;
        int sum = 0;
        for (Long i : list) {
            sum += i;
        }
        result = sum / list.size();

        return result;
    }
}