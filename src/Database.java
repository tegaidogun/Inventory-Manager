import java.util.ArrayList;


public class Database {

	private ArrayList<Product> inventoryArrayList;
	private ArrayList<Product> deletedProducts;

	public Database()
	{
		inventoryArrayList = new ArrayList<>();
		deletedProducts = new ArrayList<>();
	}
	
	public void addToInventory(Product product)
	{
		inventoryArrayList.add(product);
	}
	
	public void deleteFromInventory(Product product)
	{
		deletedProducts.add(product);
		inventoryArrayList.remove(product);
	}
	
	public Product product(Product product)
	{
		return product;
	}
	
	public Product locate(String productName)
	{
		int index = 0;
		
		for (Product item: inventoryArrayList)
		{
			if (item.getName().equals(productName))
			{
				index = inventoryArrayList.indexOf(item);
			}
		}
		
		return inventoryArrayList.get(index);
	}
	
	public void displayProduct(Product product)
	{
		System.out.printf("Product\tQuantity\tPrice\n");
		System.out.printf("%-15s\t%-15d\t%-15.2f\n", product.getName(), (int)product.getQuantity(), (product.getUnitPrice() * product.getQuantity()));
	}
	
	public void displayInventory()
	{
		System.out.printf("Product\tPurchase Date\tQuantity\tPrice\tManufacturer\tState\n");
		for (Product item: inventoryArrayList)
		{
			System.out.printf("%-15s\t%-15s\t%-15d\t%-15.2f\t%-15s\t%-15s\n", item.getName(), item.getProductDate(),  (int)item.getQuantity(), (item.getUnitPrice() * item.getQuantity()), item.getManufacturer().getName(), item.getManufacturer().getAddress().getState());
		}
	}
	
	public void displayDeletedInventory()
	{
		System.out.printf("Product\tDate\tManufacturer\n");
		for (Product item: deletedProducts)
		{
			System.out.printf("%-15s\t%-15s\t%-15s\n", item.getName(), item.getProductDate(),  item.getManufacturer().getName());
		}
	}
	
}
