package com.shape.repository;

import com.shape.entity.Ball;
import com.shape.calculation.Calculation;

public class SurfaceAreaBallSpecification implements BallSpecification {
    private final double surfceAreaLowerBound;
    private final double surfaceUpperBound;

    SurfaceAreaBallSpecification(double perimeterLowerBound, double perimeterUpperBound){
        this.surfceAreaLowerBound = perimeterLowerBound;
        this.surfaceUpperBound = perimeterUpperBound;
    }
    @Override
    public boolean specify(Ball ball){
        if(ball == null){
            return false;
        }
        return Calculation.getSurfaceArea(ball).getAsDouble() >= surfceAreaLowerBound
                && Calculation.getSurfaceArea(ball).getAsDouble() <= surfaceUpperBound;
    }
}
