package homework.task2;

public class MessageContent extends MessageComponent{

    String content;

    public MessageContent(String content) {
        this.content = content;
    }

    @Override
    public boolean isValid() {
        return content != null && content.length() >= 5 && content.matches(".*\\S.*");
    }

    @Override
    public String getError() {
        if(content == null || !content.matches(".*\\S.*")) return "Wiadomość nie może zostać wysłana. Zawartość wiadomości jest pusta";
        return "Wiadomość nie może zostać wysłana. Wiadomość jest za krótka";
    }

    @Override
    public String toString() {
        return content;
    }
}
