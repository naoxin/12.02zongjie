
public class Runb implements Runnable{
//����runable�ӿڻص���ӡ
	public static void main(String[] args) {
		Runb r = new Runb();
		new Thread(r).start();
		
	}
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("����runable"+i);
		}
	}
	
}
