package oopsConcepts.abstraction;

public abstract class TeamLead {
    //abstract class can have abstract as well as
    // non-abstract(defined ) methods

    public abstract void implementation();

    public abstract void release();

    public void clientCommunication(){
        System.out.println("hey client this is done");
    }
}
