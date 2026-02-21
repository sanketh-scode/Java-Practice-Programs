public class Rectangle {
   double width;
   double height;
    Rectangle(double w,double h){
        width=w;
        height=h;

    }
    Rectangle(Rectangle Rec3){
        this.width=Rec3.width;
        this.height=Rec3.height;

    }
    public void display(){
       System.out.println("Area of the rectangle: "+(width*height));
    }
    public static void main(String[] args) {
        Rectangle Rec1=new Rectangle(2,4);
        Rectangle Rec2=new Rectangle(4.5,2.5);
        Rectangle Rec3=new Rectangle(Rec2);
        
        Rec1.display();
        Rec2.display();
        Rec3.display();
    }

    

    
}

    

