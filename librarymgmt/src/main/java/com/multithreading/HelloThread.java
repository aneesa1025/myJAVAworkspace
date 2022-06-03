package com.multithreading;

public class HelloThread extends Thread {
	private String threadName;
	
	public HelloThread(String threadName) {
		this.threadName = threadName;
	}
	@Override

	public void run() {
		
		System.out.println("Thread in Excution:" + threadName );
		for (int i = 0; i<2000; i++) {
			System.out.println(i);
		}
	}

	

}
