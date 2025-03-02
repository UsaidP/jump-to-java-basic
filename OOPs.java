
class User { // ** --> class like an object constructor or a blueprint for creating objects.

    final int keys = 100; // ** --> To create a constant we use final keyword. const keyword is reserved
                          // in java
    String color = "white";
    float size = 2.5f; // ** --> we to give type at the end of float number

    public void pressed() {
        System.out.println("Key Pressed!" + " " + keys);
    }

    public void throwIt() {
        // keys = 74; // ** --> now we can't change it furture after declaring final
        // constatnt
        System.out.println("Throw keyboard on friends" + " " + keys + " " + color);
    }

    public void throwIt(int key) {
        // * same name of method but different parameter is called Method Overloading */
        // * Compile time Polymorphism */
        System.out.println("Throw keyboard on friends" + " " + keys + " " + color);
    }
}

class UserConst {
    private int age;
    private String name;

    public void data(int age, String name) { // * --> variable only access with methods.
        // * These variable are local variable becoz it is in methods works inside
        // methods only.
        this.age = age;
        this.name = name;
    }

    UserConst() {
        age = 10;
        name = "Usaid";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class SuperUser extends User {
    public void pressed() {
        // * This method override the parent methond "pressed" with this one.*/
        // * It is called method overriding */
        // * this is called Runtime Polymorphism */
        System.out.println("Key Pressed!" + " " + "Very Hard!");
    }

}

public class OOPs {
    public static void main(String args[]) {
        // Keyboard obj = new Keyboard(); //** --> creating an object
        // obj.pressed();
        // obj.throwIt();
        // obj.color = "blue";
        // obj.throwIt();

        UserConst user = new UserConst();
        user.getAge();
        user.setAge(25);
        System.out.println(user.getAge());

        // System.out.println(keyObj.name); now we can't directly access the value of
        // keyObj.name

        User user1;
        user1 = new SuperUser();
        user1.pressed();

    }
}
