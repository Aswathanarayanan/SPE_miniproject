import org.example.Main;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class calculatorTest {
    private static final double DELTA = 1e-15;
    Main calculator = new Main();

    @Test
    public void squarerootTruePositive(){
        assertEquals("Finding squareroot for true positive", 2.0, calculator.squareroot(4.0), DELTA);
        assertEquals("Finding squareroot for true positive",2.23606797749979 , calculator.squareroot(5.0), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("Finding squareroot for false positive", 4.0, calculator.squareroot(9.0), DELTA);
        assertNotEquals("Finding squareroot for false positive", 1.0, calculator.squareroot(3.0), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial for true positive", 120, calculator.factorial(5), DELTA);
        assertEquals("Finding factorial for true positive", 6, calculator.factorial(3), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial for false positive", 120, calculator.factorial(6), DELTA);
        assertNotEquals("Finding factorial for false positive", 6, calculator.factorial(2), DELTA);

    }


    @Test
    public void logTruePositive(){
        assertEquals("Finding log for true positive",1.3862943611198906, calculator.naturallog(4.0), DELTA);
        assertEquals("FFinding log for true positive", 1.9459101490553132, calculator.naturallog(7.0), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding log for false positive", 3.0, calculator.naturallog(1.0), DELTA);
        assertNotEquals("Finding log for false positive", 1.0, calculator.naturallog(5.0), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive",16.0, calculator.power(2.0,4.0), DELTA);
        assertEquals("Finding power for True Positive", 25.0, calculator.power(5.0,2.0), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 2.0, calculator.power(1.0,2.0), DELTA);
        assertNotEquals("Finding power for False Positive", 1.0, calculator.power(4.0,-2.0), DELTA);
    }


}
