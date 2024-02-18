package ru.muctr.Inheritance.CodeExamples;

/**
 * @author Evgenia Skichko
 */

class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println("In class A");
    }
}

class B extends A{
//    int b;
    B(int a){
        super(a);
        System.out.println("In class B");
    }
}
public class Example1 {
    public static void main(String[] args) {
        B b = new B(1);
    }
}
