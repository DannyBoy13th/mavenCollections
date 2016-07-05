package Module1.Collections;

import java.io.FileNotFoundException;
import java.util.TreeSet;

/**
 * Created by Daniel Solo on 01.06.2016.
 */
public class TreeSetLoader extends Methods{
    FileSaver fileSaver = new FileSaver();

    public void loader() throws FileNotFoundException {

        TreeSet<Integer> treeSet10k = new TreeSet<Integer>();
        TreeSet<Integer> treeSet100k = new TreeSet<Integer>();
        TreeSet<Integer> treeSet1000k = new TreeSet<Integer>();

        String timeForPopulate10k = Long.toString(getTimeForPopulate(treeSet10k, size1));
        String timeForPopulate100k = Long.toString(getTimeForPopulate(treeSet100k, size2));
        String timeForPopulate1000k = Long.toString(getTimeForPopulate(treeSet1000k, size3));

        String timeForAdd10k = Long.toString(getTimeForAdd(treeSet10k));
        String timeForAdd100k = Long.toString(getTimeForAdd(treeSet100k));
        String timeForAdd1000k = Long.toString(getTimeForAdd(treeSet1000k));

        String timeForGet10k = Long.toString(getTimeForGet(treeSet10k));
        String timeForGet100k = Long.toString(getTimeForGet(treeSet100k));
        String timeForGet1000k = Long.toString(getTimeForGet(treeSet1000k));

        String timeForContains10k = Long.toString(getTimeForContatins(treeSet10k));
        String timeForContains100k = Long.toString(getTimeForContatins(treeSet100k));
        String timeForContains1000k = Long.toString(getTimeForContatins(treeSet1000k));

        String timeForRemove10k = Long.toString(getTimeForRemove(treeSet10k));
        String timeForRemove100k = Long.toString(getTimeForRemove(treeSet100k));
        String timeForRemove1000k = Long.toString(getTimeForRemove(treeSet1000k));

        String textToFile;

        textToFile = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n", "|TreeSet", "|10K", timeForAdd10k, timeForGet10k, timeForRemove10k, timeForContains10k,timeForPopulate10k, "-", "-");
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
