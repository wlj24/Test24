package comuter;

public class MainClass {
	public static void main(String args[]){
		TV hairTV=new TV();
		Family zhangsanFamily=new Family();
		zhangsanFamily.buyTV(hairTV);
		zhangsanFamily.remoteControl(5);
		System.out.println("zhangsanfamily开始看节目");
		zhangsanFamily.seeTV();
		System.out.println("zhangsanfamily将电视更换到2频道");
		zhangsanFamily.remoteControl(2);
		zhangsanFamily.seeTV();
		
		
	}

}
