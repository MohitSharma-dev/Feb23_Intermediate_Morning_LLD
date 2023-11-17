package Generics;

import java.util.List;
import java.util.Stack;

public class Pair <V, S>{
    V first;
    S second;
    public void xt(V temp , V temp1 , V temp2){

    }
    public static <T, R> R doSomething(T name, R name1){
        return name1;
    }

    public V getFirst() {
        return first;
    }

    public void setFirst(V first) {
        this.first = first;
    }

    public S getSecond() {
        return second;
    }

    public void setSecond(S second) {
        this.second = second;
    }

    public <T extends Number> double addition(T first, T second){
        return first.doubleValue() + second.doubleValue();
    }

//    public V doSomething(V first, S second){
//        return first + second;
//    }
}
