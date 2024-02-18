package ru.muctr.Inheritance.Animals;

import ru.muctr.Inheritance.SimpleInheritance.Developer;

import java.util.Objects;

/**
 * @author Evgenia Skichko
 */
abstract class Animal{
    String type;
    int age;

    void eat(){
    }

//    abstract void getVoice();
}

class Fish extends Animal{

}
class Dog extends Animal implements Speaking{
    String owner;
    String name;

    public Dog() {
    }

    public Dog(String owner, String name) {
        this.owner = owner;
        this.name = name;
    }

    @Override
    public void getVoice() {
        System.out.println("Gav");
    }

    @Override
    public String toString() {
        return String.format("Dog %s owner %s", name, owner);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !this.getClass().equals(obj.getClass())) return false;
        Dog dog = (Dog)obj;
        return this.name.equals( dog.name) && this.owner.equals(dog.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, owner);
    }
}

class Cat extends Animal implements Speaking{
    @Override
    public void getVoice() {
        System.out.println("Meou");
    }

}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Speaking[] animals = new Speaking[]{new Dog(), new Cat(), new Developer()};
        for(Speaking animal : animals){
            animal.getVoice();
        }
        Object[] objects = new Object[]{new Cat(), new String()/*...*/};

//        Animal animal = new Animal() {
//            @Override
//            void getVoice() {
//
//            }
//        };

        Dog dog1 = new Dog("Rex", "John");
        Dog dog2 = new Dog("Rex", "John");
//        System.out.println(dog1);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog2.hashCode());
    }
}

