package Com.gfg.calculator;

import Com.gfg.Power;
import Com.gfg.exception.DivideByZeroException;

import java.io.IOException;

public class Calculator {
    int a;
    int b;
    Power power;  // composition
    public Calculator(int a, int b, Power power){
        this.a = a;
        this.b = b;
        this.power = power;
    }

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getSum(){
        return this.a+this.b;
    }

    public long getPower(){
        return power.pow(this.a, this.b);
    }

    public double getDivision() throws DivideByZeroException {
        return this.a/this.b;
    }
}
