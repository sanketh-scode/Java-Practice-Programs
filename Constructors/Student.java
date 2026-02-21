public class Student{
    String name;
    int usn;
    int marks;
    Student(String name, int usn,int marks){
        this.name=name;
        this.usn=usn;
        this.marks=marks;

    }
    public void dispaly(){
        System.out.println("******************");
        System.out.println("NAME:  "+name);
        System.out.println("USN:  "+usn);
        System.out.println("MARKS:  "+marks);
        System.out.println("******************");
    }
    public static void main(String[] args) {
        Student std1=new Student("sanketh",176, 90);
        Student std2=new Student("sangeetha",177, 91);
        std1.dispaly();
        std2.dispaly();
    }

    

    
}
