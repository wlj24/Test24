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
	   case 1:System.out.println("����Ƶ��");
	   break;
	   case 2:System.out.println("��ӰƵ��");
	   break;
	   case 3:System.out.println("����Ƶ��");
	   break;
	   case 4:System.out.println("����Ƶ��");
	   break;
	   case 5:System.out.println("�ٶ�Ƶ��");
	   break;
	   default:System.out.println(channel+"�����տ�");
	   
	   }
   }
}
