package com.shape.repository;

import com.shape.entity.Ball;

public class IdBallSpecification implements BallSpecification {
    private final int idLowerBound;
    private final int idUpperBound;

    public IdBallSpecification(int idLowerBound, int idUpperBound){
        this.idLowerBound = idLowerBound;
        this.idUpperBound = idUpperBound;
    }

    @Override
    public boolean specify(Ball ball){
        if(ball == null){
            return false;
        }
        return ball.getId()>=idLowerBound && ball.getId() <= idUpperBound;
    }
}
