package Module1.Collections;

import java.io.FileNotFoundException;
import java.util.LinkedList;

/**
 * Created by Daniel Solo on 01.06.2016.
 */
public class LinkedListLoader extends Methods {
    FileSaver fileSaver = new FileSaver();

    public void loader() throws FileNotFoundException {
        LinkedList<Integer> link10k = new LinkedList<Integer>();
        LinkedList<Integer> link100k = new LinkedList<Integer>();
        LinkedList<Integer> link1000k = new LinkedList<Integer>();

        String timeForPopulate10k = Long.toString(getTimeForPopulate(link10k, size1));
        String timeForPopulate100k = Long.toString(getTimeForPopulate(link100k, size2));
        String timeForPopulate1000k = Long.toString(getTimeForPopulate(link1000k, size3));

        String timeForAdd10k = Long.toString(getTimeForAdd(link10k));
        String timeForAdd100k = Long.toString(getTimeForAdd(link100k));
        String timeForAdd1000k = Long.toString(getTimeForAdd(link1000k));

        String timeForGet10k = Long.toString(getTimeForGet(link10k));
        String timeForGet100k = Long.toString(getTimeForGet(link100k));
        String timeForGet1000k = Long.toString(getTimeForGet(link1000k));

        String timeForContains10k = Long.toString(getTimeForContains(link10k));
        String timeForContains100k = Long.toString(getTimeForContains(link100k));
        String timeForContains1000k = Long.toString(getTimeForContains(link1000k));

        String timeForRemove10k = Long.toString(getTimeForRemove(link10k));
        String timeForRemove100k = Long.toString(getTimeForRemove(link100k));
        String timeForRemove1000k = Long.toString(getTimeForRemove(link1000k));

        String timeForIteratorAdd10k = Long.toString(getTimeForIteratorAdd(link10k));
        String timeForIteratorAdd100k = Long.toString(getTimeForIteratorAdd(link100k));
        String timeForIteratorAdd1000k = Long.toString(getTimeForIteratorAdd(link1000k));

        String timeForIteratorRemove10k = Long.toString(getTimeForIteratorRemove(link10k));
        String timeForIteratorRemove100k = Long.toString(getTimeForIteratorRemove(link100k));
        String timeForIteratorRemove1000k = Long.toString(getTimeForIteratorRemove(link1000k));

        String textToFile;

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "|LinkedList", "|10K", timeForAdd10k, timeForGet10k, timeForRemove10k, timeForContains10k, timeForPopulate10k, timeForIteratorAdd10k, timeForIteratorRemove10k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|100K", timeForAdd100k, timeForGet100k, timeForRemove100k, timeForContains100k, timeForPopulate100k, timeForIteratorAdd100k, timeForIteratorRemove100k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|1000K", timeForAdd1000k, timeForGet1000k, timeForRemove1000k, timeForContains1000k, timeForPopulate1000k, timeForIteratorAdd1000k, timeForIteratorRemove1000k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);
    }
}

