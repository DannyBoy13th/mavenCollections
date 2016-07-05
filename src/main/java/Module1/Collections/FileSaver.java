package Module1.Collections;

import java.io.*;

/**
 * Created by Daniel Solo on 31.05.2016.
 */
public class FileSaver {

    private void exists(String fileName) throws FileNotFoundException{
        File file = new File(fileName);
        if (!file.exists()){
            throw  new FileNotFoundException(file.getName());
        }
    }

    public void write(String fileName, String text) {
        File file = new File(fileName);

        try {
            if (!file.exists()){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.print(text);
            }finally {
                out.close();
            }
        }catch (IOException a) {
            throw new RuntimeException(a);
        }
    }


    public String read(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        StringBuilder stringBuilder = new StringBuilder();

        exists(fileName);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                String a;

                while ((a = reader.readLine()) != null) {

                    stringBuilder.append(a);
                    stringBuilder.append("\n");
                }
            } finally {
                reader.close();
            }
        } catch (IOException a) {
            throw new RuntimeException(a);
        }
        return stringBuilder.toString();
    }

    public void update(String fileName, String newText) throws FileNotFoundException{

        exists(fileName);
        StringBuilder stringBuilder = new StringBuilder();
        String oldFile = read(fileName);

        stringBuilder.append(oldFile);
        stringBuilder.append(newText);
        write(fileName, stringBuilder.toString());
    }
}
