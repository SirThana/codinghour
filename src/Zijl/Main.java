package Zijl;



public class Main {

    public static void main(String[] args) {

        int[] x = new int[] {5,4,3,5,7};
        Arraylist b = new Arraylist("myArray",x);
        Arraylist c = new Arraylist("mySecondArray",x);
        System.out.println(b.getNaam());
        System.out.println(c.getNaam());


    }
}
