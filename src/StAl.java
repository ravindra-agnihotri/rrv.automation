import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StAl {

    public static void main(String[] args) {
        HashMap<String,String> map= new HashMap<>();
        map.put("Ravi","ag");
        map.put("Kas","agn");
        map.put("Vijay","agnihoptri");
        map.put("Kiran","agnihotri");
        long stream= Stream.of(map).count();

        System.out.println(stream);

    }
}
