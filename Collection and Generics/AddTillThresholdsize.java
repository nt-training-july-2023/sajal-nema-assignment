import java.util.Scanner;
import java.util.HashMap;

public class AddTillThresholdsize{
    public HashMap<Integer,String> addTillThreshold(HashMap<Integer,String> mp , int limit ){
        while(limit>0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Please Enter the Key :");
            int key = sc.nextInt();
            System.out.println("Please Enter the Value correspoding to Key : " + key);
            String val = sc.next();
            mp.put(null, val);
            System.out.println("The Entry is Pushed into the Map with Key " + key + " with value " + val);
            limit--;
        }
        return mp;
    }
    public static void main(String[] args) {
        AddTillThresholdsize obj = new AddTillThresholdsize();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Size of Threshold : ");
        int Threshold_Size = sc.nextInt();

        HashMap<Integer,String> mp = new HashMap<Integer,String>();
        mp = obj.addTillThreshold(mp , Threshold_Size);
        System.out.println("Hey your Map is Full now .");

        sc.close();
    }
}