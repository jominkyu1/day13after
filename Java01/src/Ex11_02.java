//문제)11장. 클래스와 객체.pdf의 No.14

class Product{
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void output() {
		System.out.println(this.name + "\t" + this.price + "원");
	}
}

public class Ex11_02 {
	public static void main(String[] args) {
		Product p = new Product();
		System.out.println("출력:자판기\n제품목록\n====");
		
		p.setName("커피");
		p.setPrice(150);
		
		p.output();
		
		p.setName("비타500");
		p.setPrice(500);
		
		p.output();
	}
}
