package com.shape.entity;

import java.util.*;
import java.util.stream.Collectors;

public class BallWareHouse {
    private final Map<Integer, BallParameters> ballMap = new HashMap<>();
    private static BallWareHouse instance;

    private BallWareHouse(){

    }

    public static BallWareHouse getInstance() {
        if (instance == null) {
            instance = new BallWareHouse();
        }
        return instance;
    }

    public void putParameters(int id, BallParameters ballParameters){
        instance.ballMap.put(id, ballParameters);
    }

    public Map<Integer, BallParameters> getBallMap() {
        return Map.copyOf(ballMap);
    }

    public Optional<BallParameters> getBallParameters(int id){
        return Optional.of(ballMap.get(id));
    }

    public Optional<Set<Integer>> getId(BallParameters ballParameters){
        return Optional.of(ballMap.entrySet()
                .stream()
                .filter(entry->Objects.equals(entry.getValue(), ballParameters))
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet()));
    }



}
