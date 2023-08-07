import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class ReadFromAndWriteTo {
    public static void main(String[] args) throws IOException{
        System.out.println("Enter the name of the file to read data from");
        Scanner sc = new Scanner(System.in);

        String readingFile = sc.next();

        System.out.println("Enter the name of the file where to write data into");
        String writingFile = sc.next();

          try{
              BufferedReader reader = new BufferedReader(new FileReader(readingFile));
              BufferedWriter writer = new BufferedWriter(new FileWriter(writingFile));
               String line;
               while((line = reader.readLine()) != null){
                   writer.write(line);
                   writer.newLine();
               }
               reader.close();
               writer.close();
           System.out.println("File Copied Successfully");
      }catch(IOException e){
        System.out.println("Error occurred while copying the file : " + e.getMessage());
      }finally{
        sc.close();
      }
    }
}
