package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private Value v;

    Adder(Value x){
        v = x;
    }
    public Void call (){
        for(int i = 1;i <=50000; i++){
            this.v.value += i;
        }
        return null;
    }
}


// int -> Integer
// void -> Void
