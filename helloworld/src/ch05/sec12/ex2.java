package ch05.sec12;

public class ex2 {

	public static void main(String[] args) {
	
		int sum=0;
		int size = 0;
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
				
		};
		for(int i=0;i<array.length;i++)
		{
			
			for(int k=0;k<array[i].length;k++)
			{
				sum+=array[i][k];
				size++;
			}
		}
		System.out.println("전체 합 : "+sum);
		System.out.println("전체 평균 :"+(double)sum/size);
	}

}
