package Zijl;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array list to be here!");

        int[] x = new int[] {5,4,7};

        Arraylist b = new Arraylist(x);

        b.returnArray(x);
        System.out.println(b.returnArray(x));

    }
}
