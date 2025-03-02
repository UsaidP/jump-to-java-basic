import java.util.ArrayList; //*For using ArrayList we need to import it from. */

public class array {
    public static void main(String args[]) { // *Basic packeges come from "java.lang" */

        // ArrayList mix = new ArrayList();
        // mix.add(5);
        // mix.add(1);
        // mix.add(55);
        // mix.add(12);
        // mix.add(47);
        // mix.add("number");

        // System.out.println(mix);

        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(5);
        number.add(1);
        number.add(55);
        number.add(12);
        number.add(47);

        for (Integer num : number) {
            System.out.println(num);
        }
        System.out.println(number);
        System.out.println(number.get(2));
    }
}
