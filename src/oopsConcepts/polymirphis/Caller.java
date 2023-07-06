package oopsConcepts.polymirphis;

public class Caller {
    public static void main(String[] args) {
        Parent parent= new Parent();
        parent.naukri();
        Child child= new Child();
        child.naukri();
        //
        Parent parent1;
        Parent parent2= new Child();
        //Child child1= new Parent();
       // parent1.naukri();
        //Parent. karke bulate hai static me/var ko
        // jo reference name hota hai uske sath non static me/var aate hai
        //constructor jo ki object ko initialize karta hai


    }
}
