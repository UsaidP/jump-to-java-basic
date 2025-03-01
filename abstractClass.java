// class Computer { //* We can create an obj of Computer class. But we dont wanted to create any obj here. */
//     public void compiler() {

//     }
// }

// * We cannot create Object of a abstract class */
abstract class Computer { // *By using abstract we can only declared method and make class abstract*/
    public abstract void compiler(); // * If we want to make method abstract the class should be abstract */

    public void name() { // * If we have class abstract. we can have abstract method and also can have
                         // * normal method in it. */

    }
}

class Desktop extends Computer {
    // * Any class which extends abstract class have to implement abstaract method
    // * other than that make this class which
    // * extend abstract class abstract should be abstarct*/

    public void compiler() {
        System.out.println("Compiling! faster");
    }
}

class Laptop extends Computer {
    public void compiler() {
        System.out.println("Compiling!");
    }
}

class Dev {
    public void code(Computer pc) {
        pc.compiler();
        System.err.println("Coding!");
    }
}

public class abstractClass {
    public static void main(String args[]) {
        Computer pc = new Desktop();
        Computer laptop = new Laptop();
        Dev dev1 = new Dev();
        dev1.code(laptop);
        dev1.code(pc);

        // Computer com = new Computer(); Note:
        // * We cannot not create object of an abstract class */
    }

}
