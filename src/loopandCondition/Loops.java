package loopandCondition;

public class Loops {

    public static void pahada(){
        int chakkar;
        for (chakkar=0; chakkar<=20; chakkar++){
            System.out.println(chakkar);
        }
    }

    public static void ifElse(){
        int i=20;

        if (i==10){
            System.out.printf("roti khalo");
        }
        else {
            System.out.println("nahi to kuch bhi khalo");
        }
    }

    public static void doWhile(){
        int i=0;
        do {
            System.out.println(i+ "Before");
            i++;
            System.out.println(i);
        }while (i<10);
    }
    public static void main(String[] args) {
        ifElse();
    }
}
