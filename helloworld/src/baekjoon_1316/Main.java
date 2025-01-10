package baekjoon_1316;

// 못 품 
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int result = 0;
		
		
		for(int i=0;i<cnt;i++)
		{
			String str = sc.nextLine();
			
			for(int k=0 ; k<str.length();k++)
			{
				int[] tmp= new int[100];
				char c  = str.charAt(k);
				for(int p = 0 ; p<str.length();p++)
				{
					if(c == str.charAt(p))
					{
						tmp[p]=p;
					}
				}
			
			}
		}
		
		
		
		
	}

}
