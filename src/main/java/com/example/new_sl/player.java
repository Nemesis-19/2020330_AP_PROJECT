package com.example.new_sl;

import javafx.scene.image.ImageView;

import java.io.Serializable;

public class player implements Serializable {
    private int score;
    private boolean turn;
    private final ImageView img;
    player(boolean t,ImageView img){
        this.score=0;
        this.turn=t;
        this.img=img;
    }

    public void setScore(int cscore) {
        this.score =cscore;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    public int getScore() {
        return score;
    }

    public boolean isTurn() {
        return turn;
    }

    public ImageView getImg() {
        return img;
    }
}
