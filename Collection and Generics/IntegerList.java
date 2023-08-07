import java.util.ArrayList;
import java.util.Iterator;

public class IntegerList {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>(20);
        
        for(int i=0;i<20;i++){
            list.add(i+1);
        }

        System.out.println(list);
        
        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
