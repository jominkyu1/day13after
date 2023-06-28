class UserException extends Exception {
	UserException(String str){
		super(str);
	}
}


public class Test0628{
	public static void main(String[] args){
		try{
			int a=-10;

			if(a<0) {
				throw new UserException("양수가 아닙니다.!");
			}
		}catch(UserException e) {
			System.out.println(e.getMessage());
		}
	}
}