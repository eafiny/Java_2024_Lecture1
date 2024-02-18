package ru.muctr.Inheritance.CodeExamples;

class A6{
    int i = 0;
    public void go(){}
}
public class Example6 extends A6 {
    int i = 1;

    public Example6(){
        int i = 10;
        i = 10;
    }

    public void go(){
        System.out.println("running i = " + this.i);
    }

    public static void main(String[] args) {
        A6 myObj = new Example6();
        myObj.go();
        System.out.println("i = " + myObj.i);
    }
}
