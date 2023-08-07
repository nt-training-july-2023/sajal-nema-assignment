import java.util.HashSet;
import java.util.Iterator;

public class UniqueStringElement {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        set.add("Apple");
        set.add("Banana");
        set.add("Apple");
        
        System.out.println(set);

        for(Iterator<String>it = set.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
