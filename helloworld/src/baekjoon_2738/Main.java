package baekjoon_2738;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int tmp1 = sc.nextInt();
		int tmp2 = sc.nextInt();
		
		int[][] matrix1 = new int[tmp1][tmp2];
		int[][] matrix2  = new int[tmp1][tmp2];
		int[][] result = new int[tmp1][tmp2];
		
		
		
		for(int i=0;i<tmp1;i++)
		{
			for(int k=0; k<tmp2;k++)
			{
				matrix1[i][k] = sc.nextInt();
			}
			sc.nextLine();
		}
		

		for(int i=0;i<tmp1;i++)
		{
			for(int k=0; k<tmp2;k++)
			{
				matrix2[i][k] = sc.nextInt();
			}
			sc.nextLine();
		}
		
		
		
		
		for(int i=0 ; i<tmp1;i++)
		{
			for(int k =0 ; k<tmp2;k++)
			{
				System.out.print(matrix1[i][k]+matrix2[i][k]+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
