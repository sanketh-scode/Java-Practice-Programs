import java.io.FileWriter;
import java.io.IOException;
public class WriteFile {
    public static void main(String[] args) {
        try{
        FileWriter writer=new FileWriter("myfile.txt");
        writer.write("hello.. this is my first time for write content in file");
        writer.close();
        System.out.println("Successfully written.");
        }
        catch(IOException e){
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
    
}
