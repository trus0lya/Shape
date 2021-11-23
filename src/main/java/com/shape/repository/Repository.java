package com.shape.repository;

import com.shape.entity.Ball;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Repository {
    private final List<Ball> balls = new ArrayList<>();

    public boolean add(Ball ball){
       return balls.add(ball);
    }

    public boolean addAll(List<Ball> balls){
        return this.balls.addAll(balls);
    }

    public boolean remove(Ball ball){
        return balls.remove(ball);
    }

    public boolean removeAll(List<Ball> balls){
        return this.balls.removeAll(balls);
    }

    public boolean contains(Ball ball){
        return balls.contains(ball);
    }

    public Ball get(int index){
        return balls.get(index);
    }

    public int index(Ball ball){
        return balls.indexOf(ball);
    }

    public Ball set(int index, Ball ball){
        return balls.set(index, ball);
    }

    public List<Ball> query(BallSpecification ballSpecification){
        return balls.stream().filter(ballSpecification::specify).collect(Collectors.toList());
    }

}
