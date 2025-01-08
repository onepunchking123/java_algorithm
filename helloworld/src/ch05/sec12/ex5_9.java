package ch05.sec12;

import java.util.Scanner;

public class ex5_9 {

	//배열 생성 되어잇는지 아닌지는 널체크로....
	int[] scores;
	
	int print_init(Scanner sc)
	{
		System.out.println("-------------------------------------------------");
		System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4.분석 | 5.종료");
		System.out.println("-------------------------------------------------");
		System.out.println("선택>");
		return sc.nextInt();
	}
	
	//학생 수를 입력하면 배열을 생성 해주는 함수
	void func_1(Scanner sc)
	{
		if(scores == null) {
			System.out.print("학생수>");
			int num = sc.nextInt();
			scores = new int[num];
		}
		else
		{
			System.out.println("이미 학생수를 입력하셨습니다.");
		}
	
	}
	
	//점수 입력 함수
	void func_2(Scanner sc)
	{
		if(scores!=null){
			for(int i=0;i<scores.length;i++)
			{
				System.out.print("scores["+i+"]>");
				scores[i]=sc.nextInt();
			}
		}
		else {
			System.out.println("학생 수를 먼저 입력하세요");
		}
	}
	
	
     	//점수 확인 함수
		void func_3(Scanner sc)
		{
			if(scores!=null){
				 if (scores.length == 0) { // 점수가 하나도 입력되지 않았으면
			            System.out.println("점수가 입력되지 않았습니다.");
			    }else{
					 for(int i=0;i<scores.length;i++)
					 {
						 System.out.println("scores["+i+"]>"+scores[i]);
					 }
				 }
			}
			else {
				System.out.println("학생 수를 먼저 입력하세요");
			}
		}
	
		// 최고점, 평균 확인 함수
		void func_4() {
			
			if(scores!=null)
			{
				int max = scores[0];
				int sum=0;
				for(int i=0;i<scores.length;i++)
				{
					if(max<=scores[i])
						max = scores[i];
					sum+=scores[i];
				}
				System.out.println("최고 점수:"+max);
				System.out.println("평균 점수:"+(double)sum/scores.length);
			}
			else
			{
				System.out.println("학생 수를 먼저 입력하세요");
			}
		}
		
		
		
	public static void main(String[] args) {
	
		ex5_9 m = new ex5_9();
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			
			int num = m.print_init(sc);
			switch(num)
			{
				case 1:
				{
					m.func_1(sc);
					break;
				}
				case 2:
				{	
					m.func_2(sc);
					break;
				}
				case 3:
				{
					m.func_3(sc);
					break;
				}
				case 4:
				{
					m.func_4();
					break;
				}
				case 5:
				{
					System.out.print("프로그램 종료");
					return;
				}
			}
		
		}

	}
}