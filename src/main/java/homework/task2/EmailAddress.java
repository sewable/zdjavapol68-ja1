package homework.task2;

public class EmailAddress extends MessageComponent{

    String emailAddress;

    public EmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public boolean isValid() {
        return emailAddress != null && emailAddress.contains("@") && emailAddress.length() >= 5;
    }

    @Override
    public String getError() {
        if(emailAddress == null) return "Mail nie może zostać wysłany. Email jest pusty";
        else if(!emailAddress.contains("@")) return "Mail nie może zostać wysłany. Email nie zawiera @";
        return "Mail nie może zostać wysłany. Email jest za krótki";
    }

    @Override
    public String toString() {
        return emailAddress;
    }
}
