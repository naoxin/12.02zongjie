package xian2;

public class Xian implements Runnable{

	private int count=100;
	public void run() {
		// TODO Auto-generated method stub
		while(count>0){
			sale();
		}
	}
	synchronized public void sale(){
		//˫���ж�
		if(count>0){
			System.out.println(Thread.currentThread().getName()+"��Ʊ�ǣ�"+count);
			try {
				 Thread.sleep(10);
			} catch (InterruptedException e) {
                                				e.printStackTrace();
			}
			count--;
			System.out.println(Thread.currentThread().getName()+"����һ��Ʊ,��Ʊ�ǣ�"+count);
		}
	}

}
