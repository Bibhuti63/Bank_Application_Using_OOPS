
public interface BankInterface {

    double checkBalance();
    String addMoney(int amount);
    String witdrawMoney(int amount,String password);
    double calculateInterest(int years);
}
