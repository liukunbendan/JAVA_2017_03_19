package day08;

class Father_0817{
	
	public Father_0817(){
		System.out.println("父类构造方法");
	}
}

class son extends Father_0817{
	
	public son() {
		System.out.println("子类构造方法");
	}
	
}


public class Day08_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("欢迎来到08天17课程");
		son s = new son();
		
	}

}
