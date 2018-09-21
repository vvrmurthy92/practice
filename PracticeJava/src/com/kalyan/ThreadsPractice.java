package com.kalyan;

public class ThreadsPractice extends Thread{
	
	@Override
	public void run() {

		System.out.println("called Thread " + Thread.currentThread().getName());
		super.run();
		
	}

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 8; i++) {
			ThreadsPractice tp = new ThreadsPractice();
			tp.setName(Integer.toString(i));
			tp.start();
			System.out.println(tp.getState().toString());
			

		}
	}
	
	
}
