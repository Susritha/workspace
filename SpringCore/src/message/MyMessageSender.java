package message;


public class MyMessageSender {

	MessageService service;

	public MessageService getService() {
		return service;
	}

	public void setService(MessageService service) {
		this.service = service;
	}
	public void displayMessage(){
		service.sendMessage("susritha","hi");
	}
}
