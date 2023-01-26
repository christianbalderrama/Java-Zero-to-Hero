package Refresher.Classes;

public class StringBuilders {
    public static void main(String[] args) {
        /**
         * StringBuilder is a peer class of String that provides much of the functionality of strings.
         * The string represents fixed-length, immutable character sequences
         * while StringBuilder represents growable and writable character sequences
         *
         * StringBuilder may have characters and substrings inserted in the middle or appended to the end.
         * It will automatically grow to make room for such additions and often has more characters preallocated
         * than are actually needed, to allow room for growth.
         *
         * StringBuilder class is used to create mutable (modifiable) string.
         * The StringBuilder class in java is same as String class except it is mutable i.e. it can be changed.
         */

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println();

        // Default capacity is set to 16 otherwise specific either an `int` or `String` length.
        System.out.println("==================================");
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder(90);
        StringBuilder s3 = new StringBuilder("ChristianAngelesBalderrama");
        System.out.println("S1 Capacity: " + s1.capacity());
        System.out.println("S2 Capacity: " + s2.capacity());
        System.out.println("S3 Capacity: " + s3.capacity());
        System.out.println("==================================");
        System.out.println();

        // append() method concatenates the given argument with this string
        System.out.println("==================================");
        StringBuilder sb1 = new StringBuilder("Hello");
        sb1.append(" Java");
        System.out.println("APPEND: " + sb1);
        System.out.println("==================================");
        System.out.println();


        // The replace() method replaces the given string from the specified beginIndex and endIndex-1.
        System.out.println("==================================");
        StringBuilder sb2 = new StringBuilder("Hello C++");
        sb2.replace(sb2.indexOf("C"), sb2.lastIndexOf("+") + 1, "Java");
        System.out.println("REPLACE: " + sb2);
        System.out.println("==================================");
        System.out.println();

        // delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1.
        System.out.println("==================================");
        StringBuilder sb3 = new StringBuilder("Delete me");
        sb3.delete(sb3.indexOf("m"), sb3.lastIndexOf("e") + 1);
        System.out.println("DELETE: " + sb3);
        System.out.println("==================================");
        System.out.println();

        // reverse() method of StringBuilder class reverses the current string:
        System.out.println("==================================");
        StringBuilder sb4 = new StringBuilder("Reverse");
        sb4.reverse();
        System.out.println("REVERSE: " + sb4);
        System.out.println("==================================");
        System.out.println();

        System.out.println("==================================");
        System.out.println("==================================");
        System.out.println();

        // length() - returns the size of the string
        System.out.println("==================================");
        StringBuilder sb5 = new StringBuilder("length");
        System.out.println("LENGTH: " + sb5.length());
        System.out.println("==================================");
        System.out.println();

        // charAt() - returns the character given an index
        System.out.println("==================================");
        StringBuilder sb6 = new StringBuilder("char");
        System.out.println("CHAR AT: " + sb6.charAt(sb6.indexOf("h")));
        System.out.println("==================================");
        System.out.println();

        // insert() - inserts the string representation of given data type at given position
        System.out.println("==================================");
        StringBuilder sb7 = new StringBuilder("inser");
        sb7.insert(sb7.length(), "t");
        System.out.println("INSERT: " + sb7);
        System.out.println("==================================");
        System.out.println();

        // delete()
        System.out.println("==================================");
        StringBuilder sb8 = new StringBuilder("DELETE ME");
        sb8.delete(sb8.indexOf("ME"), sb8.length());
        System.out.println("DELETE: " + sb8);
        System.out.println("==================================");
        System.out.println();

        // deleteCharAt
        System.out.println("==================================");
        StringBuilder sb9 = new StringBuilder("DELETE CHAR AT");
        sb9.deleteCharAt(sb9.indexOf("AT"));
        System.out.println("DELETE CHAR AT: " + sb9);
        System.out.println("==================================");
        System.out.println();
    }
}
