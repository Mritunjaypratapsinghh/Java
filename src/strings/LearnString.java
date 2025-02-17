package strings;

import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user to enter first name
        System.out.println("Enter your First Name:");
        String firstName = input.nextLine();

        // Prompt user to enter last name
        System.out.println("Enter your Second Name:");
        String lastName = input.nextLine();

        // Print full name with a space between
        System.out.println("Your Full Name: " + firstName + " " + lastName);

        input.close(); // Close scanner to prevent memory leak

        // String Built-in methods
        // toUpperCase() : convert an entire string to uppercase
        String name = "  MrItuNjAy73477 sin";
        String upperCasing = name.toUpperCase();
        System.out.println(upperCasing);

        // toLowerCase() : convert an entire string to lowercase
        String lowerCasing = name.toLowerCase();
        System.out.println(lowerCasing);

        // trim() : to remove leading and trailing spaces
        System.out.println(name.trim());

        // startsWith("") : return boolean value if the string starts with the given prefix
        System.out.println(name.startsWith("Mr"));

        // endsWith("") : return boolean value if the string ends with the given suffix
        System.out.println(name.endsWith("sin"));

        // equals() : return boolean value comparing strings
        System.out.println(name.equals("Mritunjay"));

        // equalsIgnoreCase() : return boolean value ignoring case
        System.out.println("Mritunjay".equalsIgnoreCase("mritunjay"));

        // charAt(int): return the character at the specified index
        System.out.println(name.charAt(5));

        // valueOf(): convert an integer to a string
        int age = 23;
        String stringAge = String.valueOf(age);
        System.out.println(age + 10); // output: 33
        System.out.println(stringAge + 10); // output: 2310

        // replace(a,b): replace a word with another word
        String sentence = "I Love Java and Programming";
        String newSentence = sentence.replace("Java", "Python");
        System.out.println(sentence);
        System.out.println(newSentence);

        // contains(): return boolean value if the string contains a substring
        System.out.println(sentence.contains("Java"));

        // substring(startIndex, endIndex): extract a substring from startIndex to endIndex
        System.out.println(sentence.substring(2, 6));
        System.out.println(sentence.substring(7));

        // split(""): convert into an array of strings
        String[] words = sentence.split(" ");
        for (String str : words) {
            System.out.println(str);
        }

        // toCharArray(): create an array of characters
        char[] charArray = sentence.toCharArray();
        for (char s : charArray) {
            System.out.println(s);
        }

        // isEmpty(): to check if string is empty
        String animal = " ";
        String empty = animal.isEmpty() ? "String is empty" : "String is not empty";
        System.out.println(empty);

        // isBlank(): to check if string is blank (only contains spaces)
        String blank = animal.isBlank() ? "String is blank" : "String is not blank";
        System.out.println(blank);
    }
}
