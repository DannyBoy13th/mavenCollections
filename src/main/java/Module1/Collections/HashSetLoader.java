package Module1.Collections;

import java.io.FileNotFoundException;
import java.util.HashSet;

/**
 * Created by Daniel Solo on 01.06.2016.
 */
public class HashSetLoader extends Methods {
    FileSaver fileSaver = new FileSaver();

    public void loader() throws FileNotFoundException{

        HashSet<Integer> hashSet10k = new HashSet<Integer>();
        HashSet<Integer> hashSet100k = new HashSet<Integer>();
        HashSet<Integer> hashSet1000k = new HashSet<Integer>();

        String timeForPopulate10k = Long.toString(getTimeForPopulate(hashSet10k, size1));
        String timeForPopulate100k = Long.toString(getTimeForPopulate(hashSet100k, size2));
        String timeForPopulate1000k = Long.toString(getTimeForPopulate(hashSet1000k, size3));

        String timeForAdd10k = Long.toString(getTimeForAdd(hashSet10k));
        String timeForAdd100k = Long.toString(getTimeForAdd(hashSet100k));
        String timeForAdd1000k = Long.toString(getTimeForAdd(hashSet1000k));

        String timeForGet10k = Long.toString(getTimeForGet(hashSet10k));
        String timeForGet100k = Long.toString(getTimeForGet(hashSet100k));
        String timeForGet1000k = Long.toString(getTimeForGet(hashSet1000k));

        String timeForContains10k = Long.toString(getTimeForContatins(hashSet10k));
        String timeForContains100k = Long.toString(getTimeForContatins(hashSet100k));
        String timeForContains1000k = Long.toString(getTimeForContatins(hashSet1000k));

        String timeForRemove10k = Long.toString(getTimeForRemove(hashSet10k));
        String timeForRemove100k = Long.toString(getTimeForRemove(hashSet100k));
        String timeForRemove1000k = Long.toString(getTimeForRemove(hashSet1000k));

        String textToFile;

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "|HashSet", "|10K", timeForAdd10k, timeForGet10k, timeForRemove10k, timeForContains10k,timeForPopulate10k, "-", "-");
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|100K", timeForAdd100k, timeForGet100k, timeForRemove100k, timeForContains100k,timeForPopulate100k, "-", "-");
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "", "|1000K", timeForAdd1000k, timeForGet1000k, timeForRemove1000k, timeForContains1000k,timeForPopulate1000k, "-", "-");
        System.out.println(textToFile);
        fileSaver.update("CollectionsTest.txt", textToFile);
    }
}
