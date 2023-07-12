package oopsConcepts.abstraction;

public class Client {

    public static void hkhk(String[] args) {
        TeamLead teamLead= new Vinod("Ravi");
       teamLead.implementation();
        TeamLead teamLead1= new Ranjeet("Ravi");
        teamLead1.implementation();

        teamLead.clientCommunication();
        Manager manager=new Ravi();
        manager.khoonChoose();

    }
}
