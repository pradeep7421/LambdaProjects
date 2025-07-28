package com.ps.lambda.lecture1.PracticeInterface;

public class SumSquareInterfTest {

	public static void main(String[] args) {
		//Lambda expression with void returnType and passing argument as parameter
		SquareInterFace squareInterFace = (int a)->{System.out.println((a*a));};
		squareInterFace.printSquare(10);
		//Lambda expression without void returnType and passing argument as parameter without its type
		SquareInterFace squareInterFace2 = (a)->System.out.println((a*a));//for single statement curly bracket {} and type of parameter can be removed
		squareInterFace2.printSquare(10);
		
		//Lambda expression with void returnType and passing argument as parameter without its type and bracket
		SquareInterFace squareInterFace3 = a->System.out.println((a*a)); // for single argument ,argument bracket can be removed
		squareInterFace3.printSquare(10);
		
		//By using lambda exp for multiple line of code with int return type
		SumInterf sumInterf = (int a,int b)->{
		int sum = a+b;
		System.out.println("sum of two numbers -"+sum);
		return sum;
		};
		System.out.println(sumInterf.sum(10, 20));	
		
		//By using lambda exp with int return token without parameter type
		SumInterf sumInterf2 = (a,b)-> {
			return (a+b);
			};
			System.out.println(sumInterf2.sum(30, 20));		
			
		//By using lambda exp with variable type in parameter without return keyword in implementation 
		SumInterf sumInterf3 = (int a,int b)->(a+b); //remove return keyword for single line of code
		System.out.println(sumInterf3.sum(0, 2));	
		
		//By using lambda exp without variable type in parameter without return keyword 
		SumInterf sumInterf4 = (a,b)->(a+b);
		System.out.println(sumInterf4.sum(1, 0));
		
		InterfSquareIt iSqIt = a->(a*a);
		System.out.println("InterfSquareIt result - "+iSqIt.squareIt(10));
		System.out.println("InterfSquareIt result - "+iSqIt.squareIt(20));	
		
		InterfStringlength intstrlen = a-> a.length();
		InterfStringlength intstrlen2 = a-> (a.toUpperCase()+" Singh").length();
		System.out.println("InterfStringlength - "+intstrlen.getLength("Pradeep"));
		System.out.println("InterfStringlength to uppercase length - "+intstrlen2.getLength("Pradeep"));
		
		InterfStringUpperCase strUpperCase = a->a.toUpperCase();
		System.out.println("InterfStringUpperCase toUpperCase method- "+strUpperCase.toUpperCase("pradeep singh kushwaha"));
	}

}
