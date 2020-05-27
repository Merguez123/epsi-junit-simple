package fr.epsi.deemo;


import fr.epsi.demo.Calculator;
import fr.epsi.demo.UnknownOperatorException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

    @Test
    public void test_operateur_moins() throws UnknownOperatorException {
        int result = Calculator.calculate(6, 2, "-");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void test_operateur_fois() throws UnknownOperatorException {
        int result = Calculator.calculate(6, 2, "*");
        Assertions.assertEquals(12, result);
    }

    @Test
    public void test_operateur_div() throws UnknownOperatorException {
        int result = Calculator.calculate(6, 2, "/");
        Assertions.assertEquals(3, result);
    }

    @Test
    public void test_operateur_plus() throws UnknownOperatorException {
        int result = Calculator.calculate(6, 2, "+");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void test_Unknownoperator() {
        Assertions.assertThrows(UnknownOperatorException.class, () -> Calculator.calculate(4,5,"%"));
    }


}
