import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class InvertContent{
    public static void main(String[] args)  throws IOException , FileNotFoundException{
        File inputFile = new File("invert.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));

        String line;
        String[] list = new String[1000];
        int idx = 0;
        while((line = reader.readLine()) != null){
            list[idx++] = line + System.lineSeparator(); 
        }

        reader.close();
        idx--;
        File outputFile = new File("invertContentOutput.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        while(idx >= 0){
            writer.write(list[idx]);
            idx--;
        }
        writer.close();
    }
}
