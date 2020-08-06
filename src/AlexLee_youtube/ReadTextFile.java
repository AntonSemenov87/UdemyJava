package AlexLee_youtube;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {

        // Location of text file
        // http://textfiles.com/100/captmidn.txt

        File file = new File("C:\\Users\\Antho\\Desktop\\text.txt");
        Scanner scanner = new Scanner(file);

        // System.out.println(scanner.nextLine()); --> this prints ONLY 1st line

        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

        // Store content of the text into String
        String fileContent = "Hello";
        while (scanner.hasNextLine()) {
            fileContent = fileContent.concat(scanner.nextLine() + "\n"); // we're adding new line to String line by line
        }

        FileWriter writer = new FileWriter("C:\\Users\\Antho\\Desktop\\new-text.txt");
        writer.write(fileContent);
        writer.close();

    }
}
