package session11;

import java.util.ArrayList;
import java.util.List;

public class SearchElementsInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Does names array contain \"Bob\" ? " + names.contains("Bob"));
        System.out.println("IndexOf \"Bob\" : " + names.indexOf("Bob"));
        System.out.println("IndexOf \"David\" : " + names.indexOf("David"));
        System.out.println("LastIndexOf \"Steve\" : " + names.lastIndexOf("Steve"));
        System.out.println("LastIndexOf \"Alice\" : " + names.lastIndexOf("Alice"));
    }
}
