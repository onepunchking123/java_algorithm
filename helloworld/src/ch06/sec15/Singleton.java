package ch06.sec15;

public class Singleton {

		// 클래스당 공유되는 객채 생성 하지만 객체로 직접적인 접근은 불가
		private static Singleton singleton = new Singleton();
		
		//생성자도 private을 이용하여 외부에서 객체를 생성할 수 없도록...
		private Singleton() {
			
		}
		
		
		public static Singleton getInstance() {
			return singleton;
		}
}
