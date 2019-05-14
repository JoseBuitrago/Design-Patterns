package ingsw.pdd.strategy.impl;

public interface IAuthenticationStrategy {
    
    public Principal authenticate(String userName, String passwrd);
}
