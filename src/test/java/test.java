import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    calculator cal = new calculator();// init a calculator object

    @Test
    public void add() {
        assertEquals(5, cal.add(0, 5));
    }

    @Test
    public void minus() {
        assertEquals(-10, cal.minus(100, 110));
    }
}
