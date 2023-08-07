import java.io.*;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\sajal\\Desktop\\Java\\OOPs\\data.properties");
        p.load(fis);
        System.out.println(p);
        // {roll_no="ABC2212", age=22, name="Sajal"}

        String name = p.getProperty("name");
        System.out.println(name);

        p.setProperty("language", "English , Hindi");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\sajal\\Desktop\\Java\\OOPs\\data.properties");
        p.store(fos, "Adding a new property name Language");



    }
}
