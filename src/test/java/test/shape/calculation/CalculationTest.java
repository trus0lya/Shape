package test.shape.calculation;

import com.shape.calculation.Calculation;
import com.shape.entity.Ball;
import org.testng.annotations.Test;

import java.util.OptionalDouble;

import static org.testng.Assert.*;

public class CalculationTest {
    @Test
    public void testGetSurfaceArea()  {
        OptionalDouble actual =  Calculation.getSurfaceArea(new Ball(2,3,1,2));
        OptionalDouble expected = OptionalDouble.of(50.26548245743669);
        assertEquals(actual, expected);
    }

    @Test
    public void testGetVolume() {
        OptionalDouble actual = Calculation.getVolume(new Ball(2,3,1,2));
        OptionalDouble expected = OptionalDouble.of(8.377580409572781);
        assertEquals(actual,expected);
    }

    @Test
    public void testIsBall() {
        boolean condition = Calculation.isBall(new Ball(2,3,4,0));
        assertFalse(condition);
    }

    @Test
    public void testIsConcertCoordinatePlanes()  {
        boolean condition = Calculation.isConcertCoordinatePlanes(new Ball(2,3,1,2));
        assertTrue(condition);
    }

}