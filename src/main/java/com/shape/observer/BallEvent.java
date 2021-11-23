package com.shape.observer;

import com.shape.entity.Ball;

import java.util.EventObject;

public class BallEvent extends EventObject {
    public BallEvent(Ball ball) {
        super(ball);
    }

    @Override
    public Ball getSource(){
        return (Ball)super.getSource();
    }
}
