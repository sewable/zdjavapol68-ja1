package homework.task2;

public class EmailSubject extends MessageComponent{

    String subject;

    public EmailSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public boolean isValid() {
        return subject != null;
    }

    @Override
    public String getError() {
        return "Mail nie może zostać wysłany. Temat jest pusty";
    }

    @Override
    public String toString() {
        return subject;
    }
}
