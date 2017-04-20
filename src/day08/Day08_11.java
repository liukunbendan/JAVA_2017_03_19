package day08;

class peopleDay08_11{
	
	static String name;
	static Integer age;
	
	public void ShengMing(){
		System.out.println("我是父类");
	}
	
}

class studentDay08_11 extends peopleDay08_11{
	
	
	public void ShengMing(){
		System.out.println("我是学生子类");
		System.out.println("年龄是"+age);
	}
}

class Hodoor extends peopleDay08_11{
	
	public void Shengming2() {
		System.out.println("我是hodoor 我不改写父类方法");
	}
}


public class Day08_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("欢迎来到08天11课程");
		System.out.println("______________");
		
		studentDay08_11 newS = new studentDay08_11();
		newS.age = 13;
		newS.ShengMing();
		
		Hodoor newS2 = new Hodoor();
		newS2.ShengMing();
		newS2.Shengming2();
	
	}

}
