package session3;
import  java.util.Scanner;
public class Converting_char_to_int {
    public static void main(String[] args) {

        char hexChar = 'a';
        int dec;
        {

            if (hexChar >= '0' && hexChar <= '9') {
                dec = hexChar - '0';       //int 0-9
            } else if (hexChar >= 'A' && hexChar <= 'F') {
                dec = hexChar - 'A' + 10;       //int 10-15
            } else if (hexChar >= 'a' && hexChar <= 'f') {
                dec = hexChar - 'a' + 10;       //int 10-15
            } else {
                dec = -1;      //to overcome variable have not been initialized error
                System.out.println("Invalid hex char");
            }
            System.out.println(hexChar + ": " + dec);
        }
    }
}
