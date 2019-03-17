package ingsw.pdd.bridge.encript;

public class NoEncryptAlgorithm implements IEncryptAlgorithm{
    
    public String encrypt(String message, String password) throws Exception {
        return message;
    }
}
