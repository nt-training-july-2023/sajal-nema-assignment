import java.util.HashMap;

public class MapContainsKeyOrValue {
    public static void main(String[] args) {
        HashMap<String,String>mp = new HashMap<String,String>();
        mp.put("SuperMan" , "Truth, Justice and a Better Tomorrow");
        mp.put("SpriderMan" , "With great power comes great responsibility");
        mp.put("BatMan" , "A hero can be anyone");
        mp.put(null,null);

        System.out.println("The Superman key is available " + mp.containsKey("SuperMan") + " and the value is present " + mp.containsValue("Truth, Justice and a Better Tomorrow"));
        System.out.println("The IronMan key is available " + mp.containsKey("IronMan"));
        System.out.println("The null key is available " + mp.containsKey(null) + " and it contains null value " +  mp.containsValue(null));
    }
}
