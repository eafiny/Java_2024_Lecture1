package ru.muctr.Inheritance.CodeExamples;

//********** Переопределение методов *************
class A3{
    static int a3 = 10;
       public void method1(){
           System.out.println("Method1 in class A3");
       }
}

class B3 extends A3{
    static int a3 = 20;
    @Override
    public void method1() {
        System.out.println("Method1 in class B3");
    }
}

public class Example3 {
    public static void main(String[] args) {
        A3 b = new B3();
        b.method1();
        System.out.println(b.a3);

    }
}
