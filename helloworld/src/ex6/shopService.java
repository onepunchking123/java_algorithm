package ex6;

public class shopService {

	private static shopService shopservice = new shopService();
	
	private shopService(){
		
	}
	
	static shopService getInstance(){
		return shopservice;
	}
	
}
