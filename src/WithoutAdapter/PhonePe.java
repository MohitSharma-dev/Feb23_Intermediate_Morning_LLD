package WithoutAdapter;

public class PhonePe {
//    YesBankAPI yesBankAPI;
    ICICIBankAPI iciciBankAPI;
    PhonePe(){
//        this.yesBankAPI = new YesBankAPI();
        this.iciciBankAPI = new ICICIBankAPI();
    }

    public int checkBalance(){
//       return yesBankAPI.getBalance();
        return iciciBankAPI.balanceCheck();
    }

}
