package com.ps.lambda.lecture2.ThreadRunnableConcept;

public class ThreadStartByLambda {
public static void main(String[] args) {
	//First method by implemeting Runnable interface with a class MyRunnable
//	Runnable run = new MyRunnable();
	Thread t1 = new Thread();
	t1.start();
	
	//Second method by Lambda expression
	Runnable run =()->{
		for(int i=0;i<=50;i++) {
			System.out.println("ThreadStartByLambda class main t thread ");
		}
	};
	
	Thread t = new Thread(run);
	t.start();
	
	for(int i=0;i<=50;i++) {
		System.out.println("main thread");
	}

}
}
