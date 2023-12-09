package Adapter;

//import WithoutAdapter.PhonePe;

public class Client {
    public static void main(String[] args) {
        // userInputUPI
        // BankAPIAdapterFactory
        BankAPIAdapter bankAPIAdapter = new ICICIBankAPIAdapter();
        PhonePe phonePe = new PhonePe(bankAPIAdapter);
    }
}
