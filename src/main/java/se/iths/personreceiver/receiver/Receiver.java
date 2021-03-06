package se.iths.personreceiver.receiver;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;
import se.iths.personreceiver.config.JmsConfig;
import se.iths.personreceiver.model.MessageObject;

@Component
public class Receiver {
    @JmsListener(destination = JmsConfig.PROJECT_QUEUE)
    public void listen(@Payload MessageObject messageObject){
        System.out.println("I got a message");
        System.out.println(messageObject);
    }
}
