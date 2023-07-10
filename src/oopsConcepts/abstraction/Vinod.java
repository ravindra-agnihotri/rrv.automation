package oopsConcepts.abstraction;

public class Vinod extends TeamLead{


    public Vinod(String naam) {
        super(naam);
    }

    @Override
    public void implementation() {
        System.out.println("i am vinod, i did this");
    }

    @Override
    public void release() {
        System.out.println("gfhgfhgfhgfyhfh");
    }
}
