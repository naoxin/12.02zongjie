package xian3;
//�ֿ���
public class HouseWare {
	private int count=0;
	//���ӵ��ӻ�����
	synchronized public void addTV(){
		if(count>=4){
			try {
				this.wait();//�ȴ�
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��ʼ����");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count++;
		System.out.println("������һ̨���䣬�������"+count);
		this.notify();//��������������
	}
	//�������ӻ�����
	synchronized public void tabeTV(){
		if(count<=0){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("��ʼ���ۣ�");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		count--;
		System.out.println("������һ̨���ӻ���ʣ�ࣺ"+count);
		this.notify();
	}

}