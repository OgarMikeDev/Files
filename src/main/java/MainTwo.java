import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MainTwo {
    public static void main(String[] args) {
        //First method write in the file
//        try {
//            List<String> listStrings = Files.readAllLines(Paths.get(
//                    "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt"
//            ));
//
//            PrintWriter printWriter = new PrintWriter(
//                    "C:\\Users\\Polina\\Downloads\\Files\\data\\book.txt");
//            for (String line : listStrings) {
//                printWriter.write(line + "\n");
//            }
//
//            File file = new File("C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt");
//            file.delete();
//
//            printWriter.flush();
//            printWriter.close();
//        } catch (IOException ex) {
//            ex.getCause();
//        }

        //Second method write in the file
        try {
            List<String> listStrings = Files.readAllLines(Paths.get(
                    "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt"
            ));
            ArrayList<String> arrayList = new ArrayList<>();
            for (String line : listStrings) {
                arrayList.add(line);
            }

            Files.write(Paths.get(
                            "C:\\Users\\Polina\\Downloads\\Files\\data\\book.txt"),
                    arrayList);

            File file = new File("C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt");
            file.delete();
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
}