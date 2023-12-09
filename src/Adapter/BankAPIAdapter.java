package Adapter;

public interface BankAPIAdapter {

    double getBalance(String accountNumber);

    boolean sendMoney(String fromAccount,
                      String toAccount,
                      double amount);
}