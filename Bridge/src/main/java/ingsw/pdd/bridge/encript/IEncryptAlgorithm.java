package ingsw.pdd.bridge.encript;

public interface IEncryptAlgorithm {
    public String encrypt(String message, String password) throws Exception;
}