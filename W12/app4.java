package AB;

public class app4 {
	public static void main(String[] args) {
		Thread run1 = new Thread(new Runnable() {

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
			
		});
		run1.start();
	}	

}
