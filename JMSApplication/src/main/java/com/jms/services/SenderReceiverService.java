package com.jms.services;

import com.jms.helpers.Receiver;
import com.jms.helpers.Sender;

public class SenderReceiverService {
	
	public String sendMessage(){
		Sender sender = new Sender();
		return sender.sendMessage();
	}
	
	public String receiveMessage(){
		Receiver receiver = new Receiver();
		return receiver.receiveMessage();
	}
}
