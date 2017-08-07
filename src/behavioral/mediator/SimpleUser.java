package behavioral.mediator;

class SimpleUser implements User {

    Chat chat;

    public SimpleUser(Chat chat) {
	this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
	chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
	System.out.println("SimpleUser get message " + message);
    }

}
