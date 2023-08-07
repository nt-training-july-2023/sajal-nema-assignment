import java.util.ArrayList;
import java.util.Iterator;

public class StringElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>(20);
        String val = "";
        for(byte ch = 65;ch <= 85;ch++){
          val = val+(char)ch;
          list.add(val);
        }

        for(Iterator<String> it = list.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
}
