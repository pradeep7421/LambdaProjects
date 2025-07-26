package com.ps.lambda.lecture1.PracticeInterface;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClassA {
public static void main(String[] args) {
	List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
	
	Map<String ,Long> map = stationeryList.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
	System.out.println(map);

    }
}
