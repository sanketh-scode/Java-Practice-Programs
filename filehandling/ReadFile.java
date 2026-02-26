import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        try{
        File R=new File("myfile.txt");
        Scanner read=new Scanner(R);
        while (read.hasNextLine()) {
            String mess=read.nextLine();
            System.out.println(mess);
            

        }
        read.close();
    }
        
        catch(FileNotFoundException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    
    
    
}
}
