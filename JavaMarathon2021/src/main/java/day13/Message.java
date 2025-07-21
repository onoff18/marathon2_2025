package day13;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Message {

    private final User sender;
    private final User receiver;
    private final String text;
    private final Date date;

    Calendar calendar = new GregorianCalendar();

    public Message(User sender, User receiver, String text) {
        this.sender = sender;
        this.receiver = receiver;
        this.text = text;
        date = calendar.getTime();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return String.format("FROM: %s\nTO: %s\nON: %s\n%s\n", sender, receiver, date, text);
    }
}
