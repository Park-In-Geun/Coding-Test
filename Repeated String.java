import java.util.*;

public class Example2 {
	public static void main(String args[]){
		String s = "";
		long n = 0;
		
		System.out.print("\n" + repeatString(s,n));
		
		
	}
	
	public static long repeatString(String s, long n){
		
		String t = ""; //�ݺ����ڿ� ���� ���ڿ�
		int c=0; //���ڿ��� �������� �˷��ִ� ��
		long count=0; //ù��° ������ ��
		
		Scanner key = new Scanner(System.in);
		
		for(;;){
			System.out.print("���ڿ� �Է� : ");
			s = key.next();
			if(s.length()<1 && s.length()>100)
				continue;
			else break;
		}
		
		for(;;){
			System.out.print("���ڿ� �ݺ� ���� ���� : ");
			n = key.nextLong();
			if(n<1 && n>1000000000)
				continue;
			else break;
		}
		
		
		
		for(long i=0;i<n;i++,c++){
			if(c>=s.length())
				c=0;
			t += s.charAt(c);
			
		}
		System.out.println(t);
		
		for(int i=0;i<t.length();i++){
			if(t.charAt(i)=='a')
				count++;
		}
		
		return count;
	}
}
