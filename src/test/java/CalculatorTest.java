import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(4, 2, 10, 5);
    }

    @Test
    public void canAddNumbers() {
        assertEquals(6, calculator.addNumbers());
    }

    @Test
    public void canSubtractNumbers() {
        assertEquals(2, calculator.subtractNumbers());
    }

    @Test
    public void canMultiplyNumbers() {
        assertEquals(8, calculator.multiplyNumbers());
    }

    @Test
    public void canDivideNumbers() {
        assertEquals(2, calculator.divideNumbers(), 0.01);
    }


}
