package comuter;

public class TV {
	int channel;
	public void setChannel(int channel){
		this.channel=channel;
		
	} 
	public int getChannel(){
		return channel;
	}
   public void show(){
	   switch(channel){
	   case 1:System.out.println("体育频道");
	   break;
	   case 2:System.out.println("电影频道");
	   break;
	   case 3:System.out.println("军事频道");
	   break;
	   case 4:System.out.println("经济频道");
	   break;
	   case 5:System.out.println("少儿频道");
	   break;
	   default:System.out.println(channel+"不能收看");
	   
	   }
   }
}
