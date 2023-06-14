import java.util.Scanner;
import net.daum.vo.MemberVo;

public class MemberMain{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회원 아이디 입력: ");
		String id = sc.next();
		System.out.print("비밀번호 입력: ");
		String pw = sc.next();
		System.out.print("회원 이름 입력: ");
		String name = sc.next();
		System.out.print("회원 폰번호 입력: ");
		String phone = sc.next();
		System.out.print("회원 이메일 입력: ");
		String email = sc.next();
		
		MemberVo member = new MemberVo();
		member.setMem_email(email);
		member.setMem_id(id);
		member.setMem_name(name);
		member.setMem_phone(phone);
		member.setMem_pw(pw);
		
		System.out.printf("아이디: %s\n비밀번호: %s\n", member.getMem_id(), member.getMem_pw());
		
	}
}
