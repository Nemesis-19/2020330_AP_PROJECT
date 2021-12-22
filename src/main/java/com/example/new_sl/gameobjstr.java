package com.example.new_sl;

import javafx.scene.image.ImageView;

import java.util.ArrayList;

public class gameobjstr<T>{
    ArrayList<T> store;
    gameobjstr(){
        this.store=new ArrayList<>();
    }
    public void add(T o){
        this.store.add(o);
    }
    public int goneto(int i){
        for(int j=0;j<store.size();j++){
            if(store.get(j).getClass().getSimpleName().equals("snake") || store.get(j).getClass().getSimpleName().equals("ladders")){
                gamechars m=(gamechars) store.get(j);
                if(m.getTnum()==i){
                    return m.getGetTnum();
                }

            }
        }
        return 0;
    }

    public String getcname(int i){
        for(int j=0;j<store.size();j++){
            if(store.get(j).getClass().getSimpleName().equals("snake")){
                snake s=(snake) store.get(j);
                if (s.getTnum()==i){
                    return "Snake";
                }

            }
            else if(store.get(j).getClass().getSimpleName().equals("ladders")){
                ladders s=(ladders) store.get(j);
                if (s.getTnum()==i){
                    return "Ladder";
                }
            }
        }
        return "";
    }

//    public static void main(String[] args) {
//        player p=new player(true,new ImageView());
//        System.out.println(p.getClass().getSimpleName());
//    }
}
