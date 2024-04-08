package part2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	private int[][] arr;//=new int[6];
	private int gameCnt;  //게임수
	
	public void inputGameCnt(){
		Scanner key=new Scanner(System.in);
		System.out.print("게임수 입력:");
		gameCnt=key.nextInt();
		arr=new int[gameCnt][6];
	}
	public void gameStart(){
		Random rand=new Random();
		for(int i=0;i<gameCnt;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=rand.nextInt(45)+1;
				for(int k=0;k<j;k++){
					if(arr[i][j]==arr[i][k]){
						j--;
						break;
					}
				}
			}
		}
		sortArr(arr); //정렬
		showLottoArr(arr); //출력
	}
	private void sortArr(int[][] arr) {
		for(int i=0;i<arr.length;i++)
			Arrays.sort(arr[i]);
	}
	private void showLottoArr(int[][] arr) {
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++)
				System.out.print(arr[i][j]+",");
			System.out.println("");
		}
	}
}	
