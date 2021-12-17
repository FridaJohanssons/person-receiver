package se.iths.personreceiver.sender;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import se.iths.personreceiver.config.JmsConfig;
import se.iths.personreceiver.model.MessageObject;

import java.time.LocalDateTime;
import java.util.UUID;

@Component
public class Sender {
/*    JmsTemplate jmsTemplate;

    public Sender(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }
    @Scheduled(fixedRate = 4000)
    public void sendMessage(){
        System.out.println("Sending message...");
        MessageObject messageObject = new MessageObject(UUID.randomUUID(), "hellofromtest", LocalDateTime.now());
        jmsTemplate.convertAndSend(JmsConfig.PROJECT_QUEUE, messageObject);
        System.out.println("Message Sent!");
    }*/
}
