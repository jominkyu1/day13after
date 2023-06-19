enum EnumT_01{
	TESTONE
}
enum EnumT_02{
	TESTONE
}
public class InterfaceT_01 {
	public static void main(String[] args) {
		Object t1 = EnumT_01.TESTONE;
		Object t2 = EnumT_02.TESTONE;
		
		if(t1==t2) System.out.println("t1==t2");
		if(t1.equals(t2)) System.out.println("equals(Object?)");
		System.out.println(t2 instanceof EnumT_01);
		
		if(EnumT_01.TESTONE.equals(EnumT_02.TESTONE)) {
			System.out.println("aa");
		}else {
			System.out.println("bb");
			System.out.println(EnumT_01.TESTONE.hashCode());
			System.out.println(EnumT_02.TESTONE.hashCode());
		}
	}
}
