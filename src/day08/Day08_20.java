package day08;

class Fu{
	static{
		System.out.println("静态代码块fu");
		}
	{
		System.out.println("构造代码块Fu");
		}
	public Fu(){
		System.out.println("构造方法Fu");
		}
	
}
class Zi extends Fu{
	static{System.out.println("静态代码块Zi");}
	{System.out.println("构造代码块Zi");}
	public Zi(){
		System.out.println("构造方法Zi");
		}
	
}

public class Day08_20{
	public static void main(String[] args){
	Zi ss = new Zi();	
	}
}
