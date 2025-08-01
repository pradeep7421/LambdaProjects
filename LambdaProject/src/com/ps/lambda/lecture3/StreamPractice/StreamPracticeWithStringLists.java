package com.ps.lambda.lecture3.StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeWithStringLists {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("AAAA","AA","A","AAAAA","AAA","AAA");
        
        List<String> listStringSorted = listString.stream().sorted().collect(Collectors.toList());
        System.out.println("listStringSorted in AscendingOrder (NaturalSorting)  - "+ listStringSorted);
        
        //reverse by preDefined comparator reverseOrder method
        List<String> listStringReverseSorted = listString.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("listStringReverseSorted reverse of natural sorting (ReverseSorting)   -- "+ listStringReverseSorted);

        //by customised sorting order
        Comparator<String> comp = (i1,i2)->{
        	Integer l1 = i1.length();
        	Integer l2 = i2.length();
        	return (l1<l2)?-1:(l1>l2)?1:0;
        	
        };
        List<String> listStringByComparatorSortingByStringLength = listString.stream().sorted(comp).collect(Collectors.toList());
        System.out.println("listStringByComparatorSortingByStringLength in AscendingOrder (ReverseSorting)   -- "+ listStringByComparatorSortingByStringLength);
        
    
        List<String> listString2 = Arrays.asList("Anu","Ravi","Priya","Aakash","Ravi","AAA","Shailendra","Aakash","Zakir","Jayali","Deepak");
        
        //by compareTo natural sorting order in alphabetical order
        Comparator<String> comp2 = (i1,i2)-> i1.compareTo(i2);
        List<String> listStringSortingCompareTo=  listString2.stream().sorted(comp2).collect(Collectors.toList());
        System.out.println("listStringSortingCompareTo in AscendingOrder (naturalSorting)   -- "+ listStringSortingCompareTo); 
     
        //by compareTo reverse of natural sorting order in alphabetical order
        Comparator<String> comp3 = (i1,i2)-> -i1.compareTo(i2);
        List<String> listStringReverseSortingCompareTo=  listString2.stream().sorted(comp3).collect(Collectors.toList());
        System.out.println("listStringReverseSortingCompareTo in AscendingOrder (ReverseNaturalSorting)   -- "+ listStringReverseSortingCompareTo); 

        Comparator<String> comp4 = (i1,i2)->{
        	Integer l1 = i1.length();
        	Integer l2 = i2.length();
        	return (l1<l2)?-1:(l1>l2)?1:i1.compareTo(i2);
        	
        };
        List<String> listStringCustomisedSortingCompareTo=  listString2.stream().sorted(comp4).collect(Collectors.toList());
        System.out.println("listStringCustomisedSortingCompareTo in AscendingOrder order of length(customisedSorting)   -- "+ listStringCustomisedSortingCompareTo); 
    }


}