package session3;
import java.util.Scanner;
public class string_operations_2 {
    public static void main(String[] args) {

        String str = "Java is cool!";
        System.out.println(str.length());               //return int 13
        System.out.println(str.charAt(2));              //       char 'v'
        System.out.println(str.substring(0, 3));        //       String "Jav"
        System.out.println(str.indexOf('a'));           //       int 1
        System.out.println(str.lastIndexOf('a'));   //        int 3
        System.out.println(str.endsWith("cool!"));      //        boolean true
        System.out.println(str.toUpperCase());          //        a new String "JAVA IS COOL!"
        System.out.println(str.toLowerCase());          //        a new String "java is cool!"
    }
}
