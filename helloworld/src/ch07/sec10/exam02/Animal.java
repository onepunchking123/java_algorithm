package ch07.sec10.exam02;

//추상 클래스 선언 -> 상속을 한 자식 객체로 생성을 할 수가 있음.
public abstract class Animal {

	//메소드 선언
	public void breathe() {
		
	}
	
	//추상 메서드 선언 -> 반드시 오버라이딩 해서 구현부 구현해야함
	public abstract void sound();
	
	
	
}
