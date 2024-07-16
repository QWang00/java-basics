public class DecodeAsciiString {
    public static void main(String[] args) {
        int[] asciiValues = {87, 111, 119, 44, 32, 73, 32, 103, 117, 101, 115, 115, 32, 73, 39, 109, 32, 97, 32, 115,
                             116, 114, 105, 110, 103, 333};

        StringBuilder decodedString = new StringBuilder();

        for (int asciiValue : asciiValues) {
            char character = (char) asciiValue;
            decodedString.append(character);
        }

        System.out.println("Decoded String: " + decodedString.toString());
    }
}