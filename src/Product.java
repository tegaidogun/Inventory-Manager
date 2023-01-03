import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	
	private String name;
	private double quantity, unitPrice;
	private Manufacturer manufacturer;
	private String productDate;
	
	public Product (Manufacturer manufacturer, String name, double quantity, double unitPrice)
	{
		this.manufacturer = manufacturer;
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
	    this.productDate = formatter.format(date);
	}

	public String getProductDate() {
		return productDate;
	}

	public void setProductDate(String productDate) {
		this.productDate = productDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public void quantitySold(double request)
	{
		if (this.quantity < request) {
			System.out.println("Not Enough");
		}else {
			this.quantity -= request;
		}
	}
	
	public void quantitySold(int request)
	{
		if (this.quantity < request) {
			System.out.println("Not Enough");
		}else {
			this.quantity -= request;
		}
	}
	
	public void quantityReorder(double stock)
	{
		this.quantity += stock;
	}
	
	public void quantityReorder(int stock)
	{
		this.quantity += stock;
	}
	
}
