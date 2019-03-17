package ingsw.pdd.decoratoor;

import ingsw.pdd.decorator.impl.decorators.SOAPEnvelopMessage;
import ingsw.pdd.decorator.impl.message.IMessage;
import ingsw.pdd.decorator.impl.decorators.EncryptMessage;
import ingsw.pdd.decorator.impl.message.CustomerMessage;
import ingsw.pdd.decorator.impl.decorators.XMLFormatterDecorate;


public class DecoratorMain {

    public static void main(String[] args) {
        
        CustomerMessage customerMessage = new CustomerMessage(
                "Jose Buitrago", "jbuitrago29@uan.edu.co", "3204402155");
        System.out.println("Original Message ==> " + customerMessage);
        
        IMessage message1 = new EncryptMessage("user", "HG58YZ3CR9123456", 
                new SOAPEnvelopMessage(
                    new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message1 =====================================>\n" 
                + message1.getContent() + "\n\n");
        
        IMessage message2 = new SOAPEnvelopMessage(
                new EncryptMessage("user", "HG58YZ3CR9123456",
                    new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message2 =====================================>\n" 
                + message2.getContent());
    }
    
}
