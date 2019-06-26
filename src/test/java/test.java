import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    calculator cal = new calculator();// init a calculator object

    @Before
    public void setResult() {//reset the calculator
        cal.setResult(0);
    }

    @Test
    public void add() {
        cal.add(5);
        assertEquals(5, cal.getResult());
    }

    @Test
    public void minus() {
        cal.minus(10);
        assertEquals(-10, cal.getResult());
    }
}
