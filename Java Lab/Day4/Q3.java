import java.util.ArrayList;

public class Q3 {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        // a.add("Red","Green","Blue","Yellow","Black")
        a.add("Red");
        a.add("Green");
        a.add("Blue");
        a.add("Yellow");
        a.add("Black");
        System.out.println("Before " + a.toString());
        a.set(1, "Pink");
        System.out.println("After "+a.toString());
    }
}
