
public class Xian{
//����main����һ�����߳�
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("��-------------"+i);
		}
		Cheng c=new Cheng();
		c.run();
	}
	
}
//�������һ�����߳�
class Cheng extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 20; i++) {
			System.out.println("��---------"+i);
		}
	}
}
