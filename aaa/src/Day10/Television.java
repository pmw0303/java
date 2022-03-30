package Day10;
										// *** implements 여러개 가능  
public class Television implements RemoteControl, Searchable{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV 전원 켜기");
	}
	public void turnOff() {
		System.out.println("TV 전원 끄기");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "검색합니다");
	}

}
