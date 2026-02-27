import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        StudentManager sm=new StudentManager();
        Student s;
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        while(run){
        System.out.println("Select Choice\n1.Add Student\n2.view Students\n3.Search Student\n4.Delete Student\n5.Exit");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:{System.out.println("Enter the student details to be add");
            System.out.println("Enter the student ID:");
            int id=sc.nextInt();
            System.out.println("Enter the student Name:");
            sc.nextLine();
            String name=sc.nextLine();
            System.out.println("Enter the Student Marks:");
            float marks=sc.nextFloat();
            s=new Student(id, name, marks);
            sm.addStudent(s);
            break;
        }
            case 2:{
                System.out.println("Recorded Students are:");
                sm.viewStudents();
                break;}
            case 3:{
                System.out.println("Enter the Student Id for Search:");
                int id=sc.nextInt();
                sm.searchStudent(id); 
                break;
            }
            case 4:{
                System.out.println("Enter the Id of the student to be delete");
                int id=sc.nextInt();
                sm.deleteStudent(id);
                break;
            }  
        
            case 5:{
                System.out.println("Exit");
                run=false;
                break;
        }
    }
        
    }
    sc.close();
    
}
}

