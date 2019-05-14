package ingsw.pdd.observer.impl;

public interface IObserver {
    
    public void notifyObserver(String command, Object source);
}
