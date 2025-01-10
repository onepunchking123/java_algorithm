package ch08.sec02;

public class RemoteControlEx {

	public static void main(String[] args) {
		
		RemoteControl rc; // 인터페이스 변수 선언
		
		
		
		rc = new Television(); // 인터페이스 객체 생성
		rc.turnOn(); // 인터페이스에 정의된 추상메서드를 재정의한 클래스인 television객체의 메소드를 호출하게 됨 -> 즉 인터페이스로 다른 객체의 메서드를 이용할 수 있게 된 것이다. 
		rc.setVolume(6);
		rc.turnOff();
		rc.setVolume(5);
		
		//디폴트 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println();
		
		rc = new Audio(); //인터페이스에 연결된 객체를 교체
		rc.turnOn(); // 다른 객체의 메서드를 불러오게 된다.
		rc.setVolume(7);

		//디폴트 메서드 호출
		rc.setMute(true);
		rc.setMute(false);
		
		//정적 메서드 호출
		RemoteControl.changeBattery();
		
	}

}
