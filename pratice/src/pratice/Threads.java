package pratice;

class A extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("jagdish");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Threads {

	public static void main(String[] args) throws InterruptedException {

		A t = new A();
		t.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println("Mahesh");
			Thread.sleep(1000);
			
		}
	}

}
