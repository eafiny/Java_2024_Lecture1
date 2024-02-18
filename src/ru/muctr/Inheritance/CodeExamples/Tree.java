package ru.muctr.Inheritance.CodeExamples;

public class Tree{
    private void grow(){
        System.out.println("Tree's growing");
    }

    public static void main(String[] args) {
        Tree tree = new Birch();
        tree.grow();
    }
}

class Birch extends Tree {
    public void grow(){
        System.out.println("Birch's growing");
    }
}
