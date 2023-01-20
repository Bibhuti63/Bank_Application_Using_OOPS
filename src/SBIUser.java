import java.util.Objects;
        import java.util.UUID;

public class SBIUser implements  BankInterface{

    //attributes
    private String name;
    private String accountNo;
    private double balance;
    private String password;
    private double rateOfInterest;

    //Constructor
    public SBIUser(String name, double balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;

        //bank initializing
        this.rateOfInterest=6.5;
        this.accountNo=String.valueOf(UUID.randomUUID());

    }

    @Override
    public double checkBalance() {
        return this.balance;
    }

    @Override
    public String addMoney(int amount) {
        balance=balance+amount;
        String str="Rs. ";
        str+=amount;
        str+=" Credited to SBI ";
        str+=accountNo;
        str+=" Account Balance : ";
        str+=balance;

        return str;

    }

    @Override
    public String witdrawMoney(int amount, String enteredPassword) {
        if(Objects.equals(enteredPassword,password)){
            if(amount>balance){
                return "Insufficient money";
            }
            else{
                balance=balance-amount;
                String str="Rs. ";
                str+=balance;
                str+=" Debited to SBI ";
                str+=accountNo;
                str+=" Remaining Account Balance : ";
                str+=balance;
                return str;
//                return "Your balance after withdraw is :"+balance;
            }
        }
        else{
            return "Wrong Password";
        }
    }

    @Override
    public double calculateInterest(int years) {
        double interest=balance*years*rateOfInterest;
        return interest;
    }
}
