package entities;

import java.util.Date;

public class UsedProduct extends Product {

	private Date manufacturingDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, String priceTag, Date manufacturingDate) {
		super(name, price, priceTag);
		this.manufacturingDate = manufacturingDate;
	}

	public Date getManufacturingDate() {
		return manufacturingDate;
	}

	public void setManufacturingDate(Date manufacturingDate) {
		this.manufacturingDate = manufacturingDate;
	}
	
@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + "(Used) " + "$ " + super.getPrice() + " (Manufacturing Date): "
				+ this.getManufacturingDate());
		return sb.toString();
	}
}
