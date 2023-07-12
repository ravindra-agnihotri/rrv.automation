package intfc;

public class Ravi extends SalesMan{

    @Override
    void header() {

    }

    @Override
    void footer() {

    }

    @Override
    void body() {

    }

    public static void main(String[] args) {
        SalesMan salesMan= new Ravi();
        salesMan.logo();
    }
}
