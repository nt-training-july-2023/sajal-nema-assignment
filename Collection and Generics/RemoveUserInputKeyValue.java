import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;
public class RemoveUserInputKeyValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> students = new HashMap<String , Integer>();

        students.put("Sajal" , 91);
        students.put("Ram",97);
        students.put("Rahul" , 99);
        students.put("Vivek",88);
        students.put("John",97);

        int ValueToDelete = sc.nextInt();
        String[] allKeysToDel = new String[students.size()];
        int i=0;
        for(Entry<String,Integer>it : students.entrySet()){
            if(it.getValue() == ValueToDelete){
                allKeysToDel[i++] = it.getKey();
            }
        }

        for(int j=0;j<allKeysToDel.length;j++){
            students.remove(allKeysToDel[j]);
        }
        System.out.println("The value of map after removing Value are : " + students);
        sc.close();
    }
}
