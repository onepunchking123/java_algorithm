package baekjoon_2750;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		
		int cnt= sc.nextInt();
		int [] array = new int[cnt];
		
		
		for(int i=0; i<cnt; i++)
		{
			
			array[i]=sc.nextInt();
		}
		
		//버블 정렬 이용해서 오름차순 정리해서 출력

	
		for(int i=0;i<array.length;i++)
		{
			for(int k=0;k<array.length-i-1;k++)
			{
				int tmp = array[k];
				if(array[k]>=array[k+1])
				{
					array[k]=array[k+1];
					array[k+1]=tmp; 
				}
			}
			
		}
		for (int i=0 ; i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
	}

}
