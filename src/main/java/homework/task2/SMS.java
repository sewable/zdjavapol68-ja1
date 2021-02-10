package homework.task2;

public class SMS extends Message{

    public SMS(String content, String phoneNumber) {
        super(new MessageComponent[]{
                new PhoneNumber(phoneNumber),
                new MessageContent(content)
        });
    }

    @Override
    public String send() {
        for(MessageComponent c : getComponent()){
            if(!canSend()) return c.getError();
        }
        return "SMS o treści " + getComponent()[1] + " został wysłany na numer " + getComponent()[0];
    }

}
