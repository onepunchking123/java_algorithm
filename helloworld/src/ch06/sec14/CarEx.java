package ch06.sec14;

public class CarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		
		myCar.setSpeed(-50);
		System.out.println("현재 속도 :"+ myCar.getSpeed());
		
		myCar.setSpeed(60);
		System.out.println("현재 속도 : "+ myCar.getSpeed());
		
		if(!myCar.isStop())
		{
			myCar.setStop(true);
		}
		System.out.println("현재 속도 :"+myCar.getSpeed());

	}

}
