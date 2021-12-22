package com.example.new_sl;
import java.util.Random;
public class die {
    private Random r=new Random();
    public int rolldie(){
         return (int)(Math.random()*(6)+1);
//           return r.nextInt(1,7);
//        int x=r.nextInt(1,7);
    }

//    public static void main(String[] args) {
//        die d= new die();
//        for(int i=0;i<8;i++){
//            System.out.println(d.rolldie());
//        }
//
//    }
}
