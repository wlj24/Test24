package comuter;

public class MainClass {
	public static void main(String args[]){
		TV hairTV=new TV();
		Family zhangsanFamily=new Family();
		zhangsanFamily.buyTV(hairTV);
		zhangsanFamily.remoteControl(5);
		System.out.println("zhangsanfamily��ʼ����Ŀ");
		zhangsanFamily.seeTV();
		System.out.println("zhangsanfamily�����Ӹ�����2Ƶ��");
		zhangsanFamily.remoteControl(2);
		zhangsanFamily.seeTV();
		
		
	}

}
