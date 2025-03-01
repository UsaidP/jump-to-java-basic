class Demo {
    public static void main(StringUnderstand args[]) {
        int a = 5;
        int b = 15;

        System.out.println(a + b);

        // if (a>b)
        // System.out.println("A is greate!"); // we can remove curly bracess if have
        // only one line inside.
        // else
        // System.out.println("B is Greater!");

        /*
         * * Java support ternery operator
         */
        // int result = a > b? a:b;
        // System.out.println(result);

        /*
         * * Switch Case In Java
         */
        // switch (a) {
        // case (4):
        // System.out.println("one");
        // break;

        // default:
        // break;
        // }

        /*
         * * Loops: While doWhile For
         */
        int i = 0;
        // while(i<5){
        // System.out.println(i);
        // i++;
        // }

        // doWhile
        do {
            System.out.println(i);
            i++;
        } while (i < 5);

    }
}