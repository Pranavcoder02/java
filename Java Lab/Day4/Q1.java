// Q1) In which collection classes null is not allowed? Duplicate null is not allowed? Multiple nulls are
// allowed?
// Hint: //Collection<String> c = new ArrayList<>();
// //Collection<String> c = new LinkedList<>();
// //Collection<String> c = new HashSet<>();
// //Collection<String> c = new TreeSet<>();
// c.add("A");
// c.add("B");
// c.add("C");
// c.add(null);
// c.add(null);
// c.add(null);
// System.out.println(c.toString());

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        // Collection<String> c = new ArrayList<>();  // null is allowed
        // Collection<String> c = new LinkedList<>(); // null is allowed
        // Collection<String> c = new HashSet<>(); // duplicate nulls are not allowed but single null is allowed
         Collection<Integer> s = new TreeSet<>();

        // c.add("A");
        // c.add("B");
        // c.add("C");
        // c.add(null);
        // c.add(null);
        // c.add(null);

        s.add(5);
        s.add(3);
        s.add(6);
        
        // s.add(null);
        // s.add(null);
        // s.add(null);
        System.out.println("Result: " + s.toString());
    }
}
