package com.shape.observer;

import com.shape.calculation.Calculation;
import com.shape.entity.Ball;
import com.shape.entity.BallParameters;
import com.shape.entity.BallWareHouse;
import com.shape.exception.BallException;
import com.shape.parser.BallParser;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BallObserver implements Observer {
    private static final Logger logger = LogManager.getLogger(BallObserver.class);

    @Override
    public void parameterChanged(BallEvent event) throws BallException {
        BallWareHouse ballWareHouse = BallWareHouse.getInstance();
        Ball ball = event.getSource();
        double surfaceArea = Calculation.getSurfaceArea(ball).orElseThrow(()->new BallException("Ball is null"));
        double volume = Calculation.getVolume(ball).orElseThrow(()->new BallException("Ball is null"));

        BallParameters ballParameters = new BallParameters(surfaceArea, volume);

        ballWareHouse.putParameters(ball.getId(), ballParameters);

        logger.log(Level.INFO,"Parameters were updated");
    }
}

