package ch08.sec02;
 
public class Audio implements RemoteControl{

	private int volume;
	private int memoryVolume; //무음 모드 해제시 원래 볼륨으로 돌아오기 위한 임시 저장 공간
	
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	
	@Override 
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUMN) {
			this.volume = RemoteControl.MAX_VOLUMN; 
		} else if(volume < RemoteControl.MIN_VOLUMN) {
			this.volume = RemoteControl.MIN_VOLUMN;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨: "+this.volume);
	}
	
	
	
	@Override
	public void setMute(boolean mute) {
		if(mute) {
			this.memoryVolume = this.volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUMN);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume); //원래 볼륨으로 돌아오기 위해서..
		}
		
		
		
	}
	
	
	
}
