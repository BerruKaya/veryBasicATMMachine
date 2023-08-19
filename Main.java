import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        /*operaitons:
        1- learning balance
        2-withdrawing money from account
        3-deposit money into account
        4-when press q, exit */
        
        Scanner scan = new Scanner(System.in);
        int balance=1000;
        String operations = "1-learning balance \n" + "2-witdraw money \n" + "deposit money\n" + "press q to exit";
        
        System.out.println("********");
        System.out.println(operations);
        System.out.println("********");
        
        
        while(true){
            System.out.println("pick the operation you'd like to perform");
            String choice=scan.nextLine();
            
            if(choice.equals("q")){
                System.out.println("you are exiting the system");
                break;
            }
            
            else if(choice.equals("1")){
                
                System.out.println("your balance: " + balance);
            }
                 else if(choice.equals("2")){
                     System.out.println("write the amount of money you'd like to withdraw");
                     int amount = scan.nextInt();
                     scan.nextLine();    //nextInt den sonra nextLine kullanarak önledik ek bir line almasını
                     
                     if(balance<amount){
                         System.out.println("you dont have enough balance to withraw that money");
                     }
                     else{
                         balance-=amount;
                         System.out.println("your balance: " + balance);
                     }
            }
             else if(choice.equals("3")){
                System.out.println("write the amount of money you'd like to deposit: ");
                int amount = scan.nextInt();
                scan.nextLine();
                
                balance+=amount;
                
                System.out.println("your balance: " + balance);
            }
            else{
                System.out.println("invalid request, pick the operation you'd like to perform");
                
            }
            }
        }
        
}
