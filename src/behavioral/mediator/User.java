package behavioral.mediator;

abstract class User {

    Chat chat;
    String name;
    boolean isEnable = true;

    public User(Chat chat, String name) {
	this.chat = chat;
	this.name = name;
    }

    public void sendMessage(String message) {
	chat.sendMessage(message, this);
    }

    abstract void getMessage(String message);

    public boolean isEnable() {
	return isEnable;
    }

    public void setEnable(boolean isEnable) {
	this.isEnable = isEnable;
    }
}
