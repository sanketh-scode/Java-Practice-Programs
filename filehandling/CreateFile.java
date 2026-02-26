import java.io.File;
import java.io.IOException;
class CreateFile{
    public static void main(String[] args) {
           try{
        File F=new File("myfile.txt");
     
        if(F.createNewFile()){
            System.out.println("file is created: "+F.getName());

        }else{
            System.out.println("file is already existed");
        }
    } 
    catch(IOException e){
        System.out.println("error while creating a file:");
       e.printStackTrace();
    }
    }
}