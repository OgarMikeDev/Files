import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Класс File
//        File file = new File("data\\info.txt");
//        System.out.println(file.getAbsolutePath());

//        File folder = new File("C:\\Users\\Polina\\Downloads");
//        File[] listFiles = folder.listFiles();
//        for (File currentFile : listFiles) {
//            System.out.println(currentFile.getName());
//        }

//        File fileNumbers = new File(
//                "C:\\Users\\Polina\\Downloads\\Files\\data\\animals");
//        fileNumbers.mkdir(); //add folder
//        fileNumbers.delete(); //delete folder

        //Чтение файлов с помощью FileInputStream
//        StringBuilder builder = new StringBuilder();
//        try {
//            FileInputStream is = new FileInputStream(
//                    "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt");
//
//            for (;;) {
//                int code = is.read();
//                if (code == -1) {
//                    break;
//                }
//                char ch = (char) code;
//                builder.append(ch);
//            }
//        } catch (IOException ex) {
//            ex.getMessage();
//        }
//
//        System.out.println(builder.toString());

        //Чтение файлов с помощью BufferedReader
//        StringBuilder builder = new StringBuilder();
//        try {
//            BufferedReader br = new BufferedReader(
//                    new FileReader(
//                            "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt"));
//            for (;;) {
//                String str = br.readLine();
//                if (str == null) {
//                    break;
//                }
//                builder.append(str + "\n");
//            }
//        } catch (IOException ex) {
//            ex.getMessage();
//        }
//        System.out.println(builder.toString());

        //Чтение файлов с помощью класса Files
        try {
            StringBuilder builder = new StringBuilder();
            List<String> listStrings = Files.readAllLines(
                    Paths.get(
                            "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt"));

            System.out.println("Title file: " + listStrings.getFirst());
            listStrings.forEach(line -> builder.append(line + "\n"));
            System.out.println(builder.toString());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Hello. My name Mike");
//

//        try {
//            byte[] arrayBytes = Files.readAllBytes(Paths.get(
//                    "C:\\Users\\Polina\\Downloads\\Files\\data\\info.txt"));
//            for (byte b : arrayBytes) {
//                char ch = (char) b;
//                System.out.println("Current symbol: " + ch);
//            }
//            System.out.println(arrayBytes.length);
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
    }
}