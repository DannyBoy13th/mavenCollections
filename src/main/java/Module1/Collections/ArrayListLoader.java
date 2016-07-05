package Module1.Collections;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Created by Daniel Solo on 31.05.2016.
 */
public class ArrayListLoader extends Methods{
    FileSaver fileSaver = new FileSaver();

    public void loader() throws FileNotFoundException{
        ArrayList<Integer> array10k = new ArrayList<Integer>();
        ArrayList<Integer> array100k = new ArrayList<Integer>();
        ArrayList<Integer> array1000k = new ArrayList<Integer>();

        String timeForPopulate10k = Long.toString(getTimeForPopulate(array10k, size1));
        String timeForPopulate100k = Long.toString(getTimeForPopulate(array100k, size2));
        String timeForPopulate1000k = Long.toString(getTimeForPopulate(array1000k, size3));

        String timeForAdd10k = Long.toString(getTimeForAdd(array10k));
        String timeForAdd100k = Long.toString(getTimeForAdd(array100k));
        String timeForAdd1000k = Long.toString(getTimeForAdd(array1000k));

        String timeForGet10k = Long.toString(getTimeForGet(array10k));
        String timeForGet100k = Long.toString(getTimeForGet(array100k));
        String timeForGet1000k = Long.toString(getTimeForGet(array1000k));

        String timeForContains10k = Long.toString(getTimeForContains(array10k));
        String timeForContains100k = Long.toString(getTimeForContains(array100k));
        String timeForContains1000k = Long.toString(getTimeForContains(array1000k));

        String timeForRemove10k = Long.toString(getTimeForRemove(array10k));
        String timeForRemove100k = Long.toString(getTimeForRemove(array100k));
        String timeForRemove1000k = Long.toString(getTimeForRemove(array1000k));

        String timeForIteratorAdd10k = Long.toString(getTimeForIteratorAdd(array10k));
        String timeForIteratorAdd100k = Long.toString(getTimeForIteratorAdd(array100k));
        String timeForIteratorAdd1000k = Long.toString(getTimeForIteratorAdd(array1000k));

        String timeForIteratorRemove10k = Long.toString(getTimeForIteratorRemove(array10k));
        String timeForIteratorRemove100k = Long.toString(getTimeForIteratorRemove(array100k));
        String timeForIteratorRemove1000k = Long.toString(getTimeForIteratorRemove(array1000k));

        String textToFile;

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "|ArrayList", "|10K", timeForAdd10k, timeForGet10k, timeForRemove10k, timeForContains10k,timeForPopulate10k, timeForIteratorAdd10k, timeForIteratorRemove10k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|100K", timeForAdd100k, timeForGet100k, timeForRemove100k, timeForContains100k,timeForPopulate100k, timeForIteratorAdd100k, timeForIteratorRemove100k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|1000K", timeForAdd1000k, timeForGet1000k, timeForRemove1000k, timeForContains1000k,timeForPopulate1000k, timeForIteratorAdd1000k, timeForIteratorRemove1000k);
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);
    }

}
