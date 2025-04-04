package ManyToOne;

public class Product {
	
	private String product_name;
	
	Product(String product_name)
	{
		this.product_name=product_name;
	}
	
	public String getProduct_name()
	{
		return product_name;
	}
	public void setProductName(String name)
	{
		this.product_name=product_name;
	}

}
