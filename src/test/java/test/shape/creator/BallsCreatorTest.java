package test.shape.creator;

import com.shape.creator.BallsCreator;
import com.shape.entity.Ball;
import com.shape.exception.BallException;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.testng.Assert.*;

public class BallsCreatorTest {
    @Test
    public void testBallCreator() throws BallException {
        double[] arr = {3,4,2,1};
        Ball ball = new Ball(3,4,2,1);
        assertEquals(BallsCreator.createBall(arr), ball);
    }

    @Test
    public void testBallsCreator() throws BallException{
        List<double[]> list= List.of(
                new double[]{2, 3, 1, 4},
                new double[]{4, 3, 2, 9});
        List<Ball> balls = List.of(
                new Ball(2,3,1,4),
                new Ball(4,3,2,9)
        );
        assertEquals(balls, BallsCreator.createBalls(list));
    }

}