package day08;

class X {
	Y b = new Y();
	X(){System.out.println("X");}// 第3个执行   第二步输出Y之后执行X的构造方法 输出X
	
}

class Y{
	Y(){System.out.println("Y");}
}


public class Day08_21 extends X {


	Y y = new Y();           //第4个执行  前面本类的父类的完成后,开始做子类的初始化  输出Y
	Day08_21(){
		super();//前面已经初始化了,此语句无效 
		System.out.println("Z");  //第5个执行 输出Z
	}
	
	public static void main(String[] args) {   //先运行main方法
		// TODO Auto-generated method stub
		System.out.println("欢迎来到08_21");   //第1个执行
		new Day08_21();    //第2个执行  day08_21到X类中   X类第一条执行Y类 所以输出Y
		
		System.out.println("开始新的计算");
		int a = 100,b=100;
		int c = 12345, d = 12345;
		System.out.println(a==b);
		System.out.println(c==d);
	}
}
