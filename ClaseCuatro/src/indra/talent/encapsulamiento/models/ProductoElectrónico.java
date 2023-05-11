package indra.talent.encapsulamiento.models;

public class ProductoElectrónico {
	

	private String name;
	private double price;
	private int stock;
	private String brand;
	
	public ProductoElectrónico(String name, double price, int stock, String brand) {
		super();
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.brand = brand;
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
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		/*return this.getName() + "(Marca: " + this.getBrand() + ")" + "\n" +
		"["+ this.getPrice()+ "]" + "\n" +
		"Quedan en stock "+ this.getStock();*/
		
		return String.format("La marca es: %s \n Tiene un precio de: %f \n Quedan en stock: %d" ,
				this.brand,
				this.price,
				this.stock);
	}
	
	public void vender(int stock) {
		if(this.stock - stock < 0 ) {
			System.out.println("No tenemos stock del producto");
		}else {
			this.stock = this.stock - stock ;
			System.out.println("Quedan: "+ this.stock+ "en stock");
		}
	}

}
