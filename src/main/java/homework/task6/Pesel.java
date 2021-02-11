package homework.task6;

public class Pesel {

    private String pesel;

    private Pesel(String pesel) {
        this.pesel = pesel;
    }

    public static Pesel of(String pesel){
        if(isValid(pesel)) return new Pesel(pesel);
        return null;
    }

    public static boolean isValid(String pesel){
        return pesel.matches("\\d{11}");
    }

    public String get() {
        return pesel;
    }

    public String birthDate(){
        return "Year: " + pesel.substring(0, 2) + " Month: " + pesel.substring(2, 4) + " Day: " + pesel.substring(4, 6);
    }

    public boolean isMale(){
        return pesel.charAt(10) % 2 != 0;
    }

    public boolean isFemale(){
        return pesel.charAt(10) % 2 == 0;
    }
}
