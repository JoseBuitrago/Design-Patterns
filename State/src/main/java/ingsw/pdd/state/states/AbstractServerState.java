package ingsw.pdd.state.states;

import ingsw.pdd.state.Server;

public abstract class AbstractServerState {

    public AbstractServerState() {
    }

    public abstract void handleMessage(
            Server server, String message);

}
