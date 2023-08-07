import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;


public class InputStreamClass{
    public static void main(String[] args) throws FileNotFoundException,IOException{
       
        //FileInputStream
        System.out.println("------------------FileInputStream--------------------");
        InputStream obj = new FileInputStream("C:\\Users\\sajal\\Desktop\\Java\\Basics of Java\\StringMethods.java");
        
        System.out.println(obj.markSupported());  
        int availableBytes = obj.available(); //Returns Total Bytes
        System.out.println(availableBytes);
        
        System.out.println("Before Skip , total bytes to read are " +  obj.available());
        obj.skip(200);
        System.out.println("After Skip , total bytes to read are " +  obj.available());
        
        int b1;
        while((b1 = obj.read()) != -1){
            System.out.print((char)b1);
        }
        obj.close();

        //ByteArrayInputSream
        System.out.println("------------------ByteArrayInputStream--------------------");
        byte[] byteArray = {34, 53 , 35, 35 , 24 , 3 , 65};
        InputStream obj2 = new ByteArrayInputStream(byteArray);
        int byteData;
        while((byteData = obj2.read()) != -1){
            System.out.println((char)byteData);
        }
        obj2.close();

        //BufferedInputStream
        System.out.println("-----------------BufferedInputStream-----------------------");
        InputStream obj3 = new FileInputStream("C:\\Users\\sajal\\Desktop\\Java\\LambdaExpression and Java IO\\textFile.txt");
        BufferedInputStream bufferInpStream = new BufferedInputStream(obj3);

        int bufferData;
        while((bufferData = bufferInpStream.read()) != -1){
            System.out.println((char) bufferData);
        }
        bufferInpStream.close();


        //DataOutputStream
        OutputStream obj4 = new FileOutputStream("C:\\Users\\sajal\\Desktop\\Java\\LambdaExpression and Java IO\\file.dat");
        DataOutputStream dout = new DataOutputStream(obj4);
        dout.writeDouble(132.23);
        dout.writeInt(242);
        dout.writeBoolean(false);
        dout.writeChar('A');
        dout.close();

        //DataInputStream
        System.out.println("------------------DataInputStream--------------------");
        InputStream obj5 = new FileInputStream("C:\\Users\\sajal\\Desktop\\Java\\LambdaExpression and Java IO\\file.dat");
        DataInputStream dataInputStream = new DataInputStream(obj5);
        double val1 = dataInputStream.readDouble();
        int val2 = dataInputStream.readInt();
        boolean val3 = dataInputStream.readBoolean();
        char val4 = dataInputStream.readChar();
        System.out.println("Double Value in dataType file is " + val1);
        System.out.println("Int Value in dataType file is " + val2);
        System.out.println("Boolean Value in dataType file is " + val3);
        System.out.println("Char Value in dataType file is " + val4);
        dataInputStream.close();

    


        //FileOutputStream in OutStream
        OutputStream Osobj = new FileOutputStream("C:\\Users\\sajal\\Desktop\\Java\\LambdaExpression and Java IO\\outputStreamOutput.txt", false);
        String content = "This is my content to put it into my OutputStreamOutput File.";
        
        for(int i = 0;i<content.length();i++){
            Osobj.write(content.charAt(i));
        }
        
        Osobj.close();

    }
}