import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file from where you want to read data: ");
        String fileName = sc.nextLine();
        BufferedReader reader = null;       
        try{
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
            System.out.println("Error: File not found " + e.getMessage());
        }catch(IOException e){
            System.out.println("Error: occurred while fetching the data from file " + e.getMessage());
        }finally{
            reader.close();
            sc.close();
        }
        
    }
}
