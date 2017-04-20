package day08;

import java.util.*;

public class Day08_07_GuessNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("欢迎来到08天07课程");		
		System.out.println("猜数字游戏（1-100之内）");
		System.out.println("_________");

		double numb = Math.random();
		int num2n = (int)(100*numb + 0.5);
		
		while(true){
			System.out.println("请输入你要猜的数字");
			Scanner sc2 = new Scanner(System.in);
			int guessNumber = sc2.nextInt();
			
			if(guessNumber > num2n){
				System.out.println("猜的数字偏大了");
			}
			else if(guessNumber < num2n){
				System.out.println("猜的数字偏小了");
			}
			else {
				System.out.println("恭喜你猜对了");
				break;
			}
			
		}
		
	
	}

}
