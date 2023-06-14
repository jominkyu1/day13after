import java.time.LocalDateTime;

/*	생성자의 주된 기능은 클래스 소속 멤버변수 중 인스턴스 변수 초기화 기능이다.
 * */
class Member04{
	private String member_id;//회원아이디
	private String member_name;//회원이름
	private String member_phone;//핸드폰번호
	
	public Member04() { //기본생성자는 일반적으로 멤버변수 초기화가 목적
		this.member_id="abc56789";
		this.member_name="홍길동";
		this.member_phone="010-1234-5678";
		System.out.println("[기본 생성자 생성]");
	}
	
	public void pr() {
		System.out.printf("아이디: %s\n회원이름: %s\n번호: %s\n", member_id, member_name, member_phone);
	}
}

public class ObjTest04 {
	public static void main(String[] args) {
		Member04 member = new Member04();
		
		member.pr();
	}
}