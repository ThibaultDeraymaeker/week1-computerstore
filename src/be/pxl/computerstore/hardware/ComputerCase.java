package be.pxl.computerstore.hardware;

import be.pxl.computerstore.util.Dimension;

public class ComputerCase {
		
	private String vendor;
	private String name;
	private double price;
	private Dimension dimension;
	private double weight;
	
	public ComputerCase (String vendor, String name, double price) {
		this.vendor = vendor;
		this.name = name;
		this.price = price;
		}

	public String getVendor() {
		return vendor;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	public Dimension getDimension() {
		return dimension;
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
