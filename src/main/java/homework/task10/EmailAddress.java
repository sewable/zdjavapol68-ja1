package homework.task10;

import java.util.Objects;

class IllegalUsernameException extends Exception {
}

class IllegalHostException extends Exception {
}

public class EmailAddress {
    final String address;

    private EmailAddress(String address) {
        this.address = address;
    }

    /**
     * Zaimplementuj metodę, która zwróci obiekt EmailAddress, tylko gdy parametr address jest poprawny
     * jeśli nie to zgłosi wyjątek IllegalArgumentException z komunikatem: address + "is not valid email address!"
     */
    public static EmailAddress of(String address) throws IllegalArgumentException{
        if(!isValidAddress(address)) {
            throw new IllegalArgumentException(address + " is not valid email address!");
        }
        return new EmailAddress(address);
    }

    /**
     * Zaimplementuj metodę, która tworzy obiekt EmailAddress na podstawie username i hosta
     * Jeśli nie można zbudowac poprawnego adresu np. gdy w login znajduje się znak '@' lub inny niż alfanumeryczny
     * to zgłosi jeden z dwóch wyjątków:
     *          - IllegalUsernameException, gdy username jest niepoprawnie zbudowany
     *          - IllegalHostException, gdy nazwa host nie niepoprawna
     * Jeśli oba argumenty są błędne to zgłaszamy pierwszy wyjątek
     * Obie klasy wyjątków należy samodzielnie zdefiniować
     */

    public static Exception from(String username, String host) throws IllegalUsernameException, IllegalHostException {
        if(!isValidUsername(username)) {
            throw new IllegalUsernameException();
        }
        if(!isValidHost(host)) {
            throw new IllegalHostException();
        }
        return null;
    }

    public static EmailAddress of(String username, String host) throws IllegalHostException, IllegalUsernameException {
        if(!isValidUsername(username) || !isValidHost(host)) {
            from(username, host);
        }
        return new EmailAddress(username + "@" + host);
    }

    public String get(){
        return address;
    }
    public String username(){
        return extractUsername(address);
    }
    public String host(){
        return extractHost(address);
    }
    public String topDomain(){
        return extractTopDomain(address);
    }

    static private boolean isValidUsername(String input){
        return !isNull(input) && !isEmpty(input) && !hasOneAtSymbol(input) && hasValidCharacters(input);
    }

    static private boolean isValidHost(String input){
        return !isNull(input) && !isEmpty(input) && !hasOneAtSymbol(input) && hasValidCharacters(input) && input.contains(".");
    }

    static private  boolean isValidAddress(String address){
        return !isNull(address)
                && !isEmpty(address)
                && hasOneAtSymbol(address)
                && hasAtLeastOneDotAfterAtSymbol(address)
                && isValidUsername(extractUsername(address))
                && isValidHost(extractHost(address));
    }

    static private String extractUsername(String address){
        return address.substring(0, address.indexOf('@'));
    }

    static private String extractHost(String address){
        return address.substring(address.indexOf('@') + 1);
    }

    static private String extractTopDomain(String address){
        return address.substring(address.lastIndexOf('.') + 1);
    }

    static private boolean isNull(String input){
        return Objects.isNull(input);
    }

    static private boolean isEmpty(String input){
        return input.isEmpty();
    }

    static private boolean hasOneAtSymbol(String input){
        return input.indexOf('@') == input.lastIndexOf('@') && input.indexOf('@') >= 0;
    }

    static private boolean hasAtLeastOneDotAfterAtSymbol(String input){
        return input.indexOf('@') < input.lastIndexOf('.');
    }

    static private boolean hasValidCharacters(String input){
        String str =  input.replace("@","").replace(".","");
        for(char c: str.toCharArray()){
            if (!Character.isAlphabetic(c)){
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return address;
    }
}