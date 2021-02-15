package generics;

public class LengthInMile extends Length {

    public LengthInMile(double length) {
        super(length);
    }

    public LengthInMile(LengthInM meters){
        super((meters.getLength() / 0.000000001785));
    }

    public double getLength() {
        return length;
    }
}
