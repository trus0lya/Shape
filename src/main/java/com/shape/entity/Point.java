package com.shape.entity;

import java.util.Objects;

public record Point(double x, double y, double z) {
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Point otherPoint)){
            return false;
        }
        return otherPoint.x() == x && otherPoint.y()==y && otherPoint.z() == z;
    }
    @Override
    public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("x: ").append(x).append(", ")
                    .append("y: ").append(y).append(", ")
                    .append("z: ").append(z);
            return stringBuilder.toString();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x,y,z);
    }

}
