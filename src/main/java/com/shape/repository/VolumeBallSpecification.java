package com.shape.repository;

import com.shape.entity.Ball;
import com.shape.calculation.Calculation;

public class VolumeBallSpecification implements BallSpecification {
    private final double volumeLowerBound;
    private final double volumeUpperBound;

    VolumeBallSpecification(double volumeLowerBound, double volumeUpperBound){
        this.volumeLowerBound = volumeLowerBound;
        this.volumeUpperBound = volumeUpperBound;
    }
    @Override
    public boolean specify(Ball ball){
        if(ball == null){
            return false;
        }
        return Calculation.getSurfaceArea(ball).getAsDouble() >= volumeLowerBound
                && Calculation.getSurfaceArea(ball).getAsDouble() <= volumeUpperBound;
    }
}
