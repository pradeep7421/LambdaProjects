package com.ps.lambda.lecture1.IterfObject;

public class InterfTest {
	
	public static void main(String[] args) {
//    First Approach of making interface object by implementing interface
		
		
//      Interf interf = new Interf() ; interface object is not possible to create
//		AbsInterf absInterf = new AbsInterf(); //abstract class object is not possible to create
		Interf interf = new InterfImpl();// As Interf class implements Interface Interf and m1() is implemented in Interf
		                                 //,then only object of Interf is created 
		Interf interf2 = new AbsInterfImpl();//Interface Interf implemmented by Abstract AbsInterf class 
                                             //which is  extended by AbsInterf then only Interface object gets
		                                     //created in which m1() method is implemented
		
		AbsInterf absInterf = new AbsInterfImpl(); //As m1() of Interf is implemented in AbsInterfImpl then only AbsInterf object gets created
	
//	    Second Approach of making anonymous class without implementing interface 
		
		Interf interf3 = new Interf() {
			@Override
			public void m1() {
				System.out.println("anonymous class implementation without implementing interface");
			}
		};
		
//	    Third Approach by using lambda Expression	
		
		//First Concept using curly bracket {} if there are multiple lines of code for implemented method
		Interf interfLambda = ()-> {
			System.out.println("Getting interface object by lambda expression for multiple lines of code");
			System.out.println("Getting interface object by lambda expression for multiple lines of code");
			System.out.println("Getting interface object by lambda expression for multiple lines of code");
			};
			
			//Second Concept without using curly bracket {} if there is only single line of code for implemented method
			Interf interfLambda2 = ()-> System.out.println("Getting interface object by lambda expression");


	}
}
