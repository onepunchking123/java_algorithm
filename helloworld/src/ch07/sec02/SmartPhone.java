package ch07.sec02;

public class SmartPhone extends Phone{
	
	
	public boolean wifi;//SmartPhone에 있는 멤버..
	
	
	//생성자 선언
	public SmartPhone(String model, String color)
	{
		super(model,color); // 반드시 필요-> 부모 클래스의 생성자가 기본생성자가 아니기 때문에.. -> 매개 변수가 없는 기본생성자라면 컴파일과정에서 자동으로 삽입되기 때문에 필요하지 않다.
		System.out.println("Smartphone생성자 실행됨");
	}

	public void setWifi(boolean wifi) {
		this.wifi=wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
	
	
}
