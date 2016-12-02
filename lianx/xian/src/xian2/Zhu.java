package xian2;

public class Zhu {
	public static void main(String[] args) {
		Xian x=new Xian();
		Thread thread=new Thread(x);
		thread.setName("东东第一天卖了");
		thread.start();
		Thread thread2=new Thread(x);
		thread2.setName("东东第二天卖了");
		thread2.start();
		Thread thread3=new Thread(x);
		thread3.setName("东东第三天卖了");
		thread3.start();
	}

}
