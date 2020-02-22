package LawPractice.test;

public class DeadLockDemo {

	public static void main(String[] args) {
		Resource resource1 = new Resource("resource1", 10);
		Resource resource2 = new Resource("resource2", 20);
		
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				resource1.cooperatate(resource2);
			}
		});
		
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 10; i++) {
				resource2.cooperatate(resource1);
			}
		});
		
		thread1.start();
		thread2.start();

	}
}
