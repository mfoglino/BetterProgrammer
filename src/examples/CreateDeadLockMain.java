package examples;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;



public class CreateDeadLockMain {

	
	private static Lock lockA = new ReentrantLock();
	private static Lock lockB = new ReentrantLock();
	
	
	static Thread a =  new Thread() {
		public void run() {
			System.out.println("locking a");
			lockA.tryLock();
			waitALittle();
			System.out.println("locking b");
			lockB.tryLock();
			lockB.unlock();
			lockA.unlock();
		}
	};
	
	
	static Thread b =  new Thread() {
		public void run() {
			System.out.println("locking b");
			lockB.tryLock();	
			waitALittle();
			System.out.println("locking a");
			lockA.tryLock();
			lockA.unlock();
			lockB.unlock();
		}

	};	
	
	private static void waitALittle() {
		try {
			Thread.sleep(1001L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10000; i++) {
			
			a.start();
			b.start();
			
			
		}
	}
}


