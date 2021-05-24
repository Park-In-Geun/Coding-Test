
import java.util.*;

public class Example1 {
	public static void main(String args[]){
		int[] c = null;
		
		System.out.print(countingOnClouds(c));
		
	}
	
	public static int countingOnClouds(int c[]){
		
		Scanner key = new Scanner(System.in);
		int n; // 배열 길이
		int count=0;
		
		System.out.print("배열 길이 입력 : ");
		n = key.nextInt();
		
		for(;;){
			if(n<=2 || n>=100){
				System.out.print("다시  입력 : ");
				n = key.nextInt();
				continue;
			}
			else
				break;
		}
		
		c = new int[n];
		for(int i=0;i<n;i++){
			c[i] = (int)Math.floor(Math.random() * 2); // 0,1 랜덤으로 게임 생성
			c[0] = 0; //첫번째 구름 0
			c[n-1] = 0; // 마지막 구름 0
			if(i > 0 && c[i-1] ==1 && c[i] == 1)
				c[i] = 0;
		}
		
		System.out.print("생성된 구름 게임 : " + Arrays.toString(c));
		
		for(int jump=0; jump<c.length-1;jump++,count++){
			if(jump<c.length-2 && c[jump+2]==0){
				jump++;
			}
		}

		System.out.print("\n최소 점프 수 : ");
		
		return count;
	}
}
