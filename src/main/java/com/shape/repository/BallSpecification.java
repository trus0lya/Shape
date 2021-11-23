package com.shape.repository;

import com.shape.entity.Ball;

@FunctionalInterface
public interface BallSpecification {
    boolean specify(Ball ball);
}
