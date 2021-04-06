package session3;
import java.util.Scanner;
public class DrawFigure1 {
    public static void main(String[] args) {
        drawLine();
        drawTop();
        drawBottom();
        drawLine();
    }

    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    public static void drawTop() {
        for (int line = 1; line <= 3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.print("\\");
            for (int i = 1; i <= (6 - 2 * line); i++) {
                System.out.print(".");
            }
            System.out.print("/");
            for (int i = 1; i <= (line - 1); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void drawBottom() {
        for (int line = 1; line <=3; line++) {
            System.out.print("|");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.print("/");
            for (int i = 1; i <= 2 * (line - 1); i++) {
                System.out.print(".");
            }
            System.out.print("\\");
            for (int i = 1; i <= (3 - line); i++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }
}

