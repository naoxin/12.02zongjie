
public class Runb implements Runnable{
//利用runable接口回调打印
	public static void main(String[] args) {
		Runb r = new Runb();
		new Thread(r).start();
		
	}
	public void run() {
		for (int i = 0; i < 15; i++) {
			System.out.println("利用runable"+i);
		}
	}
	
}
