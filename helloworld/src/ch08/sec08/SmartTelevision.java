package ch08.sec08;

public class SmartTelevision implements RemoteControl, Serachable{

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	
	@Override
	public void serach(String url) {
		System.out.println(url+"을 검색합니다.");
	};
	
	
}
