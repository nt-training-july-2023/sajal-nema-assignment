import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyTextFileContentToAnother {
    public static void main(String[] args) throws FileNotFoundException , IOException{
        File f1 = new File("SourceFile.txt");
        BufferedReader br = new BufferedReader(new FileReader(f1));
        
        File f2 = new File("DestFile.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(f2));

        String line;
        while((line = br.readLine()) != null){
            bw.write(line);
        }
        br.close();
        bw.close();
    }
}
