import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class DisplayLessThanSixty {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>(
            Arrays.asList(23,43,66,67,34,200,45,67,33,56)
        );
        for(Iterator<Integer>it = list.iterator(); it.hasNext();){
            int curr = it.next();
            if(curr < 60){
                System.out.println(curr);
            }
        }
    }
}
