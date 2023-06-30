import java.util.Objects;

class Person extends Object{
	long id;
	
	Person(long id){
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			return id == ((Person) obj).id;
		}else return false;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
	
}


public class ObjectTest10 {
	public static void main(String[] args) {
		Person p01 = new Person(24398234L);
		Person p02 = new Person(24398234L);
		
		System.out.println(p01.equals(p02));
		System.out.println(p01.id == p02.id);
	}
}