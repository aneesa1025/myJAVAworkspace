package com.multithreading;

public class ThreadRunner {
	public static void main (String[] args) {
		HelloThread thread1 = new HelloThread("Thread-1");
		thread1.start();
		
		HelloThread thread2 = new HelloThread ("Thread-2");
		thread2.start();
		
		HelloThread thread3 = new HelloThread ("Thread-3");
		thread3.start();
		thread3.setPriority(1);
	}

}
