package ch06.sec03;

public class Calculator {

	void powerOn()
	{
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 급니다.");
	}
	
	int plus(int x, int y) {
		int result= x+y;
		return result;
	}

	double divide(int x, int y) {
		double result =(double) x /(double)y;
		return result;
	}

	// 가변 길이를 이용한 매개 변수 리턴
	int sum(int ...values)
	{
		int sum=0;
		for(int i=0;i<values.length;i++)
		{
			sum+=values[i];
		}
		return sum;
	}
	
	
	
	
}
