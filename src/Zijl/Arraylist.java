package Zijl;

public class Arraylist {
    private int[] Arraylist;
    private String naamArray = "";

    public Arraylist(String naamArray,int[] arraylist){
        this.Arraylist = arraylist;
        this.naamArray = naamArray;
    }


    public String getNaam(){
        return this.naamArray;
    }

    public int[] getArraylist(){
        return this.Arraylist;
    }

    }
