public class String_Buffer {
    public static void main(String[] args) {
        StringBuffer sbuff = new StringBuffer();

        sbuff.append("Hello World!");
        System.out.println("sbuff: " + sbuff);
        System.out.println("sbuff.length(): " + sbuff.length());
        System.out.println("sbuff.capacity(): " + sbuff.capacity());

        sbuff.setLength(30);  //old capacity * 2 + 2
        System.out.println("sbuff.length(): " + sbuff.length());
        System.out.println("sbuff.capacity(): " + sbuff.capacity());

    }
}
/*
StringBuffer:
    > StringBuffer is a mutable sequence of characters.
    > StringBuffer is a class in java.lang package.
    > StringBuffer is used to create mutable (changeable) string.
    > StringBuffer is thread safe.
    > StringBuffer is slower than StringBuilder because it is thread safe.
    > StringBuffer is used when we want to make a lot of modifications to a string of characters.

Methods:

same as StringBuilder class.
*/