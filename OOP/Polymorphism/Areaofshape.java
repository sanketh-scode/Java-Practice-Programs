public class Areaofshape {
    int area(int side){
        return side*side;//area of the square
    }
    int area(int length,int breadth){
        return length*breadth;//area of the rectangle
    }
    double area(double radius){
        return Math.PI*radius*radius;//area of the circle
    }
    public static void main(String[] args) {
        Areaofshape obj=new Areaofshape();
        System.out.println("Area of the Square:  "+obj.area(2));
        System.out.println("Area of the Rectangle:  "+obj.area(2,4));
        System.out.println("Area of the Circle:  "+obj.area(3.0));
    }

}

