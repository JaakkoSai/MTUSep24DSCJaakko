import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Q3 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\jsail\\Desktop\\hamlet.txt";
        Set<String> words = new TreeSet<>();

        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next().toLowerCase();
                    words.add(word); // Add the word to the TreeSet
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Display all unique words
        System.out.println("Unique words in TreeSet:");
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("Total unique words: " + words.size());
    }
}

