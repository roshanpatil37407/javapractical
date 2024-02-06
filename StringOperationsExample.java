public class StringOperationsExample {

    public static void main(String[] args) {
        // Creating a String
        String str1 = "Hello, World!";
        String str2 = "Java is awesome";

        // Concatenation
        String src = str1.concat(" " + str2);
        System.out.println("Concatenated String: " + src);

        // Length of the String
        int length = src.length();
        System.out.println("Length of the String: " + length);

        // Substring
        String substring = src.substring(7, 12);
        System.out.println("Substring: " + substring);

        // Uppercase and Lowercase
        String uppercaseString = src.toUpperCase();
        String lowercaseString = src.toLowerCase();
        System.out.println("Uppercase String: " + uppercaseString);
        System.out.println("Lowercase String: " + lowercaseString);

        // Replace
        String replacedString = src.replace("World", "Universe");
        System.out.println("Replaced String: " + replacedString);



        // Compare Strings
        String str3 = "Hello, World!";
        boolean areEqual = str1.equals(str3);
        System.out.println("Are str1 and str3 equal? " + areEqual);



    }
}
