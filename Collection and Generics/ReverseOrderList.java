import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;
import java.util.Collections;

public class ReverseOrderList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(
            Arrays.asList(21,43,5,63,67,34)
        );
        
        //Using Collections Class
        // Collections.reverse(list);
        // System.out.println(list);

        //Using ListIterator
        ListIterator it = list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.print(it.previous() + "  , ");
        }

    }
}
