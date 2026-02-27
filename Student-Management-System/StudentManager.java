import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;


import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> studentList=new ArrayList<>();
      StudentManager(){
        try{
        File f=new File("file.txt");
        Scanner read=new Scanner(f);
        while (read.hasNextLine()) {
            String line = read.nextLine();
            String parts[] = line.split(",");
          int id=  Integer.parseInt(parts[0]);
            float marks=Float.parseFloat(parts[2]);
            String name=parts[1];   
            Student s=new Student(id,name,marks);
            studentList.add(s);
 
        }
        read.close();
    
    }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    

        
    
   public void addStudent(Student s){
        studentList.add(s);
        System.out.println("Student Added Successfully");
        Savetofile();
        

    }
    public void viewStudents(){
        if(studentList.isEmpty()){
            System.out.println("NO Student Found");
            return;
        }
        for(Student s:studentList){
            s.displayStudent();
            System.out.println("-------------");
        }
    }
    public void searchStudent(int id){
        for(Student s:studentList){
            if(s.getId()==id){
                s.displayStudent();
                return;
            }
        }
        System.out.println("Student Not Found: ");
    }
    public void deleteStudent(int id){
        for(Student s:studentList){
            if(s.getId()==id){
                s.displayStudent();
                studentList.remove(s);
                System.out.println("Student Deleted Successfully");
                Savetofile();
                return;
            }
        }
        System.out.println("Student Not Found: ");
    
   

}
public void Savetofile(){
 try{
        FileWriter F=new FileWriter("file.txt");
       
        for(Student ss:studentList) {
            F.write(ss.getId()+","+ss.getName()+","+ss.getMarks());
       
        
        F.write("\n");
        }
        F.close();
    }
    catch(IOException e){
        e.printStackTrace();
    }
}

    
   
    
   
    

    
}

