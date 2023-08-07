import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FilterOutputStreamInJava{
    public static void main(String[] args) throws FileNotFoundException , IOException{
        OutputStream obj1 = new FileOutputStream("FilterOutput.txt");
        FilterOutputStream fos = new FilterOutputStream(obj1);
        fos.write(65);
    
        byte[] buffer = {65,66,67,97,98,99};
        fos.write(buffer);

        String msg = "Hello Sajal!";
        byte[] byteData = msg.getBytes();
        for(byte ch : byteData){
            fos.write(Character.toUpperCase((char)ch));
        }
        fos.write(byteData);

        fos.close();
    }
}