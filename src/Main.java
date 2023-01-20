import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //create account in bank by giving details
        System.out.println("Enter your name :");
        String name=sc.nextLine();
        System.out.println("Create a new password :");
        String password=sc.next();
        System.out.println("Enter your balance :");
        double balance=sc.nextDouble();

        //creating instance of SBIUser
        SBIUser user=new SBIUser(name,balance,password);

        System.out.println("Account Created at SBI \n"+"\nYour name is :"+name+"\nYour balance is "+balance+" \nYour password is :"+password);
        System.out.println();

        //check balance
        double availableBalance=user.checkBalance();
        System.out.println("Balance available is : "+availableBalance);

        //add money
        System.out.println("Add amount to add in account");
        int addAmount=sc.nextInt();
        String massage=user.addMoney(addAmount);
        System.out.println(massage);

        //withdraw money
        System.out.println("Enter amount to withdraw :");
        int withdrawAmount=sc.nextInt();
        System.out.println("Enter password to withdraw :");
        String withdrawPassword=sc.next();
        String withdrawMassage=user.witdrawMoney(withdrawAmount,withdrawPassword);

        System.out.println(withdrawMassage);

        //check interest
        System.out.println("Enter number of years to find Interest");
        int year=sc.nextInt();
        double intrest=user.calculateInterest(year);
        System.out.println("Interest after "+year+" year is : "+intrest);





    }
}