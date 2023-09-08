import java.util.Scanner;

public class BasicStr {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        String s3;
        s3 = "Hello World";

        String s4;

        System.out.println("Enter a string: ");
        // s4 = System.console().readLine();
        s4 = new Scanner(System.in).nextLine();

        System.out.println("s1: " + s1 + "\ns2: " + s2 + "\ns3: " + s3 + "\ns4: " + s4);

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

*/

/*
String Tasks:

1. String Concatenation: Modify the code to concatenate 's1', 's2', and 's3' into a single string and print the result. For example, if 's1' is "Hello," 's2' is "World," and 's3' is "Hello World," the program should output "Hello WorldHelloWorld."

2. String Length: Calculate and display the length of each string ('s1', 's2', 's3', and 's4') in characters. Ensure that the program correctly counts the number of characters in each string.

3. String Comparison: Implement a comparison mechanism to check if 's4' is equal to 's3'. If they are equal, print "s4 is equal to s3," otherwise, print "s4 is not equal to s3."

4. String Manipulation: Modify the program to take an additional user input (a string) and then check if 's3' contains the user-input string. If it does, print "s3 contains the user input," otherwise, print "s3 does not contain the user input."

5. String Case Conversion: Convert 's4' to uppercase and 's2' to lowercase. Print both modified strings. Ensure that the original strings remain unchanged.

6. Word Count: Create a program that takes a sentence as input and counts the number of words in it without using any string methods.
Example:
    Input: "Hello World"

    Output: 2

7. Password Strength Checker: Build a password strength checker that assesses a user's password based on criteria such as length, special characters, and uppercase/lowercase letters.
Example:
    Input: "HelloWorld"

    Output:
    Password length is too short.
    Password does not contain any special characters.
    Password does not contain any uppercase letters.

8. Email Validation: Implement an email validator that checks whether a given string is a valid email address without using regular expressions or string methods.
Example:
    Input: abc@gmail.com

    Output: Valid email address

    Input: abc@gmail

    Output: Invalid email address

9. Palindrome Checker: Develop a program that determines if a given word or phrase is a palindrome (reads the same forwards and backwards) without using string reversal functions.
Example:
    Input: "racecar"

    Output: "racecar is a palindrome"

    Input: "hello"

    Output: "hello is not a palindrome"

10. Sentence Capitalization: Create a function that capitalizes the first letter of each word in a sentence without using any string methods.

11. URL Parser: Design a program that parses a URL into its components (scheme, host, path, query, etc.) without using any string methods.
Example:
    Input: https://www.google.com/search?q=youtube

    Output:
    Scheme: https
    Host: www.google.com
    Path: /search
    Query: q=youtube

12. Anagram Checker: Write a function that checks if two words are anagrams of each other (contain the same characters in different orders) without using string sorting or manipulation functions.
Example:
    Input: "listen", "silent"

    Output: "listen and silent are anagrams"

    Input: "hello", "goodbye"

    Output: "hello and goodbye are not anagrams"

*/