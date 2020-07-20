import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorDivideByZeroTestNGTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void divideByZeroPassed() {
        calculator.divide(365, 0);
    }

    @Test(expectedExceptions = IllegalStateException.class)
    public void divideByZeroFailed() {
        calculator.divide(365, 0);
    }

    @Test
    public void divideByZeroIncomplete() {
        throw new SkipException("Skipping divideByZeroIncomplete");
    }
}
