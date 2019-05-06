package AB;

public class app2 {
	public static void main(String[] args) {
		Thread run1 = new Thread(new Runner2());
		run1.start();
		
		Thread run2 = new Thread(new Runner2());
		run2.start();
	}

}
class  Runner2 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Hello"+i);
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}		
	
	
}
