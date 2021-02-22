package functional;

import java.util.Optional;

public class OptionalDemo {

    public static Optional<String> getEmail(String email) {
        if(email.contains("@")) {
            return Optional.of(email);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

        System.out.println(getEmail("elo.com"));
        System.out.println(getEmail("elo.com").orElse("Invalid email"));

        Optional<String> email = getEmail("elo@gmail.com");
        if(email.isPresent()) {
            System.out.println(email.get());
        }

    }

}
