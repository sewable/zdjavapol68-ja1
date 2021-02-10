package homework.task6;

public class HumanTemperature {

    private float temperature;

    private HumanTemperature(float temperature) {
        this.temperature = temperature;
    }

    public static HumanTemperature of(float temperature) {
        return new HumanTemperature(temperature);
    }

    public boolean isValid(){
        return temperature >= 20 && temperature <= 43;
    }

    public float get() {
        return temperature;
    }

    public float getKelvin(){
        return temperature + 273.15f;
    }

    public float getFahrenfeit(){
        return (temperature * 1.8f) + 32;
    }

    public boolean isNormal(){
        return temperature >= 36 && temperature <= 37;
    }

    public String format(){
        return temperature + " °C";
    }
}
