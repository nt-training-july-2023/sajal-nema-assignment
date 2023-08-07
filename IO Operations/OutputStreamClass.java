import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamClass {
    public static void main(String[] args) throws FileNotFoundException , IOException{
        //FileOutStream
        System.out.println("---------------FileOutputStream------------------------");
        OutputStream obj1 = new FileOutputStream("output.txt");
        String msg = "Hello , This is writing in Output.txt file from OutputStreamClass File.";
        byte [] byteData = msg.getBytes();
        for(byte b=0;b<byteData.length;b++){
            System.out.println(byteData[b]);
        }
        obj1.write(byteData);
        obj1.close();

        //BufferedOutputStream
        //System.out.println("---------------BufferedArrayOutputStream-------------------");
        OutputStream obj2 = new FileOutputStream("newOutputFile");
        BufferedOutputStream bufOut = new BufferedOutputStream(obj2);
        String str1 = "This message is created from OutputStreamClass File , by using BufferedOutputStream class";
        byte[] byteArr = str1.getBytes();
        bufOut.write(byteArr);
        bufOut.close();
    }    
}
