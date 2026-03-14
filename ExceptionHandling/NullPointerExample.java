package ExceptionHandling;

public class NullPointerExample {
    public static void main(String[] args) {
        try {
            String s="sanketh";
            char ch=s.charAt(0);
            System.out.println(ch);
        } catch (NullPointerException e) {
            System.out.println("String contain null value");
            System.out.println(e);
            // TODO: handle exception
        }
        finally{
            System.out.println("program continue");
        }
    }
    
}
