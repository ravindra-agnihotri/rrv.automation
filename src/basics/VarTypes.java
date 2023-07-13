package basics;

public class VarTypes {


    public static void main(String[] args) {
        String abc= "xyz";
    }
    //public static
    public static String global= " i am global var";

    //instance(object)
    public String marksheet= "dfgfdg";

    //local - any variable defined inside method or a method parameter is local var
    //it has only limit inside method
    public void method(String i){
       // System.out.println(abc);
        String local= "i am local";
    }

    public void method1(){

    }


}
