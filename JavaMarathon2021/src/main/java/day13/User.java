package day13;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String username;
    private final List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    @Override
    public String toString() {
        return username;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return user.subscriptions.contains(this) && this.subscriptions.contains(user);
    }

    public void sendMessage(User user, String text) {

        MessageDatabase.addNewMessage(this, user, text);
    }
}
