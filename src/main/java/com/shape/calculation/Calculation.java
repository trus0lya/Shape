package com.shape.calculation;

import java.util.OptionalDouble;


import com.shape.entity.Ball;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

public class Calculation {
    private static final Logger logger = LogManager.getLogger(Calculation.class);

    public static OptionalDouble getSurfaceArea(Ball ball){
        if(ball == null){
            logger.log(Level.WARN, "shape.fds.test.shape.test.shape.validator.validator.entity.Ball is   null");
            return OptionalDouble.empty();
        }
        logger.log(Level.INFO, "Surface area of ball is " +4*Math.PI*ball.getRadius()*ball.getRadius());
        return OptionalDouble.of(4*Math.PI*ball.getRadius()*ball.getRadius());
    }
    public static OptionalDouble getVolume(Ball ball){
        if(ball == null){
            logger.log(Level.WARN, "shape.fds.test.shape.test.shape.validator.validator.entity.Ball is null");
            return OptionalDouble.empty();
        }
        logger.log(Level.INFO, "Volume of ball is " +Math.PI* ball.getRadius()* ball.getRadius()* ball.getRadius()/3);
        return OptionalDouble.of(Math.PI* ball.getRadius()* ball.getRadius()* ball.getRadius()/3);
    }
    public static boolean isBall(Ball ball){
        if(ball == null){
            logger.log(Level.WARN, "shape.fds.test.shape.test.shape.validator.validator.entity.Ball is null");
            return false;
        }
        if (ball.getRadius() > 0){
            logger.log(Level.INFO,"shape.fds.test.shape.test.shape.validator.validator.entity.Ball is right");
            return true;
        } else{
            logger.log(Level.WARN,"shape.fds.test.shape.test.shape.validator.validator.entity.Ball isn't right");
            return false;
        }
    }

    public static boolean isConcertCoordinatePlanes(Ball ball){
        if( ball.getCenter().x()- ball.getRadius() == 0 ||
                ball.getCenter().y() - ball.getRadius() == 0 ||
                ball.getCenter().z() - ball.getRadius() == 0){
            logger.log(Level.INFO,"The ball touches the coordinate plane");
            return true;
        }else{
            logger.log(Level.INFO,"The ball does not touch the coordinate plane");
            return false;
        }
    }

}
