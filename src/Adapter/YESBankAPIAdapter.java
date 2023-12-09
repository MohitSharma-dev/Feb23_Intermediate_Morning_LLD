package Adapter;

import Adapter.thirdparty.yesBankAPI;

public class YESBankAPIAdapter implements BankAPIAdapter {
    private yesBankAPI yesBankAPI = new yesBankAPI();

    @Override
    public double getBalance(String accountNumber) {
        return yesBankAPI.checkBalance();
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
