package com.ps.lambda.lecture3.StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPracticeWithPrimitiveNumLists2 {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(10,50,12,33,0,88,55,10,50,99,1);
        
        List<Integer> listIntSorted = listInt.stream().sorted().collect(Collectors.toList());
        System.out.println("listIntSorted in AscendingOrder (NaturalSorting)   -- "+ listIntSorted);
        
        Comparator<Integer> c = (i1,i2)->(i1<i2)?-1:(i1>i2)?1:0;
        List<Integer> listIntSortedByComparatorImp = listInt.stream().sorted(c).collect(Collectors.toList());
        System.out.println("listIntSortedByComparatorImp in AscendingOrder (CustomisedSorting)   -- "+ listIntSortedByComparatorImp);
        
        List<Integer> listIntSortedByComparatorImpByCompareToOfComparable = listInt.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("listIntSortedByComparatorImpByCompareToOfComparable in AscendingOrder (CustomisedSorting)   -- "+ listIntSortedByComparatorImpByCompareToOfComparable);
    }


}