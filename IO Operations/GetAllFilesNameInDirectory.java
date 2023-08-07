import java.io.File;

public class GetAllFilesNameInDirectory {
    public static void main(String[] args) {
        File obj = new File("C:\\Documents");
        String []allFiles = obj.list();

        for(String filename : allFiles){
            System.out.println(filename);
        }        
    }    
}
