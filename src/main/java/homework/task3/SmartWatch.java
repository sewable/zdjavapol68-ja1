package homework.task3;

public class SmartWatch extends Device{
    String strapColor;

    public SmartWatch(int batteryCapacity, String producer, String strapColor) {
        super(batteryCapacity, producer);
        this.strapColor = strapColor;
    }

    public String getStrapColor() {
        return strapColor;
    }

    @Override
    public String sendSMS(String sms){
        if (isWiFi){
            return "Your smartwatch is Sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
