package test.shape.validator;

import org.junit.jupiter.api.Test;
import com.shape.validator.BallValidator;

import static org.testng.Assert.*;

public class BallValidatorTest {

    @Test
    public void testIsRadiusValid(){
        assertTrue(BallValidator.isValidString("2 3 4 1"));
    }

    @Test
    public void testIsNumeric(){
        assertFalse(BallValidator.isNumeric("1 2d 3 4"));
    }

    @Test
    public void testIsEnoughData(){
        assertFalse(BallValidator.isEnoughData("2 3 1 3 4"));
    }

    @Test
    public void testIsValidString(){
        assertTrue(BallValidator.isValidString("2 3 4 1"));
    }
}