package basics;

public class ObjectAndConstructor {
    //constructor is a method which does not have any return type
    //constructor name should be same as your class name
    //every class has a default constructor jo ki dikhta nahi hai
    //constructor is used to object creation(invoke karne)
    //constructor kitne bhi bana sakte hai

    ObjectAndConstructor(){}
    ObjectAndConstructor(String aString){}

    public static void main(String[] args) {
        System.out.println("cons");
        System.out.println(AccessModifier.aProtected);
        System.out.println(AccessModifier.aDefault);
    }
}
