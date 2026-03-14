package ExceptionHandling;

public class ArrayException {
    public static void main(String[] args) {
        try{
        int arr[]={1,3,4,5};
        int b=arr[5];
        System.out.println(b);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index");
            System.out.println(e);
        }
        }
    }
    

