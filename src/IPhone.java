
public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	
	public String ring() {
		return getRingTone();
	}
	
	public String unlock() {
		return "Phone is unlocked";
	}
	
	public void displayInfo() {
		System.out.println("Version Number: " + getVersionNumber() + " Battery Percentage: " + getBatteryPercentage() + " Carrier: " + getCarrier() + " Ring Tone: " + getRingTone());
	}
}
