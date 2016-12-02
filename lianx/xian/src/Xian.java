
public class Xian{
//其中main就是一个主线程
	public static void main(String[] args) {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("主-------------"+i);
		}
		Cheng c=new Cheng();
		c.run();
	}
	
}
//这个就是一个子线程
class Cheng extends Thread{
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 20; i++) {
			System.out.println("子---------"+i);
		}
	}
}
