package Zijl;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        ArrayList b = new ArrayList();
        b.add(17);
        System.out.println(b);
        b.add(3);
        System.out.println(b);
        b.add(0,12);
        System.out.println(b);
        b.add(1,-8);
        System.out.println(b);

        for (int i = 0; i < 5; i++) {
            System.out.println(b);
            b.add(3,20);
        }   System.out.println(b);

        System.out.println(b.size());
        b.set(2,-5);
        System.out.println(b);
        b.remove(b.size() - 2);
        System.out.println(b);
        int flip = (int) b.get(2) * - 1;
        b.set(2,flip);
        System.out.println(b);

        /**
         * removes all objects out of @b
         * if the int of that object is equal to 20
         */
        for (int i = 0; i <b.size() ; i++) {
          int s = (int) b.get(i);
            if(s == 20){
                b.remove(i);
                i--;
            }
        }

        System.out.println(b);

        /**
         * saves the biggest int object out of b in @maxObject
         */
        int maxObject = 0;
        for (int i = 0; i <b.size() ; i++) {
        if (maxObject <= (int)b.get(i))   {
            maxObject = (int) b.get(i);

        }
        }
        System.out.println(maxObject);

        Collections.sort(b);
        System.out.println(b);
        Collections.shuffle(b);
        System.out.println(b);
        Collections.sort(b);
        System.out.println(b);


    }
}
