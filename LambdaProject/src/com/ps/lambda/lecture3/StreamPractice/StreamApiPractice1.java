package com.ps.lambda.lecture3.StreamPractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApiPractice1 {
public static void main(String[] args) {
	Employee employee = new Employee();
	List<Employee> empList = employee.getEmployeeList();
	
//	//FILTER use - Get employees whose salary is above 50000
////	 List<Employee> emps =empList.stream().filter(e->e.getEmpSalary()>50000).collect(Collectors.toList());
////	 System.out.println("employees whose salary is above 50000 are -");
////	 emps.forEach(e->System.out.println(e));
//	 
//	//Increase salary by 3333 whose salary is above 30000 but below 50000
//	 System.out.println("Increase salary by 3333 whose salary is above 30000 but below 50000-");
	
             //	Increase salary by 3333 whose salary is above 30000 but below 50000
////	 List<Employee> emps2 = empList.stream().filter(e -> (e.getEmpSalary() > 30000 && e.getEmpSalary() < 50000))
////			.map(e -> {
////				System.out.println("emp before increment of salary"+e);
////				e.setEmpSalary(e.getEmpSalary() + 3333);
////				return e;
////			}).collect(Collectors.toList());
////	 System.out.println("-------------------------------------------------------------------------");
////	 emps2.forEach(e->System.out.println("emp after increment of salary- "+e));
//	
//	 //Method Reference
////	 List<Employee> emps22 = empList.stream().filter(e -> (e.getEmpSalary() > 30000 && e.getEmpSalary() < 50000))
////		.map(Employee::increaseSalaryBy3333).collect(Collectors.toList());	
////	 emps22.forEach(e->System.out.println("emp after increment of salary- "+e));
//	 
//	 //Collect each employee salary in list by method reference 
//	 List<Long> emps23 = empList.stream().map(Employee::getEmpSalary).collect(Collectors.toList());// map(e->e.getEmpSalary()) can also be used
//	 emps23.forEach(System.out::println);
//	 
//	 //Collect in map each employee salary according to department
//	Map<String,Long> mapEmpNameSalary = empList.stream().collect(Collectors.toMap(emp->emp.getEmpName(),emp->emp.getEmpSalary()));
//	System.out.println("mapEmpNameSalary - "+mapEmpNameSalary);
//	mapEmpNameSalary.forEach((k,v)->System.out.println("key is -"+ k+" , value is-"+v));
//	 
//	 //Collect in map each employee name with salary 
//		Map<String,Long> mapEmpSal = empList.stream().collect(Collectors.toMap(emp->emp.getEmpName(),emp->emp.getEmpSalary()));
//		System.out.println("mapEmpSal- "+mapEmpSal);
//		
//	//Collect in map each employee name and salary according to department 
//		Map<String,Map<String,Long>> mapOfDeptSalNameEmp= empList.stream().collect(Collectors.groupingBy(Employee::getEmpDeptName,Collectors.toMap(Employee::getEmpName, Employee::getEmpSalary)));
//		System.out.println("mapOfDeptSalNameEmp- "+ mapOfDeptSalNameEmp);
//		
//		//Collect in map based on department and then based on  group by empSalary get empId empName
//		Map<String,Map<Long,Map<Integer,String>>> mapOfDeptSalNameEmp2= empList.stream().collect(Collectors.groupingBy(Employee::getEmpDeptName,Collectors.groupingBy(Employee::getEmpSalary,Collectors.toMap(Employee::getEmpId,Employee::getEmpName))));
//	System.out.println("mapOfDeptSalNameEmp2--------------"+mapOfDeptSalNameEmp2);
//	 //Group the employee according to department
//		Map<String,List<Employee>> map2 = empList.stream().collect(Collectors.groupingBy(e->e.getEmpDeptName()));//groupingBy(Employee::getEmpSalary)
//		System.out.println("map2- "+map2);
//		
//		 //Group the employee according to Salary
//		Map<Long,List<Employee>> map3 = empList.stream().collect(Collectors.groupingBy(e->e.getEmpSalary()));//groupingBy(Employee::getEmpSalary)
//		System.out.println("map3- "+map3);
}
}
