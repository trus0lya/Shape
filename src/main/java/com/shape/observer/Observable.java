package com.shape.observer;

public interface Observable {
    void attach(Observer observer);
    void detach();
    void notifyObservers();
}
