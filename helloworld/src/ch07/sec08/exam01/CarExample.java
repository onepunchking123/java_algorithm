package ch07.sec08.exam01;

public class CarExample {

	public static void main(String[] args) {
	
		Car myCar = new Car();
		
		//부모클래스인 타이어를 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//자식 클래스인 한국타이어를 장착 -> 오버라이딩을 이용하여 부모메서드를 따로 구현
		myCar.tire = new HankookTire();
		myCar.run();
		
		//자식 클래스인 금호 타이어를 장착 -> 오버라이딩을 이용하여 부모메서드를 따로 구현
		myCar.tire = new KumhoTire();
		myCar.run();
		
		
	}

}
