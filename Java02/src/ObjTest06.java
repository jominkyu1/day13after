/*	자바에서 생성자가 오버로딩이 되면 전달인자가 없는 기본생성자를 자바 컴파일러가 묵시적 제공을 하지 않는다.
 * */
class Board06{
	private String board_Name="홍길동";
	private String board_Title="게시판 제목";
	private String board_Content="게시판 내용";
	
		// public int Board06(){} (기본생성자 생략)
	
	public void board_pr() {
		System.out.printf("글쓴이: %s\n게시판 제목: %s\n게시판 내용: %s\n", board_Name, board_Title, board_Content);
	}
}

public class ObjTest06 {
	public static void main(String[] args) {
		Board06 board = new Board06();
		
		board.board_pr();
	}
}
