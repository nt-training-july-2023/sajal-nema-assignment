import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamInJava{
    public static void main(String[] args) throws IOException{
        InputStream obj1 = new FileInputStream("in.txt");
        FilterInputStream fis = new BufferedInputStream(obj1);

        int b;
        while((b = fis.read()) != -1){
            System.out.println("Character : " + (char)b);
            //Modify the data by uppercase all character
            System.out.println(Character.toUpperCase((char)b));
        }
        fis.close();
    }
}