package AdderSubtractorSynchronized;

public class Value {
    public int value = 0;

    synchronized public void incrementBy(int i){
        this.value += i;
    }

    public void decrementBy(int i){
        this.value -= i;
    }
}
