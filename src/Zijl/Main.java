package Zijl;
import java.util.ArrayList;
import java.util.Arrays;



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

        for (int i = 0; i <b.size() ; i++) {
          int s = (int) b.get(i);
//            System.out.println(s);
            if(s == 20){
                b.remove(i);
            }
        }
    }
}
