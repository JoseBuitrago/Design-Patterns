package ingsw.pdd.bridge.impl;

import  ingsw.pdd.bridge.encript.IEncryptAlgorithm;


public class DefaultMessageEncryptImpl implements IMessageEncrypt{
    private IEncryptAlgorithm encryptAlgorith;
    
    public DefaultMessageEncryptImpl(IEncryptAlgorithm encryptAlgorith){
        this.encryptAlgorith = encryptAlgorith;
    }
    

    public String encryptMessage(String message, String password)throws Exception {
        return encryptAlgorith.encrypt(message, password);
    }
}