package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

class TextChat implements Chat {

    User admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(User admin) {
	if (admin != null && admin instanceof Admin) {
	    this.admin = admin;
	} else {
	    throw new RuntimeException("Error admin init");
	}
    }

    public void addUser(User user) {
	if (admin == null) {
	    throw new RuntimeException("Error simpleUser init");
	}

	if (user instanceof SimpleUser) {
	    users.add(user);
	} else {
	    throw new RuntimeException("Error simpleUser init");
	}
    }

    @Override
    public void sendMessage(String message, User user) {
	if (user instanceof Admin) {
	    for (User u : users) {
		u.getMessage(message);
	    }
	}

	if (user instanceof SimpleUser) {
	    for (User u : users) {
		if (u.isEnable()) {
		    u.getMessage(message);
		}
	    }

	    if (admin.isEnable()) {
		admin.getMessage(message);
	    }
	}
    }

}
