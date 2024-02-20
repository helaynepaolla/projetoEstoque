package com.projetoEstoqueFilaJMS;
import javax.jms.ConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class JmsProducer {
	 @Autowired
	    private JmsTemplate jmsTemplate;
	    
	    public void sendMessage(String queueName, String message) {
	        jmsTemplate.send(queueName, session -> session.createTextMessage(message));
	    }
}
