package ingsw.pdd.proxy.impl;

public class ServiceFactory {
    
    public static IProcessEjecutor createProcessEjecutor(){
        return new ProcessEjecutorProxy();
    }
}
