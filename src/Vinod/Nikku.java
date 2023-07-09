package Vinod;

public class Nikku extends Father {
    public String job ="software";

    public String salary="fiftylakh";

    public static void main(String[] args) {
        System.out.println();
        Father father =new Father();
        System.out.println(father.jamin);
        Dada dada=new Dada();
        System.out.println(dada.jamin);
        System.out.println();
        Nikku nikku= new Nikku();
        System.out.println(nikku.job+ "              "  +nikku.salary);
    }
}
