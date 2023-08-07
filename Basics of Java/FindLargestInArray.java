public class FindLargestInArray {
  public static void main(String[] args){
    int a[] ={11,14,3,8,56};
    int ans = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
       ans =  Math.max(ans,a[i]);
    }
    System.out.println(ans);
  }  
}
