class Mp3{
	private String comp;
	private int size;
	
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
}

public class Ex12_02 {
	public static void main(String[] args) {
		Mp3 m = new Mp3();
		
		m.setComp("갑을회사");
		m.setSize(8);
		
		System.out.printf("회사명: %s \n메모리 용량: %dG", m.getComp(), m.getSize());
	}
}