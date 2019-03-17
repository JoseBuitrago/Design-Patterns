package ingsw.pdd.decorator.impl.message;

public class TextMessage implements IMessage {

    private String content;

    public TextMessage() {
    }

    public TextMessage(String message) {
        this.content = message;
    }

    public String getMessage() {
        return content;
    }

    public void setMessage(String message) {
        this.content = message;
    }

    
    public IMessage processMessage() {
        return this;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
