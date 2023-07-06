package oopsConcepts.encapsulation;

import basics.VarTypes;

public class Padosi {

    public static void main(String[] args) {
        Home home= new Home();
        home.getDiamond();
        home.setDiamond(501);

        VarTypes maa= new VarTypes();

        maa.marksheet= "dfgdg";
        System.out.println(maa.marksheet+ " maa ne rakha");
        VarTypes dadi= new VarTypes();
        System.out.println(maa.marksheet);
        dadi.marksheet= "dfg";
        System.out.println(dadi.marksheet+ "dadi ne rakha");
        System.out.println(maa.marksheet);

        System.out.println(VarTypes.global);
        VarTypes.global= " I am a dancer";
        System.out.println(VarTypes.global);

    }


}
