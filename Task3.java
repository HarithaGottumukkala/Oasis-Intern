# ATM INterface IDE
import java.util.Scanner;
public class Task3{
    public static void main(String args[]){
        System.out.println("Automated Teller Macheiene\n");
        int balance=100000,recpt,pin=1234,pinu,withdraw,deposit;
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Choose 1 for Check Bank balance");
            System.out.println("Choose 2 for Withdraw:");
            System.out.println("Choose 3 for Deposit:");
            System.out.println("choose 4 for PIN updation:");
            System.out.println("Choose 5 for Quit");
            int choice=sc.nextInt();
            switch(choice){
                case 1: 
                System.out.println("Balance : "+balance);  
                System.out.println("");  
                break;
                case 2:System.out.println("Enter money to Withdraw");
                withdraw=sc.nextInt();
                if(balance>=withdraw){
                    balance=balance-withdraw;
                    System.out.println("Please collect your money");
                }
                else{
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                System.out.println("do u want to print receipt if yes press 9 else press 8");
                recpt=sc.nextInt();
                if(recpt==9){System.out.println("collect your receipt");}
                else{break;}
                break;
                case 3:
                System.out.print("Enter money to be deposited:");  
                deposit = sc.nextInt();
                balance = balance + deposit;  
                System.out.println("Your Money has been successfully deposited");  
                System.out.println("");  
                break;
                case 4:
                System.out.println("enter old pin:");
                pinu=sc.nextInt();
                if(pinu==pin){
                    System.out.println("enter new pin");
                    pinu=sc.nextInt();
                    pin=pinu;
                }
                else {break;}
                break;
                case 5:  
                System.exit(0);  
            }
        }
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
