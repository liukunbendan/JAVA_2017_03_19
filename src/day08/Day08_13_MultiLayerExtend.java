package day08;

class GrandFather{
	
	int age = 88;
	
	public void eat(){
		System.out.println("我会吃饭");

	}
	
}

class Father extends GrandFather{
	
	int age = 66;
	public void swim() {
		
		System.out.println("我会游泳");
		System.out.println(this.age);
		System.out.println(super.age);
		
	}
	
}

public class Day08_13_MultiLayerExtend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎08课13");
		System.out.println("_________");
		
		Father son = new Father();
		son.eat();
		son.swim();
		System.out.println(son.age);
		
		
		
	}

}
