package Decorator.addons;

import Decorator.Beverage;

public class Milk implements Beverage {
    Beverage cb;
    public Milk(Beverage b){
        this.cb = b;
    }
    @Override
    public int getCost() {
        return 10 + cb.getCost();
    }
}
