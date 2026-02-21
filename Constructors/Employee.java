class Emp{
    String name;
    int id;
    double salary;
    Emp(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
   void display(){
        System.out.println(" Name: "+name+" | ID: "+id+" | Salary: "+salary);
    }
    
    
}
public class Employee{
    public static void main(String[] args) {
       Emp emp1=new Emp("sanketh",102,99000.2);
         Emp emp2=new Emp("sangeeth",103,99442.2);
         emp1.display();
         emp2.display();
    }
}
