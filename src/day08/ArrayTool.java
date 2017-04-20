
/**
*这是针对数组进行操作的工具类
*@author	刘坤
*@version	V.10
*
*
*
*/

package day08;

public class ArrayTool {
	
	/**
	*这是私有构造
	*/
	private ArrayTool() {};//私有化构造方法，外界就不能创建对象了  用于工具类
	
	/**
	*这是遍历数组的方法,遍历后原样打印数组[元素1, 元素2, ]
	*@param arr 这是要被遍历的数组//说明后面需要传入一个int[] 
	*/
	
	public static void printArray(int[] arr) {
		for(int x=0; x <arr.length;x++){
			if (x == arr.length -1) {
				System.out.println(arr[x]);
			}
			else{
				System.out.print(arr[x] + ",");
			}
			
		}
	}
	/**
	*这是取数组最大值的方法,遍历后返回最大值
	*@param arr 这是要被遍历的数组
	*@return max 这是返回的最大值
	*/	
	public static int arrayMax(int[] arr){
		
		int max = arr[0];
		for(int x=0; x < arr.length;x++){
			if (max < arr[x]){ 
			max = arr[x];
			}
			// else max = max;
			
		}
		return max;
		
	}

}
