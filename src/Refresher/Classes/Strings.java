package Refresher.Classes;

public class Strings {
    public static void main(String[] args) {
        System.out.println("==================================");
        System.out.println("Hello world!");
        System.out.println("==================================");
        System.out.println();
        String test = "test".concat("s");
        String test2 = "tests";

        // charAt - gets the specific letter in the string as string can be represented as an array of characters
        System.out.println("==================================");
        System.out.println(test.charAt(1));
        System.out.println("==================================");
        System.out.println();

        // getChar - Copies characters from this string into the destination character array.
        char[] characters = new char[test.length() - 1];
        test.getChars(0, test.length() - 1, characters, 0);
        System.out.println("==================================");
        System.out.println("Characters: " + characters);
        System.out.println("==================================");
        System.out.println();

        // getByte - convert string into byte representation
        byte[] bytes = test.getBytes();
        System.out.println("==================================");
        System.out.println("BYTES: " + bytes);
        System.out.println("==================================");
        System.out.println();

        // equals - returns true if string represents the same sequence of characters as this object
        // remember, string is an object.
        // == checks only the object reference, not the character sequence.
        System.out.println("==================================");
        System.out.println(test == test2);
        System.out.println("EQUALS: " + test.equals(test2));
        System.out.println("==================================");
        System.out.println();

        // contentEquals - only checks the content and accepts any type of other string classes but not object.
        System.out.println("==================================");
        System.out.println("CONTENT EQUALS: " + test.contentEquals(test2));
        System.out.println("==================================");
        System.out.println();

        StringBuffer s = new StringBuffer("tests");
        System.out.println("==================================");
        System.out.println("CONTENT EQUALS: " + s.equals(test));
        System.out.println("CONTENT EQUALS: " + test.contentEquals(s));
        System.out.println("==================================");
        System.out.println();

        // equalsIgnoreCase
        System.out.println("==================================");
        System.out.println("EQUALS IGNORE CASE: " + test.equalsIgnoreCase("tEstS"));
        System.out.println("EQUALS IGNORE CASE: " + test=="tEstS");
        System.out.println("==================================");
        System.out.println();

        // startsWith
        System.out.println("==================================");
        System.out.println("STARTS WITH: " + test.startsWith("te"));
        System.out.println("STARTS WITH: " + test.startsWith("et"));
        System.out.println("STARTS WITH: " + test.startsWith("")); // beware of this as this is always true :)
        System.out.println("==================================");
        System.out.println();

        // endsWith
        System.out.println("==================================");
        System.out.println("ENDS WITH: " + test.endsWith("te"));
        System.out.println("ENDS WITH: " + test.endsWith("ts"));
        System.out.println("ENDS WITH: " + test.endsWith("")); // beware of this as this is always true :)
        System.out.println("==================================");
        System.out.println();

        // indexOf - returns the first index. Can be supplied by a single character or string
        System.out.println("==================================");
        System.out.println("INDEX OF: " + test.indexOf("ts"));
        System.out.println("INDEX OF: " + test.indexOf("te"));
        System.out.println("INDEX OF: " + test.indexOf("tests"));
        System.out.println("INDEX OF: " + test.indexOf("zz"));
        System.out.println("==================================");
        System.out.println();

        // lastIndex - returns the last index. Can be supplied by a single character or string
        System.out.println("==================================");
        System.out.println("LAST INDEX OF: " + test.lastIndexOf("ts"));
        System.out.println("LAST INDEX OF: " + test.lastIndexOf("es"));
        System.out.println("LAST INDEX OF: " + test.lastIndexOf("tests"));
        System.out.println("LAST INDEX OF: " + test.lastIndexOf("zz"));
        System.out.println("==================================");
        System.out.println();

        // substring - returns a new string that is a substring of this string.
        System.out.println("==================================");
        System.out.println("SUBSTRING: " + test.substring(1)); // can be said as start from index 1 to end
        System.out.println("SUBSTRING: " + test.substring(1, 3)); // can be said as start from index 1 to 3rd index only
        System.out.println("==================================");
        System.out.println();

        // replace
        System.out.println("==================================");
        System.out.println("REPLACE: " + test.replace("t", "x")); // can be one character
        System.out.println("REPLACE: " + test.replace("tes", "xes")); // or a whole sequence of characters
        System.out.println("==================================");
        System.out.println();

        // split
        System.out.println("==================================");
        String[] splitArr = "first second".split(" ");
        System.out.println("SPLIT: " + splitArr[0]);
        System.out.println("SPLIT: " + splitArr[1]);
        System.out.println("==================================");
        System.out.println();

        // toLowerCase
        System.out.println("==================================");
        System.out.println("TO LOWERCASE: " + "ASDASDASDASD".toLowerCase());
        System.out.println("==================================");

        // toUpperCase
        System.out.println("==================================");
        System.out.println("TO UPPERCASE: " + "dxx".toUpperCase());
        System.out.println("==================================");

        // trim - returns a copy of string with leading and trailing whitespaces omitted.
        System.out.println("==================================");
        String trim = " I HAVE A SPACE ";
        System.out.println("TRIM:" + trim.trim());
        System.out.println("==================================");
        System.out.println();

        // toCharArray - converts string to char array
        System.out.println("==================================");
        char[] charArr = "charArray".toCharArray();
        for (char x : charArr) {
            System.out.println("LETTER: " + x);
        }
        System.out.println("==================================");
        System.out.println();

        // valueOf - converts other data types to String
        int num = 1;
        String numString = String.valueOf(num);
        System.out.println("==================================");
        System.out.println("VALUE OF: " + numString.getClass().getSimpleName());
        System.out.println("==================================");
        System.out.println();
    }
}
