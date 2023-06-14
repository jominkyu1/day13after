//13장. 생성자.pdf no.20
class Product{
	private String name;
	private int price;
	
	public Product() {
	}
	public Product(String name) {
		//this(name,800);
		this.name = name;
		this.price = 800;
	}
	public Product(int price) {
		//this("물",price);
		this.name = "물";
		this.price = price;
	}
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public void print() {
		System.out.println(this.name + ", " + this.price);
	}
}

public class Ex13_02 {
	public static void main(String[] args) {
		Product p1 = new Product("웰치스", 700);
		Product p2 = new Product("커피");
		Product p3 = new Product(500);
		Product p4 = new Product();
		
		p1.print();
		p2.print();
		p3.print();
	}
}