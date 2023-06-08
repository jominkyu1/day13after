class Tv03{
	String color;
	int channel=0;
	/* 클래스 소속 멤버변수 String타입 변수는 null, int타입은 0으로 자동 초기화
	 * 
	 */
	
	public void channelUp() {
		++channel;
	}
	
	public void channelDown() {
		--channel;
	}
}
public class Test03 {
	public static void main(String[] args) {
		Tv03 t01 = new Tv03();
		Tv03 t02 = t01; //새로운 객체를 생성하지않고 기존 생성된 객체를 참조	
		
		System.out.println("tv01채널번호: "+t01.channel+"\ntv02채널번호: "+t02.channel);
		
		t01.channel = 10;
		System.out.println("\ntv01채널번호: "+t01.channel+"\ntv02채널번호: "+t02.channel);
		
	}
}
