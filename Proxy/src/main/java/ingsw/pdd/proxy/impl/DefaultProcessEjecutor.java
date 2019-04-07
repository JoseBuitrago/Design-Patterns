package ingsw.pdd.proxy.impl;

public class DefaultProcessEjecutor implements IProcessEjecutor {

    public void ejecuteProcess(int idProcess,String user,String password) throws Exception {
        System.out.println("procesos " + idProcess + " en ejecucion");
        System.out.println("procesos " + idProcess + " finalizado");
    }
}