package xian3;

public class Lian3 {
	public static void main(String[] args) {
		//ʵ�����ֿ���
				HouseWare hw = new HouseWare();
				
				Worker w = new Worker(hw);
				w.start();
				
				Customer c = new Customer(hw);
				c.start();
			}
	}


