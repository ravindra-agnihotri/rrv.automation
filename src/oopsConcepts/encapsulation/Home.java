package oopsConcepts.encapsulation;

public class Home {
//having a private variable in my class(which cannot be called outside)
    //accessing its value outside of class by help of getter and setter
    // is called encapsulation
    private int diamond= 500;
    //getter
    public int getDiamond() {
        return diamond;
    }
    //setter
    public void setDiamond(int diamond) {
        this.diamond = diamond;
    }

}
