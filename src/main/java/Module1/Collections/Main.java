package Module1.Collections;

import java.io.FileNotFoundException;

/**
 * Created by Daniel Solo on 01.06.2016.
 */
public class Main {

    public static void main(String[] args) throws FileNotFoundException{

        ArrayListLoader arrayListLoader = new ArrayListLoader();
        LinkedListLoader linkedListLoader = new LinkedListLoader();
        HashSetLoader hashSetLoader = new HashSetLoader();
        TreeSetLoader treeSetLoader = new TreeSetLoader();
        FileSaver fileSaver = new FileSaver();

        String textToPrint;
        textToPrint = "COLLECTIONS analysis : \n\n";

        System.out.println(textToPrint);
        fileSaver.write("CollectionsTest.txt", textToPrint);
        textToPrint = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n",
                "|Collection", "|size", "|add", "|get", "|remove", "|contains", "|populate", "|iterator.add", "|iterator.remove");
        System.out.print(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

        textToPrint = "_________________________________________________________________________________________________________________________________________";
        System.out.println(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

        arrayListLoader.loader();

        textToPrint = "_________________________________________________________________________________________________________________________________________";
        System.out.println(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

        linkedListLoader.loader();

        textToPrint = "_________________________________________________________________________________________________________________________________________";
        System.out.println(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

        hashSetLoader.loader();

        textToPrint = "_________________________________________________________________________________________________________________________________________";
        System.out.println(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

        treeSetLoader.loader();

        textToPrint = "_________________________________________________________________________________________________________________________________________";
        System.out.println(textToPrint);
        fileSaver.update("CollectionsTest.txt", textToPrint);

    }
}
