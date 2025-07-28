package com.ps.lambda.lecture2.ThreadRunnableConcept;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<=50;i++) {
			System.out.println("MyRunnable class method");
		}
		
	}

}
