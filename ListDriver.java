import java.util.List;

public class ListDriver {
    public static void main(String[]args) {
        list<String> glist = new list<String>(10);
        glist.add("milk");
        glist.add("watermelon");
        System.out.println("Grocery list:" + glist.toString());
    }
}
