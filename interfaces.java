interface Computer { // * All the method diclared in interface are by "default public and abstract"
    int price = 100; // * Variable are "final(constant)" and "static" by defalut*/

    void compiler();

    default void config() { // *We can provide default method */
                            // * This new feature in java 8 */

    }
}

interface Portable {
    void portable();
}

class Desktop implements Computer { // * we have to use "implement" instead of extend */
    public void compiler() {
        System.out.println("Compiling");
    }

}

class Laptop implements Computer, Portable {
    public void compiler() {
        System.out.println("Compiling");
    }

    public void portable() {
        System.out.println("You can move it anywhere");
    }
}

class Dev {
    public void code(Computer comp) {
        System.out.println("Coding");
        comp.compiler();
    }
}

public class interfaces {
    public static void main(String args[]) {
        Computer lap = new Laptop();
        Computer Desk = new Desktop();
        Dev dev = new Dev();

        dev.code(lap);
        dev.code(Desk);
    }
}
