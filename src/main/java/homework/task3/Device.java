package homework.task3;

public abstract class Device {

    int batteryCapacity;
    String producer;
    boolean isWiFi;

    public Device(int batteryCapacity, String producer) {
        this.batteryCapacity = batteryCapacity;
        this.producer = producer;
    }

    public abstract String sendSMS(String sms);

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getProducer() {
        return producer;
    }

    public boolean isWiFi() {
        return isWiFi;
    }

    public void setWiFi(boolean wiFi){
        isWiFi = wiFi;
    }

    public int maxWorkTime(int consumptionPerHour){
        return batteryCapacity / consumptionPerHour;
    }
}
