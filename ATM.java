Import java.util.Scanner;
class ATM { 
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in); 
        int pwd=6302; 
        float Balance=0;
        int limit;
        for(int i=1;i<=3;i++){
            System.out.print("Enter your current password:"); 
            int currentpwd=sc.nextInt(); 
            if(pwd==currentpwd){
            while(true){ 
                  System.out.println("Welcome to ATM"); 
            System.out.print(" 1. Check Balance\n 2. Deposit\n 3. WithDrawl\n 4. Exit\n "); 
            System.out.print("Select an option :"); 
            int option=sc.nextInt(); 
            switch(option){ 
                case 1: 
                    System.out.println("your bank balance is:" + Balance);
                    break; 
                case 2: 
                    System.out.print("Deposit your amount :"); 
                    float deposit=sc.nextFloat(); 
                    Balance+=deposit; 
                    System.out.println("Deposit successful");
                    break; 
                case 3:
                        System.out.println("select card type:");
                    System.out.println("1. classic\n 2. platinum\n 3.premium\n");
                    System.out.println("select an option:");
                        int choice=sc.nextInt();
              switch(choice){
                case 1:
                    limit=20000;
                    break;
                case 2:
                    limit=50000;
                    break;
                case 3:
                    limit=100000;
                    break;
                default:
                    limit=10000;
            }
            System.out.println("enter withdrawl amount:");
            float withdrawl=sc.nextFloat(); 
            if(withdrawl<=limit){
                if(withdrawl<=Balance){
                    Balance-=withdrawl;
                System.out.println("please wait!..transaction is in progress");
                }
                    } else{
                        System.out.println("insufficient balance");
                    }
                     
            } 
            if(option==4){ 
                System.out.println("Thank you!..visit again");
                break; 
            }
        } 
        break; 
            }
            if(i != 3){ 
                System.out.println("You had entered wrong pwd "+ i+" attempt"); 
            } 
            else{ 
                System.out.print("Timed out.You can try after 24hrs"); 
            } 
        } 
        }
    }
