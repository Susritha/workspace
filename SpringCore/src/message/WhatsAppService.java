package message;

public class WhatsAppService implements MessageService {
	@Override
	public void sendMessage(String receiverName, String msg) {
		System.out.println("Message is "+msg+" sent by  "+receiverName+" through whatsapp");
	}
}
