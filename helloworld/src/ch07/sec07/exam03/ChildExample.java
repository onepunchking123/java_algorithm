package ch07.sec07.exam03;

public class ChildExample {

	public static void main(String[] args) {
	
		//자동 형현봔 -> 부모 객체부분만 접근이 가능, 실제 가지고 있는건 child도 가지고있음
		Parent parent = new Child();
		
		
		//parent  변수로 부모객체인 Parent 부분만 접근이 가능하다!
		parent.filed1 = "data";
		parent.method1();
		parent.method2();
		
		 //강제 형변환을 이용하여 실제 가지고 잇던 child 부분도 접근하도록 하게 할 수 있다.
		Child child = (Child)parent;
		
		child.field2="data2";
		child.method3();
		
	}

}
