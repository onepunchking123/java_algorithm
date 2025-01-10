package ch08.sec07;

public interface Service {

	//디폴트 키워드를 사용하면 인터페이스 내에서도 구현되어잇는 함수를 사용할 수 있다. Java8 이상버전부터
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		
	}
	
	private void defaultCommon() {
		System.out.println("defaultMethod 중복 코드 A");
		System.out.println("defaultMethod 중복 코드 B");
	}
	
	
	static void staticMethod1() {
		System.out.println("staticMethod1 중속 코드");
		staticCommon();
	}
	
	
	static  void staticMethod2() {
		System.out.println("staticMethod2 종속 코드");
		staticCommon();
	}
	
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드 C");
		System.out.println("staticMethod 중복 코드 D");
	}
	
	
}
