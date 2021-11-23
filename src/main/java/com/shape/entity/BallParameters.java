package com.shape.entity;

public record BallParameters(double surfaceArea, double volume) {
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("surface area: ").append(surfaceArea).append(", ")
                .append("volume: ").append(volume);
        return stringBuilder.toString();
    }
}