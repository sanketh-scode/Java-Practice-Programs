import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student> studentList=new ArrayList<>();
   public void addStudent(Student s){
        studentList.add(s);
        System.out.println("Student Added Successfully");
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
                return;
            }
        }
        System.out.println("Student Not Found: ");
    }
    
}
