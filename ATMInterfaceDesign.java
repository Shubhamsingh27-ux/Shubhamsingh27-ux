import java.util.Scanner;
public class ATM_Design {
    public static void main(String args[]) {
        
        int balance = 50000;
        int withdraw = 0;
        int deposit = 0;

        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("------** Welcome to ATM **------");
            System.out.println("--------------------------------");
            System.out.println("Option 1: Withdraw");
            System.out.println("Option 2: Deposit");
            System.out.println("Option 3: Balance enquiry");
            System.out.println("Option 4: Exit");
            System.out.println("choose any one option above:-------");
    
            int option = sc.nextInt();
    
            switch(option) {
                case 1: 
                System.out.println("Enter withdraw amount:");
                withdraw = sc.nextInt();
                
                if(balance<withdraw) {
                    System.out.println("sorry insufficient balance:");
                }
    
                else {
                   balance = balance - withdraw;
                   System.out.println("Money has been withdrawn successfully:");
                    System.out.println("--------------------------------");
    
                }
                   break;
    
                case 2:
                System.out.println("Enter deposit amount:");
                deposit = sc.nextInt();
                balance = balance + deposit;
                System.out.println("Money has been deposited successfully:");
                 System.out.println("--------------------------------");
                
                break;
    
                case 3:
                System.out.println("Your account balance is:" +balance);
                break;
    
                case 4:
                System.exit(0);
                break;
    
                default: System.out.println("Please enter correct option:");
            }
        }
    }   
    
}
