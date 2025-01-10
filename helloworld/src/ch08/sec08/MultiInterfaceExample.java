package ch08.sec08;

public class MultiInterfaceExample {

	public static void main(String[] args) {
		
		
		
		RemoteControl rc = new SmartTelevision();
		rc.turnOn();
		rc.turnOff();
		
		Serachable searchable = new SmartTelevision();
		searchable.serach("https://www.youtube.com");

		
		
	}

}
