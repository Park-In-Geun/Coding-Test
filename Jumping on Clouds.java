
import java.util.*;

public class Example1 {
	public static void main(String args[]){
		int[] c = null;
		
		System.out.print(countingOnClouds(c));
		
	}
	
	public static int countingOnClouds(int c[]){
		
		Scanner key = new Scanner(System.in);
		int n; // �迭 ����
		int count=0;
		
		System.out.print("�迭 ���� �Է� : ");
		n = key.nextInt();
		
		for(;;){
			if(n<=2 || n>=100){
				System.out.print("�ٽ�  �Է� : ");
				n = key.nextInt();
				continue;
			}
			else
				break;
		}
		
		c = new int[n];
		for(int i=0;i<n;i++){
			c[i] = (int)Math.floor(Math.random() * 2); // 0,1 �������� ���� ����
			c[0] = 0; //ù��° ���� 0
			c[n-1] = 0; // ������ ���� 0
			if(i > 0 && c[i-1] ==1 && c[i] == 1)
				c[i] = 0;
		}
		
		System.out.print("������ ���� ���� : " + Arrays.toString(c));
		
		for(int jump=0; jump<c.length-1;jump++,count++){
			if(jump<c.length-2 && c[jump+2]==0){
				jump++;
			}
		}

		System.out.print("\n�ּ� ���� �� : ");
		
		return count;
	}
}
