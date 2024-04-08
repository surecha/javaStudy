package part2;

import java.util.Random;
import java.util.Scanner;

public class RandomTest_62_1 {
	public static void main(String[] args) {
		int min,max;
		Scanner key=new Scanner(System.in);
		System.out.print("시작 정수 입력: ");
		min=key.nextInt();  //10
		System.out.print("마지막 정수 입력: ");
		max=key.nextInt();   //30
		int n=max-min+1;     //20+1
		
		Random rand=new Random();
		for(int i=0; i<10; i++)
			System.out.println(rand.nextInt(n)+min);
                                  //(0-20) + 10 -->10~30 
	}

}
