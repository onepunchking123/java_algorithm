package baekjoon_2566;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] tmp1 = new int[9];
		int[] max_column = new int[9];
		
		for(int i=0; i<9;i++)
		{
			for(int k=0;k<9;k++)
			{	
				int tmp3=sc.nextInt();
				if(tmp1[i]<= tmp3)
				{
					tmp1[i]=tmp3;
					max_column[i]=k+1;
				}
			}
			sc.nextLine();
		}

		int row = 0;
		int max =0;
		for(int p=0;p<9;p++)
		{
			if(max<=tmp1[p])
			{
				max=tmp1[p];
				row=p+1;
			}
		}
		
		System.out.println(tmp1[row-1]);
		System.out.print(row+" "+max_column[row-1]);
		
		
		
		
		
	}

}
