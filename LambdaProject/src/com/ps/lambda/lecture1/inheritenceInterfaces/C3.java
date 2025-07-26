package com.ps.lambda.lecture1.inheritenceInterfaces;
@FunctionalInterface
public interface C3 extends P3{
    public void m2();
    //C3 is not functional Interface as it has two abstract method m1 from parent and m2 of itself
}
