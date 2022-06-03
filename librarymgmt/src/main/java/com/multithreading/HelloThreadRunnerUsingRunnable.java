package com.multithreading;

public class HelloThreadRunnerUsingRunnable implements Runnable {
	private String threadName;
	public HelloThreadRunnerUsingRunnable(String threadName) {
		this.threadName = threadName;
	}
	public void run() {
		System.out.println("Thread in execution:"+threadName);
		for(int i = 0; i< 2000; i++)
			System.out.println(i);
	}

}




