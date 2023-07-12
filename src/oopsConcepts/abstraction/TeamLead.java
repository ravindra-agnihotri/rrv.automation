package oopsConcepts.abstraction;

public abstract class TeamLead {
    //isme 100% abstraction nahi hota
    //abstract class can have abstract as well as
    // non-abstract(defined ) methods
    //abstract class ka object nahi bana sakte kabhi

    public TeamLead(String naam) {
        this.naam = naam;
    }

    public String naam;

    public abstract void implementation();

    public abstract void release();

    public void clientCommunication(){
        System.out.println(naam);
        System.out.println("hey client this is done");
    }
}
