package oopsConcepts.polymirphis;

public class Pyasa {
    public static void main(String[] args) {
        WaterTank waterTank= new Glass();
       //class name always brings all the static m/var of WaterTank
        System.out.println(WaterTank.tap);
        //
        waterTank.storeWater();
        waterTank.storeWater();

    }
}
