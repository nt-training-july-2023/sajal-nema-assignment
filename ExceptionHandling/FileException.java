import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileException{
    public static void main(String[] args) {
        String filePath = "textFile.txt";

        try{
            readTextFile(filePath);
        }catch(IOException e){
            System.out.println("Error reading the file: " + e.getMessage());
        }catch(SecurityException e){
            System.out.println("Security Exception : " + e.getMessage());
        }catch(Exception e){
            System.out.println("Unexpexted Exception : " + e.getMessage());
        }
    }

    private static void readTextFile(String filePath) throws IOException{
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null){
                System.out.println(line + " " + i);
                i++;
            }
        }finally{
                if(reader != null){
                    try{
                        reader.close();
                    }catch(IOException e){
                        System.out.println("Error Closing the file : "+ e.getMessage() );
                    }
                }
            }
        }

    }
