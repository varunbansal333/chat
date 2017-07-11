package com.jms.helpers;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class Receiver {

	public Receiver() {
	}

	public String receiveMessage() {
		try {
			ConnectionFactory factory = new ActiveMQConnectionFactory(ActiveMQConnection.DEFAULT_BROKER_URL);
			Connection connection = factory.createConnection();

			connection.start();
			Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Destination destination = session.createQueue("SAMPLEQUEUE");
			MessageConsumer consumer = session.createConsumer(destination);
			Message message = consumer.receive();

			if (message instanceof TextMessage) {
				TextMessage text = (TextMessage) message;
				System.out.println("Message is : " + text.getText());
				return text.getText();
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		receiver.receiveMessage();
		System.out.println(receiver.toString());
	}
}
