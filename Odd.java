import java.util.Scanner;
public class Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n%2==0){
            System.out.println("Even");

        }else{
            System.out.println("odd");
        }
    }
    }

    
}
