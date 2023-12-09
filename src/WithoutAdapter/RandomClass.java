package WithoutAdapter;

public class RandomClass {
//    YesBankAPI yesBankAPI;
    ICICIBankAPI iciciBankAPI;
    RandomClass(){
//        this.yesBankAPI = new YesBankAPI();
        this.iciciBankAPI = new ICICIBankAPI();
    }


    public void someRandomMethod(){
        int b = iciciBankAPI.balanceCheck();
//        int b = yesBankAPI.getBalance();
    }
}
