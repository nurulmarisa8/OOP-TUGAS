package login_app.models;

public class Peripheral {
    private String deviceName;

    public Peripheral(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceName() {
        return deviceName;
    }
}
