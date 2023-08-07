import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class CrudInMap {
    public static void main(String[] args) {
        Map<Integer,String> hashMap = new HashMap<Integer,String>();

        //HashMap Operation : Natural Ordering (or Ascending) , Non-synchronized 
        //Add

        hashMap.put(5,"Sajal");
        hashMap.put(1,"Rahul");

        //Temporary HashMap
        Map<Integer,String> tempHashMap = new HashMap<Integer,String>();
        tempHashMap.put(1,"Ram");
        tempHashMap.put(2,"Rohit");
        tempHashMap.put(3,"Raman");
        //putAll
        hashMap.putAll(tempHashMap);
        
        //Insert Null value
        hashMap.put(7,null);
        hashMap.put(null,"Hello");
        hashMap.put(null,"Hello Again");
        hashMap.put(9,null);
        System.out.println(hashMap);    //{0=Sajal, 1=Ram, 2=Rohit, 3=Raman}
        System.out.println("KEY 1 is present "  + hashMap.containsKey(1));

        System.out.println("The value of Key 1 is " + hashMap.get(1));

        System.out.println("All the entries of hashMap are " + hashMap.entrySet());

        //Interate over the map
        for(Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println("The Key is " + entry.getKey() + " and the Value is " + entry.getValue());
        }

        hashMap.replace(2,"Replaced");
        System.out.println("Replace value for 2 is " + hashMap.get(2));
        System.out.println("All value then " + hashMap.entrySet());

        // boolean isRemoved =  hashMap.remove(null,"Hello Again");
        // System.out.println("All value after removing null value with associated Hello Again Value " + hashMap.entrySet() + " " + isRemoved);

        //Get all Values
        System.out.println(hashMap.values());

        //Get all Keys
        System.out.println(hashMap.keySet());

        //size()
        System.out.println(hashMap.size());


        System.out.println("---------------------LinkedHashMap---------------------");
        //LinkedHashMap Operations : Preserve Insertion order , faster , Non-Synchronized
        Map<Integer,String> linkHashMap = new LinkedHashMap<Integer,String>();
        linkHashMap.put(1,"Apple");
        linkHashMap.put(2,"Banana");
        linkHashMap.put(3,"PineApple");

        System.out.println(linkHashMap);

        System.out.println(linkHashMap.size());

        linkHashMap.replace(2,"Banana", "Replaced Value");
        System.out.println("After Updating " + linkHashMap);

        //Iterate over a map 
        for(Entry<Integer,String> mp : linkHashMap.entrySet()){
            System.out.println("The key of map is value " + mp.getKey() + " and the corresponding value is " + mp.getValue());
        }

        linkHashMap.put(23,null);
        linkHashMap.put(100,null);
        linkHashMap.put(8,null);
        linkHashMap.put(null,"Null Value");
        linkHashMap.put(null,"Null Value2");

        System.out.println(linkHashMap);

        System.out.println(linkHashMap.size());

        System.out.println(linkHashMap.keySet());
        System.out.println(linkHashMap.values());

        System.out.println("Removing item : " + linkHashMap.remove(null));
        System.out.println("After removing " + linkHashMap);

        //TreeMap Operations : Sorted according to natural ordering of key , T.C= O(logn) 
        Map<Integer,String> treeMap = new TreeMap<Integer,String>();
        treeMap.put(1,"Maruti");
        treeMap.put(2,"Tata");
        treeMap.put(3,"Suzuki");

        System.out.println(treeMap.size());

        System.out.println(treeMap);

        treeMap.replace(2,"Tata", "BMW");
        System.out.println("After Updating Values " + treeMap);

        Map<Integer,String> equalLinkedHashMap = new LinkedHashMap<Integer,String>();
        equalLinkedHashMap.put(1,"Maruti");
        equalLinkedHashMap.put(2,"BMW");
        equalLinkedHashMap.put(3,"Suzuki");

        System.out.println(treeMap.equals(equalLinkedHashMap));       //true

        //Iterate over a map
        for(Entry<Integer,String> treeMapIt : treeMap.entrySet()){
            System.out.println("The key is " + treeMapIt.getKey() + " and the value is " +  treeMapIt.getValue());
        }

    }

}
