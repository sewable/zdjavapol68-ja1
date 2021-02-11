package homework.task6;

public class EmailAddress {

    private String email;

    private EmailAddress(String email) {
        this.email = email;
    }

    public static EmailAddress of(String email){
        if(isValid(email)) return new EmailAddress(email);
        return null;
    }

    public static boolean isValid(String email){
        return email.matches("\\w+@\\w+\\.\\w+");
    }

    public String get() {
        return email;
    }

    public String username(){
        String[] split = email.split("@");
        return split[0];
    }

    public String host(){
        String[] split = email.split("@");
        return split[1];
    }

    public String topDomain(){
        String[] split = email.split("\\.");
        return split[split.length - 1];
    }
}
