public class AddTwoMatrix {
    public static void main(String[] args) {
        int a1[][] = {{1,2} , {2,3} , {5,6}};
        int a2[][] = {{5,8} , {6,4} , {3,5}};
    
        int row = a1.length;
        int col = a1[0].length;
    
        for(int i=0;i<row; i++){
            for(int j=0;j<col;j++){
                a1[i][j] += a2[i][j];
            }
        }


        for(int i=0;i<row; i++){
            for(int j=0;j<col;j++){
                System.out.print(a1[i][j] + "  ");
            }
            System.out.println();
        }
        
    }
}
