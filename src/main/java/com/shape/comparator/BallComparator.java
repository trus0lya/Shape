package com.shape.comparator;

import com.shape.entity.Ball;
import com.shape.calculation.Calculation;

import java.util.Comparator;
import java.util.OptionalDouble;

public class BallComparator {
    static class IdComparator implements Comparator<Ball> {
        @Override
        public int compare(Ball ball1, Ball ball2) {
            return Integer.compare(ball1.getId(), ball2.getId());
        }
    }
    static class XComparator implements Comparator<Ball>{
        public int compare(Ball ball1, Ball ball2){
            return Double.compare(ball1.getCenter().x(), ball2.getCenter().x());
        }
    }
    static class YComparator implements Comparator<Ball>{
        @Override
        public int compare(Ball ball1, Ball ball2){
            return Double.compare(ball1.getCenter().y(), ball2.getCenter().y());
        }
    }
    static class ZComparator implements Comparator<Ball>{
        @Override
        public int compare(Ball ball1, Ball ball2){
            return Double.compare(ball1.getCenter().z(), ball2.getCenter().z());
        }
    }
    static class RadiusComparator implements Comparator<Ball>{
        @Override
        public int compare(Ball ball1, Ball ball2){
            return Double.compare(ball1.getRadius(), ball2.getRadius());
        }
    }
    static class SurfaceAreaComparator implements Comparator<Ball>{
        @Override
        public int compare(Ball ball1, Ball ball2){
            OptionalDouble surfaceArea1 = Calculation.getSurfaceArea(ball1);
            OptionalDouble surfaceArea2 = Calculation.getSurfaceArea(ball2);
            return Double.compare(surfaceArea1.getAsDouble(),surfaceArea2.getAsDouble());
        }
    }

    static class VolumeComparator implements Comparator<Ball>{
        @Override
        public int compare(Ball ball1, Ball ball2){
            OptionalDouble volume1 = Calculation.getVolume(ball1);
            OptionalDouble volume2 = Calculation.getVolume(ball2);
            return Double.compare(volume1.getAsDouble(),volume2.getAsDouble());
        }
    }

}
