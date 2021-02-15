package generics;

public class LengthApp {

    public static void main(String[] args) {

        //ograniczenie typów parametrów powoduje, że możemy utworzyć tylko klasy z typów pochodnych po Length
        UniversalLengthConverter<Length, LengthInM> lengthConvert = new UniversalLengthConverter();
        UniversalLengthConverter<Length, Length> ll = new UniversalLengthConverter<>();

    }

}
