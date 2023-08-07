import java.util.Arrays;
import java.util.ListIterator;
import java.util.ArrayList;

public class UpdateValue {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(
            Arrays.asList(12, 32 , 44 , 33 , 120 , 43 , 33 , 24 , 78)
        );

        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasNext()){
            System.out.println(it.next());
            it.set(5);
        }
        System.out.println(list);
    }
}
