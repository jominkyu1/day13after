import java.util.Arrays;
import java.util.List;

enum Elist{
	WINNER("승리", Arrays.asList("win")),
	LOSER("패배", Arrays.asList("lose"));
	
	private final String winner;
	private final List<String> list;
	
	Elist(String winner, List<String> list){
		this.winner=winner;
		this.list=list;
	}
	
	public boolean isWin(String name) {
		return WINNER.list.contains(name);
	}
	
	public int getSize() {
		return WINNER.list.size();
	}
	public void rtF() {
		System.out.println(this.winner);
	}
}

public class Enum01 {
	public static void main(String[] args) {
		System.out.println(Elist.WINNER.isWin("win"));
		System.out.println(Elist.WINNER.getSize());
		Elist.WINNER.rtF();
	}
}