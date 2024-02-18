package ru.muctr.Inheritance.SimpleInheritance;

import ru.muctr.Inheritance.Animals.Speaking;
import ru.muctr.Interfaces.BeStudent;

/**
 * @author Evgenia Skichko
 */
public class Developer extends Employee implements BeStudent, Speaking {
    String[] stack;
    String level;

    public String writeCode(){
        return "code";
    }

    public static void main(String[] args) {
        Developer developer = new Developer();
    }

    @Override
    public void doHomework() {

    }

    @Override
    public void doScientificWork() {

    }

    @Override
    public void getVoice() {
        System.out.println("censored");
    }
}
