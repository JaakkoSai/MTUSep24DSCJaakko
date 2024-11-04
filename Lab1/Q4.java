import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\jsail\\Desktop\\hamlet.txt";
        Map<String, Set<Integer>> wordMap = new TreeMap<>();

        try {
            Scanner in = new Scanner(new File(fileName));
            int lineNumber = 0;
            while (in.hasNextLine()) {
                lineNumber++;
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9]+");
                while (lineParser.hasNext()) {
                    String word = lineParser.next().toLowerCase();
                    wordMap.putIfAbsent(word, new HashSet<>());
                    wordMap.get(word).add(lineNumber); // Add line number to the Set
                }
                lineParser.close();
            }
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Display all words and their line numbers
        System.out.println("Words and line numbers:");
        for (Map.Entry<String, Set<Integer>> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " occurs on lines: " + entry.getValue());
        }

        // Example search for a word
        String searchWord = "to"; // Example search word
        if (wordMap.containsKey(searchWord)) {
            System.out.println(searchWord + " occurs on lines: " + wordMap.get(searchWord));
        } else {
            System.out.println(searchWord + " not found in the text.");
        }
    }
}

