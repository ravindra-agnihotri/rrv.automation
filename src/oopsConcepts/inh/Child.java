package oopsConcepts.inh;

public class Child extends Father{

public String cycle="hero";

    public static void main(String[] args) {
        System.out.println(Father.surname);
        Father father= new Father();
        System.out.println(father.car);
        System.out.println(surname);
        Child child= new Child();
        System.out.println(child.car);
        System.out.println(child.cycle);

    }
    public void bachho(){
        System.out.println(car);
    }
}
