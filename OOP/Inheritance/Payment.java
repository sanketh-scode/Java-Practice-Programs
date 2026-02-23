public class Payment {
    int transactionId;
    double amount;
    Payment(int transactionId, double amount){
        this.transactionId=transactionId;
        this.amount=amount;
       

    }
    void paymentdetails(){
        System.out.println("Transaction Id: "+transactionId);
        System.out.println("Amount: "+amount);
    }
      void processpayment(){
        System.out.println("Processing payment...");
      }
    

}   
class Creditcard extends Payment{
    String cardnumber;
    Creditcard(int transactionId,double amount,String cardnumber){
        super(transactionId,amount);
        this.cardnumber=cardnumber;


    }
    @Override
    void processpayment(){
        System.out.println("Credit Card payment:  ");
        super.paymentdetails();
        System.out.println("Card Number: "+cardnumber);

    }
    }
    class UpiPayment extends Payment{
        String upiId;
        
        UpiPayment(int transactionId,double amount,String upiId){
            super(transactionId,amount);
            this.upiId=upiId;

        }
        @Override
        void processpayment(){
            System.out.println("UPI Payment");
            super.paymentdetails();
            System.out.println("UPI ID: "+upiId);
        

        }
    }
class Test{
    public static void main(String[] args) {
        Creditcard Cr=new Creditcard(102, 20000, "XXXXX123");
        UpiPayment up=new UpiPayment(103,24584.43,"sanketh@123");
        Cr.processpayment();
        up.processpayment();
    }
}



