package ingsw.pdd.decorator.impl.message;

public interface IMessage {
    
    public IMessage processMessage();
    public String getContent();
    public void setContent(String content);
}
