package LawPractice.test;

public class TestVolatile {

	private volatile static boolean ready;
	private volatile static int number;
	
	private static class ReadThread extends Thread {

		public void run() {
			while (!ready) {
				System.out.println("running");
				Thread.yield();
			}
			System.out.println(number);
		}
		
	}
	
	public static void main(String[] args) {
		
		new ReadThread().start();;
		number = 42;
		ready = true;
	}
}
