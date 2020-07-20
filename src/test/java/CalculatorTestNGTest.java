import com.katalon.testops.TestOpsListener;
import com.katalon.testops.helper.ParameterHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTestNGTest {

    private Calculator calculator;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(377, calculator.add(365, 12));
        assertEquals(377, calculator.add(12, 365));
    }

    @Test
    public void testSubtract() {
        ParameterHelper.get("testops.apiKey");
        assertEquals(353, calculator.subtract(365, 12));
        assertEquals(-353, calculator.subtract(12, 365));
    }

    @Test
    public void testMultiply() {
        assertEquals(4380, calculator.multiply(365, 12));
        assertEquals(4380, calculator.multiply(12, 365));
    }

    @Test
    public void testDivide() {
        assertEquals(36.5, calculator.divide(365, 10), 0);
    }
}
