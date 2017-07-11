package com.jms.handlers;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Controller;

import com.jms.services.SenderReceiverService;

@Path("/chat")
@Controller
public class SenderReceiverHandler {

	@GET
	@Path("/send")
	@Produces(MediaType.TEXT_HTML)
	public String send() {

		SenderReceiverService senderReceiverService = new SenderReceiverService();
		return "<html> " + "<title>" + "Send" + "</title>" + "<body><h1>" + senderReceiverService.sendMessage()
				+ "</body></h1>" + "</html> ";
	}

	@GET
	@Path("/receive")
	@Produces(MediaType.TEXT_HTML)
	public String receive() {

		SenderReceiverService senderReceiverService = new SenderReceiverService();
		return "<html> " + "<title>" + "Send" + "</title>" + "<body><h1>" + senderReceiverService.receiveMessage()
				+ "</body></h1>" + "</html> ";
	}
}
