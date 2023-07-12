package basics;

public class VarTypes {
    //single  line comment
    /*
    multi line comment
     */




    public static void main(String[] args) {
        String abc= "xyz";
    }
    //public static
    public static String global= " i am global var";

    //instance(object)
    public String marksheet= "dfgfdg";

    //local - any variable defined inside method or a method parameter is local var
    public void method(String i){
       // System.out.println(abc);
        String local= "i am local";
    }

    /**
     * document comment
     * @param str
     */
    public void method1(String str){

    }

    /**ye methjod tume jo bhi parameter doge uska juice bana ke degi
     *
     * @param noOfFruit - isme kitne fruit dalne dal do lekin wo int
     *                  typr ke hone chaiye
     */
    public void mixer(int noOfFruit){

    }


}
