public class StringUnderstand {
    public static void main(String args[]) {
        String name = "Usaid"; // * In Heap Memory it create a string pool */
        String fName = "Usaid";// * Strings "name and fName" --> are pointing to same memory location */

        String lName = "Patel";

        String fullName;
        fullName = fName + lName;

        StringBuffer address = new StringBuffer("Taloja");
        System.out.println(address);

        System.out.println(name);
        System.out.println(fName);
        System.out.println(lName);
        System.out.println(fullName);

        address.append(" Kharghar");

        System.out.println(address);
    }

}
