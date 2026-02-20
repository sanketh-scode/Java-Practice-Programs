import java.util.Scanner;

public class Prime {

    static boolean isprime(int n){
        if(n<=1){
            return false;

        }
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        while(true){
        System.out.println("enter the number::");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(isprime(n)){
            System.out.println("prime number");

        }
        else{
            System.out.println("not a prime number");
        }
    }
    }
}