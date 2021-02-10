package homework.task3;

public class Laptop extends Device{
    String dvdDrive;
    int powerSupply;

    public Laptop(int batteryCapacity, String producer, String dvdDrive, int powerSupply) {
        super(batteryCapacity, producer);
        this.dvdDrive = dvdDrive;
        this.powerSupply = powerSupply;
    }

    public String getDvdDrive() {
        return dvdDrive;
    }

    public int getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String sendSMS(String sms){
        if (isWiFi){
            return "Your laptop is sending " + sms;
        } else {
            return "Cant send. Turn on Wifi";
        }
    }
}
