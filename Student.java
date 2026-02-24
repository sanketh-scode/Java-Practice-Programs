public class Student{
    private int id;
    private String name;
    private float marks;

Student(int id,String name,float marks){
    setId(id);
    this.name=name;
    setMarks(marks);
}
public void setId(int id){
    if(id <= 0){
    System.out.println("Invalid ID");
    
}else{
    this.id=id;
}
}
public void setMarks(float marks) {
    if(marks>=0){
    this.marks = marks;
    }
    else{
        System.out.println("Marks Cannot Be Negative");
      
    }

}
public int getId(){
    return id;
}
public String getName(){
    return name;
}
public float getMarks(){
   return marks;
}
void displayStudent(){
    System.out.println("ID: "+getId());
    System.out.println("Name: "+getName());
    System.out.println("Marks: "+getMarks());

}

}
