import java.util.ArrayList;

public class DecodeAsciiString {
    public static void main(String[] args) {
        int[] asciiValues = {87, 111, 119, 44, 32, 73, 32, 103, 117, 101, 115, 115, 32, 73, 39, 109, 32, 97, 32, 115,
                             116, 114, 105, 110, 103, 333};

        // Decoding the ASCII values into a String
        StringBuilder decodedString = new StringBuilder();
        for (int asciiValue : asciiValues) {
            char character = (char) asciiValue;
            decodedString.append(character);
        }

        System.out.println("Decoded String: " + decodedString.toString());

        // Creating ArrayList to store each character
        ArrayList<Character> list = new ArrayList<>();
        for (char c : decodedString.toString().toCharArray()) {
            list.add(c);
        }

        // Printing each character using forEach
        list.forEach(System.out::print);
    }
}