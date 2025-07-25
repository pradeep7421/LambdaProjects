package com.ps.lambda.lecture1;

import com.ps.lambda.lecture1.PracticeInterface.SquareInterFace;
import com.ps.lambda.lecture1.PracticeInterface.SumInterf;

public class SumInterfImpl {

	public static void main(String[] args) {
		//Lambda expression without returnType and passing argument as parameter
		SquareInterFace squareInterFace = (int a)->{System.out.println((a*a));};
		squareInterFace.printSquare(10);
		//Lambda expression without returnType and passing argument as parameter without its type
		SquareInterFace squareInterFace2 = (a)->System.out.println((a*a));//for single statement curly bracket {} and type of parameter can be removed
		squareInterFace2.printSquare(10);
		
		//Lambda expression without returnType and passing argument as parameter without its type and bracket
		SquareInterFace squareInterFace3 = a->System.out.println((a*a)); // for single argument ,argument bracket can be removed
		squareInterFace3.printSquare(10);
		
		//By using lambda exp for multiple line of code with return type
		SumInterf sumInterf = (int a,int b)->{
		int sum = a+b;
		System.out.println("sum of two numbers -"+sum);
		return sum;
		};
				 
		//By using lambda exp with  return token without parameter type
		SumInterf sumInterf2 = (a,b)-> {
			return (a+b);
			};
			
		//By using lambda exp with variable type in parameter without return token 
		SumInterf sumInterf3 = (int a,int b)->(a+b); //remove return keyword for single line of code
	
		//By using lambda exp without variable type in parameter without return keyword 
		SumInterf sumInterf4 = (a,b)->(a+b);
				
		
	}

}
