<<<<<<< HEAD
package _11_OOPs;

import static _11_OOPs.Introduction.show;

public class Object {
    public static void main(String[] args) {
        // we create multiple object of same class
        // object is access through (.)
        Class c = new Class();
        c.add(12,34);

        Class c1 = new Class();
        c1.subt(65,76);
        c1.multi(24,2);

        Introduction i = new Introduction();
        // direct call method then you want to import that method
        show();

        // access through static i.e call using class.method()
        Introduction.show();
    }
}
=======
package _11_OOPs;

import static _11_OOPs.Introduction.show;

public class Object {
    public static void main(String[] args) {
        // we create multiple object of same class
        // object is access through (.)
        Class c = new Class();
        c.add(12,34);

        Class c1 = new Class();
        c1.subt(65,76);
        c1.multi(24,2);

        Introduction i = new Introduction();
        // direct call method then you want to import that method
        show();

        // access through static i.e call using class.method()
        Introduction.show();
    }
}
>>>>>>> 35387576b9a0b809457b398be6486ca5e6dbc9f1
