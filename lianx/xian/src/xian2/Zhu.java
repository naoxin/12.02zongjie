package xian2;

public class Zhu {
	public static void main(String[] args) {
		Xian x=new Xian();
		Thread thread=new Thread(x);
		thread.setName("������һ������");
		thread.start();
		Thread thread2=new Thread(x);
		thread2.setName("�����ڶ�������");
		thread2.start();
		Thread thread3=new Thread(x);
		thread3.setName("��������������");
		thread3.start();
	}

}
