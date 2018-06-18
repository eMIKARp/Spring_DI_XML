package pl.myspringapp.beans;

public class MessagePrinter {
	
	private MessageProducer messageProducer;

	public MessagePrinter() {
	}

	public MessagePrinter(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}

	public MessageProducer getMessageProducer() {
		return messageProducer;
	}

	public void setMessageProducer(MessageProducer messageProducer) {
		this.messageProducer = messageProducer;
	}	
	
	public void print() {
		System.out.println(messageProducer.getMessage());
	}
	
}
