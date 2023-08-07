import java.util.HashMap;
import java.util.Map.Entry;;

public class RetrieveKeyAndValue {
    public static void main(String[] args) {
        HashMap<Integer, String> mp = new HashMap<Integer,String>();
        mp.put(1,"Red");
        mp.put(2,"Yellow");
        mp.put(3,"Green");
        mp.put(4,"Violet");
        mp.put(5,"Blue");

        for(Entry<Integer,String> it : mp.entrySet()){
            System.out.println("The Key is " + it.getKey() + " and the value is " + it.getValue());
        }
    }
}
