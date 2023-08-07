
import java.util.Map.Entry;
import java.util.HashMap;

public class PrintEmployeeIdAndName{
    // static Map<Integer , String> hashMap = new HashMap<Integer,String>();

    public HashMap<Integer,String> addEmployee(int id , String name , HashMap<Integer, String> hashMap){
        hashMap.put(id,name);
        return hashMap;
    }

    public static void main(String[] args) {
        HashMap<Integer , String> hashMap = new HashMap<Integer,String>();
        hashMap.put(2,"Sajal");
        PrintEmployeeIdAndName obj1 = new PrintEmployeeIdAndName();
        hashMap = obj1.addEmployee(0, "John",hashMap);

        for(Integer key : hashMap.keySet()){
            System.out.println("All Employee Id's are : " + key);
        }

        for(Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println("Employee Id is " + entry.getKey());
            System.out.println("Employee Name is " + entry.getValue());
        }
    }
    
}