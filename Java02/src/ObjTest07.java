import java.util.StringJoiner;

//생성자 오버로딩시 기본생성자 묵시적 제공X

class Member07{
	private String mem_id;
	private String mem_pwd;
	private String mem_name;
	
	public Member07(String mem_id, String mem_pwd, String mem_name) {
		this.mem_id = mem_id;
		this.mem_pwd = mem_pwd;
		this.mem_name = mem_name;
	}
	
	public void pr() {
		System.out.println(mem_id);
		System.out.println(mem_pwd);
		System.out.println(mem_name);
	}
}
public class ObjTest07 {
	public static void main(String[] args) {
		
	}
}
