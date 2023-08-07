public class FindAverage {
    public static void main(String[] args) {
        int a[] = {12,34,23,22,43};
        int sum = 0;
        int n = a.length ;
        for(int i=0;i<n;i++){
            sum += a[i];
        }
        System.out.println("Average of Array element is " + sum/n);
        
    }
}
