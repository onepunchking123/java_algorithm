package baekjoon_1152;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int cnt =0;
					Scanner sc = new Scanner(System.in);
					String str = sc.nextLine();
					
					StringTokenizer st = new StringTokenizer(str," ");		
					
					while(st.hasMoreTokens()) {
						st.nextToken();
						cnt++;
					}
					
					System.out.println(cnt);
	}

}
