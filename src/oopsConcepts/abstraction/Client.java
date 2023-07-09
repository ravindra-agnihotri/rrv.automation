package oopsConcepts.abstraction;

public class Client {

    public static void main(String[] args) {
        TeamLead teamLead= new Vinod();
       teamLead.implementation();
        TeamLead teamLead1= new Ranjeet();
        teamLead1.implementation();

        teamLead.clientCommunication();
    }
}
