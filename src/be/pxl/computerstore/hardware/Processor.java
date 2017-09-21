package be.pxl.computerstore.hardware;

public class Processor {

	private String vendor;
	private String name;
	private double price;
	private double clockspeed = 0.7;

	public Processor(String vendor, String name, double price, double clockspeed) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		setClockspeed(clockspeed);
	}

	public double getClockspeed() {
		return clockspeed;
	}

	public void setClockspeed(double clockspeed) {
		if (clockspeed >= 0.7) {
			this.clockspeed = clockspeed;
		} else {
			this.clockspeed = 0.7;
		}
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
