
import java.util.Scanner;
public class Fact {
   
        public static int facto(int n){
            if(n==0)
                return 1;
            if(n==1)
                return 1;
            return n*facto(n-1);

        }
        

     public static void main(String[] args) {
        int num=5;
        int factorial=Fact.facto(num);
        System.out.println("factorial of number:  "+factorial);

     }
    
}
