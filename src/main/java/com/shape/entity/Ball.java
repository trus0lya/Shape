package com.shape.entity;

import com.shape.observer.Observable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

import com.shape.observer.Observer;
import com.shape.observer.BallObserver;

import com.shape.util.IdGenerator;

import com.shape.observer.BallEvent;


public class Ball implements Observable {
    private static final Logger logger = LogManager.getLogger(Ball.class);
    private final int id;
    private Point center;
    private double radius;
    private Observer observer = new BallObserver();

    public Ball(double x, double y, double z, double radius)  {
        this.id = IdGenerator.generateId();
        this.center=new Point(x,y,z);
        this.radius =radius;
    }

    public Point getCenter(){
        return center;
    }
    public double getRadius(){
        return radius;
    }
    public int getId(){return id;}


    public void setCenter(Point center){
        this.center = center;
        notifyObservers();
    }

    public void setRadius(double radius){
        this.radius = radius;
        notifyObservers();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Ball otherBall)){
            return false;
        }
        return otherBall.getCenter().equals(center) && otherBall.getRadius() == radius;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id: ").append(id).append(", ")
                .append("center: ").append(center).append(", ")
                .append("radius: ").append(radius);
        return stringBuilder.toString();
    }

    @Override
    public int hashCode(){
        return Objects.hash(center,radius);
    }

    @Override
    public void attach(Observer observer) {
        if(observer!=null) {
            this.observer = observer;
        }
    }

    @Override
    public void detach() {
      this.observer = null;
    }

    @Override
    public void notifyObservers() {
        if (observer == null) {
            logger.log(Level.INFO,"Observer is null");
            return;
        }
        BallEvent ballEvent = new BallEvent(this);
        this.observer.parameterChanged(ballEvent);
    }
}
