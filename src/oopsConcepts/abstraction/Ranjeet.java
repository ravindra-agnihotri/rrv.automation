package oopsConcepts.abstraction;

public class Ranjeet extends TeamLead {
    public Ranjeet(String naam) {
        super(naam);
    }

    @Override
    public void implementation() {
        System.out.println("i am ranjeet, i did this");
    }

    @Override
    public void release() {
        System.out.println("i am ranjeet, i did this");

    }
}
