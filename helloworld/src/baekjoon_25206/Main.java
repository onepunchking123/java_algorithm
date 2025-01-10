package baekjoon_25206;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		double cnt=0;
		Scanner sc = new Scanner(System.in);
		for(int i=0 ; i<20;i++)
		{
			String str = sc.nextLine();
			StringTokenizer st = new StringTokenizer(str," ");	
			st.nextToken();
			double tmp1 =Double.parseDouble(st.nextToken());
			String tmp2 =st.nextToken();
			
			
			switch(tmp2) {
			case "A+":
				cnt+=tmp1;
				tmp1=tmp1*4.5;
				sum+=tmp1;
				break;
			case "A0":
				cnt+=tmp1;
				tmp1=tmp1*4.0;
				sum+=tmp1;
				break;
			case "B+":
				cnt+=tmp1;
				tmp1=tmp1*3.5;
				sum+=tmp1;
				break;
			case "B0":
				cnt+=tmp1;
				tmp1=tmp1*3.0;
				sum+=tmp1;
				break;
			case "C+":
				cnt+=tmp1;
				tmp1=tmp1*2.5;
				sum+=tmp1;
				break;
			case "C0":
				cnt+=tmp1;
				tmp1=tmp1*2.0;
				sum+=tmp1;
				break;
			case "D+":
				cnt+=tmp1;
				tmp1=tmp1*1.5;
				sum+=tmp1;
				break;
			case "D0":
				cnt+=tmp1;
				tmp1=tmp1*1.0;
				sum+=tmp1;
				break;
			case "F" :
				cnt+=tmp1;
				tmp1=tmp1*0.0;
				sum+=tmp1;
				break;
			case "P" :
				continue;			
			}
		
		}
		System.out.println(sum/cnt);
		
		
	}

}
