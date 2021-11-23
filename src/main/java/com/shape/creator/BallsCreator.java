package com.shape.creator;

import java.util.ArrayList;
import java.util.List;

import com.shape.entity.Ball;
import com.shape.exception.BallException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;


public class BallsCreator {
    private static final Logger logger = LogManager.getLogger(BallsCreator.class);
    public static Ball createBall(double[] arr) throws BallException {
        if(arr == null || arr.length != 4){

            logger.log(Level.WARN,"Creating ball isn't successful");
            throw new BallException("Array is null or contains the wrong number of elements");
        }
        logger.log(Level.INFO,"Creating ball is successful");
        return new Ball(arr[0], arr[1], arr[2], arr[3]);
        }

    public static List<Ball> createBalls(List<double[]> list) throws BallException {
        List<Ball> balls = new ArrayList<>();
        if(list == null || list.isEmpty()){
            logger.log(Level.WARN,"Creating balls isn't successful");
            throw new BallException("List is null or is empty");
        }
        for(double[] arr : list){
            balls.add(createBall(arr));
        }
        logger.log(Level.WARN,"Creating balls is successful");
        return balls;
    }
}
