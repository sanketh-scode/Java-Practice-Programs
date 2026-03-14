package ExceptionHandling;
class ArithmeticExample{
    public static void main(String[] args) {
        try{
        int a=0;
        int b=10;
        int c=b/a;
        System.out.println("result: "+c);
        }
        catch(ArithmeticException e){
    System.out.println("Divide by zero not allowed");
    System.out.println(e);
}
        finally{
            System.out.println("program execution completed");
        }

    }
}