package ru.muctr.Inheritance.CodeExamples;

class A4{
    void mA(){
        System.out.println("aaa");
    }
}

class B4 extends A4{
    @Override
    public  void mA(){
        System.out.println("AAA");
    }
    void mB(){
        System.out.println("BBB");
    }
}

public class Example4 {
    public static void main(String[] args) {
        A4 myObj1 = new B4();
        B4 myObj2 = new B4();
        myObj1.mA();
        myObj2.mB();
    }
}
