package Vinod;

public class Nikku extends father {
    public String job ="software";

    public String salary="fiftylakh";

    public static void main(String[] args) {
        System.out.println();
        father father =new father();
        System.out.println(father.jamin);
        dada dada=new dada();
        System.out.println(dada.jamin);
        System.out.println();
        Nikku nikku= new Nikku();
        System.out.println(nikku.job+ "              "  +nikku.salary);
    }
}
