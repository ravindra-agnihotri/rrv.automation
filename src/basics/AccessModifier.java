package basics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class AccessModifier {

    //public
    public static String one= "i am one";

    //private
    private static String aPrivate= "only in class";

    //protected
    protected static String aProtected = "meri beti";

    //default
    static String aDefault= "my pet dog";

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(aPrivate);



    }

}
