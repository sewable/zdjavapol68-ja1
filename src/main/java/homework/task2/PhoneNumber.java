package homework.task2;

public class PhoneNumber extends MessageComponent {

    String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean isValid() {
        return phoneNumber.matches("\\d{9}");
    }

    @Override
    public String getError() {
        if(phoneNumber == null) return "SMS nie może zostać wysłany. Pusty nr telefonu";
        return "SMS nie może zostać wysłany. Podany nr telefonu jest nieprawidłowy";
    }

    @Override
    public String toString() {
        return phoneNumber;
    }
}
