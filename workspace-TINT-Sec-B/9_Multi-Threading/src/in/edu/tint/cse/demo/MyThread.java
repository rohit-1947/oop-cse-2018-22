package in.edu.tint.cse.demo;

public class MyThread extends Thread {
	String name;
	int id;
	public Thread t;

	public MyThread(String name, int id) {
		this.name = name;
		this.id = id;
		t = new Thread(this, "MyThread");
		System.out.println(name + " : I am in MyThread constructor");
		t.start();
	}

	public void run() {
		for (int x = 1; x <= 5; x++) {
			System.out.println("I am in run method of MyThread class: id=>" + id + " counter" + x);
		}
	}
}
