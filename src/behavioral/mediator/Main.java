package behavioral.mediator;

class Main {

    public static void main(String[] args) {
	TextChat chat = new TextChat();

	User admin = new Admin(chat, "Admin");
	User u1 = new SimpleUser(chat, "User1");
	User u2 = new SimpleUser(chat, "User2");

	chat.setAdmin(admin);
	chat.addUser(u1);
	chat.addUser(u2);

	u1.sendMessage("Hello, im u1");
	admin.sendMessage("Hello, im admin");
    }

}
