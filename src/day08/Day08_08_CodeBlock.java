package day08;

/* 
	局部代码块：方法内部，用于限定变量生命周期
	构造代码块： 类的成员变量中，用{}框起来的代码块
				
				每次调用构造方法执行前，都会先执行构造代码块
				作用：把多个构造方法中的共同代码 放到一起 对对象初始化
				每次调用都执行
				
	静态代码块：在类中成员位置，用{}括起来，用static修饰
				作用：对类进行初始化
				只执行一次
				
	执行顺序：  静态代码块-> 构造代码块 -> 局部代码块
	
	
 */

class code{
	

	
	//构造代码块
	{
		System.out.println("构造代码块");
	}
	//构造方法
	public code(){
		System.out.println("构造方法");
	}
	//构造方法
	public code(int a) {
		System.out.println("code2");
	}

	//静态代码块
	static {
		System.out.println("静态代码块");
	}
	
} 


public class Day08_08_CodeBlock{
	
	public static void main(String[] args) {
		System.out.println("欢迎来到08天_08课_代码块");
		System.out.println("___________");
		//局部代码块,方法中出现 限定变量生命周期
		{
			int x = 10;
			System.out.println("局部代码块x=" + x);
			
		}  
		//System.out.println("x=" + x); x变量在这里失效
	
	code ap = new code(2);
	System.out.println("________");
	code ap2 = new code(2);
	System.out.println("____________");
	code ap3 = new code(2);	
	}
	
}