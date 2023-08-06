package Com.gfg.calculator;

import Com.gfg.Power;

public class Calculator {
    int a;
    int b;
    Power power;  // composition
    public Calculator(int a, int b, Power power){
        this.a = a;
        this.b = b;
        this.power = power;
    }
    public int getSum(){
        return this.a+this.b;
    }

    public long getPower(){
        return power.pow(this.a, this.b);
    }
}
