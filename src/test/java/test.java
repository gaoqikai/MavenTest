import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class test {
    yes setYes = new yes("Yes");// put this before @Before LOL

    @Before
    public void setResult() {

        setYes.setResult(0);
    }

    @Test
    public void setAnswer() {

        assertEquals("Yes", setYes.getAnswer());
    }

    @Test
    public void getAnswer() {
    }

    @Test
    public void add() {

        setYes.add(5);
        assertEquals(5, setYes.getResult());
    }
}