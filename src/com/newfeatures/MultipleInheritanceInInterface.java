package com.newfeatures;

interface Left {
    default void m1() {
        System.out.println("Left method");
    }
}
interface Right {
    default void m1() {
        System.out.println("Right method");
    }
}
public class MultipleInheritanceInInterface implements Left, Right{
    public static void main(String[] args) {
        MultipleInheritanceInInterface t = new MultipleInheritanceInInterface();
        t.m1();
    }
    public void m1() {
        System.out.println("Overridden method");
        Left.super.m1();
        Right.super.m1();
    }
}
