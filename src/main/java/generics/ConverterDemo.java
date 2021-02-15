package generics;

public class ConverterDemo {

    public static void main(String[] args) {

        Converter<LengthInM, LengthInMile> converter = new LengthConverter();
        converter.convert(new LengthInM(350));

    }

}
