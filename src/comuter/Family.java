package comuter;

public class Family {
	TV homeTV;
	void buyTV(TV tv){
		homeTV=tv;
		
	}
	void remoteControl(int channel){
		homeTV.setChannel(channel);
		
	}
	void seeTV()
	{
		homeTV.show();
	}

}
