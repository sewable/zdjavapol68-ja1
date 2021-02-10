package homework.task2;

public class Email extends Message{

    public Email(String content, String emailAddress, String subject) {
        super(new MessageComponent[]{
                new MessageContent(content),
                new EmailAddress(emailAddress),
                new EmailSubject(subject)
        });
    }

    @Override
    public String send() {
        for(MessageComponent c : getComponent()){
            if(!canSend()) return c.getError();
        }
        return "Mail o treści " + getComponent()[0] + " został wysłany na adres " + getComponent()[1];
    }

}
