class Member02{
	private String id;
	private String name;
	private String addr;
	
	//기본생성자 생략됨
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
}

public class Test02 {
	public static void main(String[] args) {
		Member02 m02 = new Member02();
		 
		m02.setId("kkkk");
		m02.setName("홍길동");
		m02.setAddr("서울시 종로구");
		
		System.out.println("아이디:\t"+m02.getId());
		System.out.println("이름:\t"+m02.getName());
		System.out.println("주소:\t"+m02.getAddr());
	}
}