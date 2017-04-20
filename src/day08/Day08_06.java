package day08;
// 练习使用math函数生成随机数功能 通过帮助文档来使用
/* 
1.属于lang包, 不需要导入
2.没有构造方法，因为成员都是静态的

*/

public class Day08_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到08天06课程");
		System.out.println("_______________");

		
	double d = Math.random();
	
	System.out.println("random ="+ d);
	
	int m = (int) (100*d + 0.5);
	
	System.out.println("m ="+m);
	
	 m = Math.abs(-2);
	 System.out.println("m ="+m);
	
	}

}
