public class exectionHadling {
    public static void main(String args[]) {
        int num[] = { 2, 5, 6, 3, 4 };
        int a = 5;
        int b = 0;
        int result;

        try {
            result = a / b;

            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by 0.");
        }
        result = a / b;
        System.out.println(result);
    }
}
