package com.ps.lambda.lecture1.PracticeInterface;

@FunctionalInterface
public interface InterfSquareIt {
public int squareIt(int a);
}

@FunctionalInterface
interface InterfStringlength {
public int getLength(String str);
}

@FunctionalInterface
interface InterfStringUpperCase {
public String toUpperCase(String str);
}