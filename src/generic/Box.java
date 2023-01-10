package generic;

import java.sql.Array;

public class Box<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
    public <U extends Number> void inspect(U u) {
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
        integerBox.set(10);
        //integerBox.inspect("some text"); // error: this is still String!

        Tarrays tarrays= new Tarrays();
        Tarrays[] tarrays1= new Tarrays[10];
        countGreaterThan(tarrays1,tarrays);

    }



    /*
        Class A { ...
        }

        interface B {  ...
        }

        interface C { ...
        }

        class D<T extends A & B & C> { ...
        }

        class D <T extends B & A & C> {  ...  }  // compile-time error cause class A
         must be called first before

       */

    public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray)
            if (e.compareTo(elem) > 0)
                ++count;
        return count;
    }
}

