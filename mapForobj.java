import java.util.HashMap;
import java.util.Map;

public class mapForobj {
    public static void main(String args[]) {
        Map<Integer, String> names = new HashMap<>();

        names.put(0, "Usaid"); // * keys should be uniqeu "if same it will replace value with the last key
                               // value "*/
        names.put(1, "Mohammad");// * values can be same *//
        names.put(2, "Uzair");
        names.put(3, "Ahmad");

        System.out.println(names);
    }
}
