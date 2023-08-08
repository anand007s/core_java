package Com.gfg.exception;

import java.io.IOException;

public class DivideByZeroException extends IOException {
    public DivideByZeroException() {
        super();
        System.out.println("Can't divide by zero");
    }
}
