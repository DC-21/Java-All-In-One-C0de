public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // length() - returns the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // charAt() - returns the character at the specified index
        char firstChar = str.charAt(0);
        System.out.println("First character: " + firstChar);
        
        // substring() - returns a substring from the original string
        String substring = str.substring(7);
        System.out.println("Substring from index 7: " + substring);
        
        // indexOf() - returns the index of the first occurrence of a character or substring
        int indexOfComma = str.indexOf(",");
        System.out.println("Index of comma: " + indexOfComma);
        
        // contains() - checks if a substring is present in the original string
        boolean containsWorld = str.contains("World");
        System.out.println("Contains 'World': " + containsWorld);
        
        // replace() - replaces all occurrences of a substring with another substring
        String replacedString = str.replace("Hello", "Hi");
        System.out.println("Replaced string: " + replacedString);
        
        // toUpperCase() - converts the string to uppercase
        String upperCaseString = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseString);
        
        // toLowerCase() - converts the string to lowercase
        String lowerCaseString = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseString);
        
        // trim() - removes leading and trailing whitespace from the string
        String stringWithWhitespace = "   Hello   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("Trimmed string: " + trimmedString);
        
        // split() - splits the string into an array of substrings based on a delimiter
        String sentence = "This is a sentence.";
        String[] words = sentence.split(" ");
        System.out.println("Words in the sentence:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
