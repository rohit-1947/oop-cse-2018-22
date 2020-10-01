package in.edu.tint.cse.demo;

public class MyThreadRunnable implements Runnable {
	String name;
	int threadId;
	Thread t;

	public MyThreadRunnable(String name, int threadId) {
		this.name = name;
		this.threadId = threadId;
		t = new Thread(this, "MyThreadRunnable thread: id => " + threadId);
		System.out.println(name + ": I am in MyThreadRunnable constuctor");
		t.start();
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(
					"I am in MyThreadRunnable class: ThreadId is=> " + threadId + " Counter" + i);
		}
	}
}
