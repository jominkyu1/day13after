// this 사용예제

class GuestBook09{
	private String writer;
	private String title;
	private String content;
	
	public GuestBook09() {}
	
	public GuestBook09(String writer, String title, String content) {
		this.writer = writer;
		this.title = title;
		this.content = content;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void pr() {
		System.out.println("글쓴이: " + this.writer);
		System.out.println("글제목: " + this.title);
		System.out.println("글내용: " + this.content);
	}
}

public class ObjTest09 extends Thread{
	public static void main(String[] args) {
		GuestBook09 gb = new GuestBook09("홍길동", "제목입니다", "내용입니다.");
		gb.pr();
		
		gb.setTitle("제목변경aaa");
		gb.pr();
		
		int a=10;
		int b=20;
	}
}
