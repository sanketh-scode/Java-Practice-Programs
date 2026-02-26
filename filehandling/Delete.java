import java.io.File;;
class Delete{
    public static void main(String[] args) {
        File obj=new File("myfile.txt");
        if(obj.delete()){
            System.out.println("deleted file is: "+obj.getName());

        }else{
            System.out.println("Failed in deleting the file.");
        }
    }
}