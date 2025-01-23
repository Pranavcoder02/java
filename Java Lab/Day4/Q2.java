// Write a Java program to create a new array list, add some colors (string) and print out the collection
// as sorted list.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        Collections.addAll(l,"Red","Green","Blue","Yellow","Black");
        Collections.sort(l);
        System.out.println(l.toString());
    }
}
