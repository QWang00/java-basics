import java.util.ArrayList;

public class CodeBreaking {
    public static void main(String[] args) {
        // Decoded string
        String decodedString = "Wow, I guess I'm a stringō";

        // ArrayList to store boolean values
        ArrayList<Boolean> resultList = new ArrayList<>();

        // Convert each character into boolean based on modulo operation
        for (int i = 0; i < decodedString.length(); i++) {
            char c = decodedString.charAt(i);
            boolean value = (c % 2 == 0);  // Example of a modulo condition (even ASCII values)
            resultList.add(value);
        }

        // Print the ArrayList contents
        System.out.println(resultList);
    }
}