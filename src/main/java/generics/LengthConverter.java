package generics;

//klasa implementuje interfejs generyczny z podanymi typami parametrów
public class LengthConverter implements Converter<LengthInM, LengthInMile> {

    @Override
    public LengthInMile convert(LengthInM value) {
        return new LengthInMile(value.getLength() / 1.8);
    }
}
