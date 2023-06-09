class Data02{
	int x;
}

class Ref02{
	Data02 copy(Data02 d) {//값만 복사 후 새로운 객체를 생성하여 리턴 (주소가 다름)
		Data02 tmp = new Data02();
		tmp.x = d.x;
		System.out.println("return될 tmp의 해시코드: " + tmp.hashCode());
		
		return tmp;
	}
}
public class ObjTest02 {
	public static void main(String[] args) {
		Data02 d = new Data02();
		d.x = 10;
		
		Ref02 ref = new Ref02();
		
		Data02 d2 = ref.copy(d); //return받은 tmp의 객체주소를 가짐
		
		System.out.println("====================");
		System.out.println("d의 해시코드: " + d.hashCode());
		System.out.println("d.x: " + d.x);
		System.out.println("d2의 해시코드: " + d2.hashCode());
		System.out.println("d2.x: " + d2.x);
	}
}
