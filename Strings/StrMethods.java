public class StrMethods {
    public static void main(String[] args) {
        String str = "Hello World!";

        System.out.println("str: " + str);

        //charAt()
        // System.out.println("str.charAt(0): " + str.charAt(0));

        //compareTo()
        // System.out.println("str.compareTo(\"Hello World!\"): " + "a".compareTo("A"));

        //concat()
        // System.out.println("str.concat(\"Hello World!\"): " + str.concat("Hello World!"));

        //contains()
        // System.out.println("str.contains(\"e\"): " + str.contains("e"));

        //endsWith()
        // System.out.println("str.endsWith(\"!\"): " + str.endsWith("World!"));

        //equals()
        // System.out.println("str.equals(\"Hello World!\"): " + str.equals("Hello World!"));

        //equalsIgnoreCase()
        // System.out.println("str.equalsIgnoreCase(\"hello world!\"): " + str.equalsIgnoreCase("hello world!"));

        //format()
        // System.out.println("String.format(\"%s\", str): " + String.format("str is %s, %d", str, 456));

        //getChars()
        // char[] chars = new char[5];
        // "This_is Source String".getChars(0, 5, chars, 0);
        // for (char c : chars) {
        //     System.out.println(c);
        // }

        //indexOf()
        // System.out.println("str.indexOf(\"o\"): " + str.indexOf("o"));

        //intern() - if the same string is already in the pool, it returns the reference to the same string, otherwise it creates a new string in the pool and returns the reference to it.
        // System.out.println("str.intern(): " + str.intern());

        //isEmpty()
        // System.out.println("str.isEmpty(): " + str.isEmpty());

        //join()
        // System.out.println("String.join(\" \", \"Hello\", \"World!\"): " + String.join("-", "Hello", "World!", "Hello", "World!"));

        //lastIndexOf()
        // System.out.println("str.lastIndexOf(\"o\"): " + str.lastIndexOf("o"));

        //length()
        // System.out.println("str.length(): " + str.length());

        //replace()
        // System.out.println("str.replace(\"o\", \"a\"): " + str.replace("o", "a"));

        //replaceAll()
        // System.out.println("str.replaceAll(\"o\", \"a\"): " + str.replaceAll("o", "a"));

        //split()
        // String[] strArr = str.split(" ");
        // for (String s : strArr) {
        //     System.out.println(s);
        // }

        //startsWith()
        // System.out.println("str.startsWith(\"H\"): " + str.startsWith("H"));

        //substring()
        // System.out.println("str.substring(0, 5): " + str.substring(0, 5));

        //toLowerCase()
        // System.out.println("str.toLowerCase(): " + str.toLowerCase());

        //toUpperCase()
        // System.out.println("str.toUpperCase(): " + str.toUpperCase());

        //trim()
        // System.out.println("\"      ab cd     \".trim(): " + "-" + "      ab cd     ".trim() + "-");
        
        //valueOf()
        // System.out.println("String.valueOf(123): " + String.valueOf(123));
    }
}

/*
String Methods:

1. String charAt()
2. String compareTo()
3. String concat()
4. String contains()
5. String endsWith()
6. String equals()
7. equalsIgnoreCase()
8. String format()
9. String getBytes()
10. String getChars()
11. String indexOf()
12. String intern()
13. String isEmpty()
14. String join()
15. String lastIndexOf()
16. String length()
17. String replace()
18. String replaceAll()
19. String split()
20. String startsWith()
21. String substring()
22. String toCharArray()
23. String toLowerCase()
24. String toUpperCase()
25. String trim()
26. String valueOf()

Tasks:

1. Email Validation:
   Write a program that validates an email address entered by a user. Use the 'String contains()' method to check if it contains the "@" symbol and a period. Ensure that the email address follows a valid format.

2. Username Availability:
   Create a registration system where users enter a username. Use the 'String equals()' method to check if the entered username matches any existing usernames in a database to ensure it's unique.

3. Formatting a Phone Number:
   Build a utility that takes an input string containing digits and formats it as a phone number with dashes. Utilize the 'String format()' method to achieve this.

4. Password Strength Checker:
   Develop a program that checks the strength of a password provided by a user. Use the 'String length()' method to assess the length of the password, and 'String contains()' to check for specific characters (e.g., special symbols, numbers, uppercase, lowercase).

5. Search and Replace:
   Write a text editor that allows users to search for a specific word or phrase within a document and replace it with another. Implement this functionality using the 'String replace()' method.

6. Word Count in a Text:
   Create an application that counts the occurrences of a specific word in a given text. Use the 'String split()' method to break the text into words, and then count the occurrences of the target word.

7. URL Parsing:
   Build a URL parser that extracts the domain name from a given URL. Utilize the 'String indexOf()', 'substring()', and 'startsWith()' methods to extract the relevant information.

8. Case-Insensitive User Login:
   Implement a login system that allows users to log in with their usernames regardless of the case. Use the 'equalsIgnoreCase()' method to compare the entered username with the stored usernames.

9. CSV Data Processing:
   Create a program that reads data from a CSV file and performs various operations. Utilize the 'String split()' method to parse each line of the CSV file and process the data accordingly.

10. Removing Extra Spaces:
    Develop a tool that takes a user's input, which may contain extra spaces at the beginning, middle, or end, and cleans it by removing unnecessary spaces. Use the 'String trim()' method to achieve this.

*/