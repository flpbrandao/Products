package entities;

public class ImportedProduct extends Product {

	private Double customsFee;
	
	public ImportedProduct () {
		super();
	}

	public ImportedProduct(String name, Double price, String priceTag, Double customsFee) {
		super(name, price, priceTag);
		this.customsFee = customsFee;
	}

	public ImportedProduct(Double customsFee) {
		super();
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public double totalPrice (Double price) {
		double total = super.getPrice() + this.customsFee;
		return total;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName() + " $ " + super.getPrice() + "(Customs fee): " + this.customsFee);
		return sb.toString();
	}
}
