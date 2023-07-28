import java.util.Scanner;

public class ATM {

    static String user_id="hdfc@1980";
    static int user_pin=1980;
    static boolean flag=false;
    


    public static void main(String[] args) {
        
        do {
            
        

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter User_id : ");
        String entered_user_id=sc.next();
        System.out.println("Enter User_pin : ");
        int entered_user_pin=sc.nextInt();

        
            
        
        if((entered_user_id.equals(user_id))&& entered_user_pin==user_pin )
            { 

                double balance=1000000;
                double withdraw,deposit,transfer;

                while (true) 
                {
            
                    System.out.println();
                    System.out.println("Automated Teller Machine");
                    System.out.println("1)Withdraw Money");
                    System.out.println("2)Deposit Money");
                    System.out.println("3)Check Balance");
                    System.out.println("4)Transfer Money");
                    System.out.println("5)Exit");

                    System.out.println("Enter Choice : ");
                    int choice=sc.nextInt();
                    switch (choice) 
                    {
                        case 1:System.out.println("Enter Money to be Withdrawn");
                        withdraw=sc.nextDouble();
                        if (balance>=withdraw) 
                        {
                            balance=balance-withdraw;
                            System.out.println("Please Collect your Money");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }

                    
                        break;


                        case 2:System.out.println("Enter Money to be Deposited");
                        deposit=sc.nextDouble();
                        balance=balance+deposit;
                        System.out.println("Your Money has been Succesfully Deposited");
                        break;

                        case 3:System.out.println("Balance:"+balance);
                        break;

                        case 4:
                        System.out.println("Enter Upi Id of receiver ");
                        int accno=sc.nextInt();
                        System.out.println("Enter Money to be Transfer");
                        transfer=sc.nextDouble();

                        if (balance>=transfer) 
                        {
                            balance=balance-transfer;
                            System.out.println("Money has been transfered Sucessfully");
                        }
                        else
                        {
                            System.out.println("Insufficient Balance");
                        }
                        break;

                        case 5:System.exit(0);

                        default:
                        break;


                    }
        
                } 
            }
            else
            {
                System.out.println("Icorrect User ID or Pin \nEnter Details again!!\n");
                

            }
            } while (flag =true);
                        
               
                   
    }
}
        
         

        
        
        
        

    


