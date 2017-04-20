package day08;

public class Day08_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("欢迎来到08天 02课程");
	System.out.println("----------------");
	
	int[] arr = {1,3,5,7,9,22};
	
	ArrayTool.printArray(arr);//调用静态方法
	
	int max = ArrayTool.arrayMax(arr);
	System.out.println("max ="+ max);
	
	
	}

}
