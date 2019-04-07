package ingsw.pdd.proxy;

import ingsw.pdd.proxy.impl.IProcessEjecutor;
import ingsw.pdd.proxy.impl.ServiceFactory;

public class ProcessEjecutorProxy {
	public static void main(String[] args) {
        String user = "Jose_Buitragp";
        String password = "1234";
        int process = 1;
        IProcessEjecutor processEjecutor = ServiceFactory.createProcessEjecutor();
        try {
            processEjecutor.ejecuteProcess(process, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

