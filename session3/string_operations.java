package session3;

import java.util.Scanner;

public class string_operations {
    public static void main(String[] args) {

        String str = "Java is cool!";
        System.out.println(str.length());       //return int 13
        System.out.println(str.charAt(2));      //       char 'v'
        System.out.println(str.charAt(5));      //       char 'i'

        String anotherStr = "Java is COOL!";
        System.out.println(str.equals(anotherStr));             //return boolean false
        System.out.println(str.equalsIgnoreCase(anotherStr));   //               true
        System.out.println(anotherStr.equals(str));             //               false
        System.out.println(anotherStr.equalsIgnoreCase(str));   //               true
        // (str == anotherStr) to compare two Strings is WRONG!!!
    }
}
