package helloworld;

public class arrayvaluelistexample {

	public static void main(String[] args) {
		
		
		int[][] scores = {
				{80,90,60},
				{76,88}
		};
		
		
		
		System.out.println("1차원 배열 길이 (반의 수) :" +scores.length);
		System.out.println("2차원 배열 길이 (첫번째 인자) : "+scores[0].length);
		System.out.println("2차원 배열 길이 (두번째 인자) : " +scores[1].length);
	
		int class1sum = 0;
		
		for(int i=0; i<scores[0].length;i++)
		{
			class1sum+=scores[0][i];		
		}
	
		System.out.println("첫 번째 반의 점수 평균 : "+(double)class1sum/scores[0].length);
		
		
		// 다차원 배열을 생성하는 방법 2가지 
		
		//1. 모든 배열의 크기를 같게
		int[][] array1 = new int[2][3];
		
		//1. 각 차원의 요소의 배열 크기 다르게
		int[][] array2 = new int[3][];
		array2[0] = new int[2];
		array2[1] = new int[1];
		array2[2] = new int[3];
		
		
		

		
	}

}
