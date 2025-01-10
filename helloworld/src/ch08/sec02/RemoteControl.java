package ch08.sec02;

public interface RemoteControl {

	//상수 필드 -> 기본적으로 public static 으로 선언되고, 생략되어도 컴파일 시에 추가되어 실행된다.
	public static int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	
	
	
	//메서드 필드 -> 기본적으로 추상 메서드로 되어 접근제한자와 abstract를 지정하지 않더라도 public abstract를 컴파일 시에 추가하여 실행된다.
    void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute)
		{
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	//정적 메소드 -> 인터페이스 명으로 접근이 가능
	static void changeBattery() {
		System.out.println("리모콘 건전지를 교환합니다.");
	}

}
