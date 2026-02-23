 class Student{
    private String name;
    private int marks;
    Student(String name, int marks){
        this.name=name;
        setmarks(marks);
    }
    public void setmarks(int m){
        if(m>=0){
            this.marks=m;
        }
        else{
            System.out.println("ivalide input");
        }
    }
    public int getmarks(){
        return marks;
    
    }
     public String getname(){
        return name;
     }
    }
   public class EncapsulationDemo{
    public static void main(String[] args) {
        Student obj=new Student("sanketh",0);
        System.out.println("Name: "+obj.getname());
        obj.setmarks(90);
        System.out.println("marks: "+obj.getmarks());

    }
    
}
