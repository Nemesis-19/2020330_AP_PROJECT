package com.example.new_sl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.lang.Math;

import java.util.Random;

import static java.lang.System.exit;

public class controller {
    @FXML
    private Button dback;
    @FXML
    private Button exit;
    @FXML
    private Group grp;

    @FXML
    private Button bkbtn;
    @FXML
    private ImageView brc;
    @FXML ImageView bcimg;
    @FXML
    private Button startgame;
    @FXML
    private Label l1;
    @FXML
    private Label l2;
    @FXML
    private Label tap;
    @FXML
    private ImageView back;
    @FXML
    ImageView av1;
    @FXML
    ImageView av2;
    @FXML
    private Rectangle rect;
    @FXML
    private ImageView dice;
    @FXML
    private ImageView img;
    @FXML
    private Label l;
    @FXML
    private Label p1;
    @FXML
    private Label p2;
    @FXML
    private AnchorPane pane;
    @FXML
//    public Circle player1;
    private  double x1;
    private  double y1;
    @FXML
//    public Circle player2;
    private  double x2;
    private  double y2;
    @FXML
    private Button button;

    boolean p1turn=true;
    boolean p2turn=false;

    int tp1=0;
    int sum1=0;
    int tp2=0;
    int sum2=0;


    public void exit1(ActionEvent e){
        exit(0);
    }
    public void dbback(ActionEvent e){
        p1.setDisable(false);
        p2.setDisable(false);
        l.setDisable(false);
        img.setDisable(false);
        dice.setDisable(false);
        rect.setDisable(false);
        l1.setDisable(false);
        l2.setDisable(false);
        button.setDisable(false);
        av1.setDisable(false);
        av2.setDisable(false);
        tap.setDisable(false);
        grp.setDisable(true);
        grp.setVisible(false);
    }


    public void backbutton(ActionEvent e){
        p1.setDisable(true);
        p2.setDisable(true);
        l.setDisable(true);
        img.setDisable(true);
        dice.setDisable(true);
        rect.setDisable(true);
        l1.setDisable(true);
        l2.setDisable(true);
        button.setDisable(true);
        av1.setDisable(true);
        av2.setDisable(true);
        tap.setDisable(true);
        grp.setDisable(false);
        grp.setVisible(true);

    }
    public void startgame(ActionEvent e){
        bkbtn.setVisible(true);
        p1.setVisible(true);
        p2.setVisible(true);
        p2.setDisable(true);
        l2.setDisable(true);
        l.setVisible(true);
        img.setVisible(true);
        dice.setVisible(true);
        rect.setVisible(true);
        l1.setVisible(true);
        l2.setVisible(true);
        button.setVisible(true);
        av1.setVisible(true);
        av2.setVisible(true);
        tap.setVisible(true);
        startgame.setVisible(false);
        brc.setVisible(true);
        bcimg.setVisible(true);

    }

    private void show(boolean t1,boolean t2){
        if(t1){
            l2.setDisable(false);
            p2.setDisable(false);
            l1.setDisable(true);
            p1.setDisable(true);
        }
        else {

            l1.setDisable(false);
            p1.setDisable(false);
            l2.setDisable(true);
            p2.setDisable(true);
        }
    }
    public void move(ActionEvent e) throws InterruptedException {
        show(p1turn,p2turn);
        int x = (int)(Math.random()*(6)+1);
        l.setText("Number = "+Integer.toString(x));
        Image im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\1d.jpg");
        if(x==1)
        {
            dice.setImage(im);
        }
        if(x==2)
        {
            im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\2d.jpg");
            dice.setImage(im);
        }
        if(x==3)
        {
            im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\3d.jpg");
            dice.setImage(im);
        }
        if(x==4)
        {
            im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\4d.jpg");
            dice.setImage(im);
        }
        if(x==5)
        {
            im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\5d.jpg");
            dice.setImage(im);
        }
        if(x==6)
        {
            im=new Image("file:src\\main\\resources\\com\\example\\new_sl\\6d.jpg");
            dice.setImage(im);
        }
        if(p1turn)
        {
            if(tp1==0&&x==1)
            {
//                player1.setCenterY(y1=y1-70);
//                player1.setCenterX(x1=x1+5);
//                player1.toFront();
                av1.setY(y1=y1-70);
                av1.setX(x1=x1+5);
                

                tp1++;
                p1turn=false;
                p2turn=true;
                sum1=sum1+x;
                p1.setText("PLAYER 1: "+sum1);
            }
            else if(tp1==0&&x>1)
            {
                p1turn=false;
                p2turn=true;
            }
            else if(tp1>0)
            {
                sum1=sum1+x;
                if(sum1<=10) {

//                    player1.setCenterX(x1 = x1 + 72 * x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                        
                    }
                    if(sum1==4)
                    {
//                        player1.setCenterX(x1 = x1 + 72);
//                        player1.setCenterY(y1 = y1 - 170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1-44);
                            
                        }
                        sum1=45;
                    }
                    if(sum1==6)
                    {
//                        player1.setCenterX(x1 = x1 - 72);
//                        player1.setCenterY(y1 = y1 - 75);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-38);
                            
                        }
                        sum1=25;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>10&&sum1<=20&&sum1-x<=10)
                {
//                    player1.setCenterX(x1=x1+72*(10-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-11));
//                    player1.toFront();
                    for(int i=0; i<10-sum1+x; i++)
                    {
                        av1.setX(x1=x1+72);
                        
                    }
                    av1.setY(y1=y1-45);
                    for(int i=0; i<sum1-11; i++)
                    {
                        av1.setX(x1=x1-72);
                        
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=20)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                        
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>20&&sum1<=30&&sum1-x<=20)
                {
//                    player1.setCenterX(x1=x1-72*(20-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-21));
//                    player1.toFront();
                    for(int i=0; i<20-sum1+x; i++)
                    {
                        av1.setX(x1=x1-72);
                        
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-21; i++)
                    {
                        av1.setX(x1=x1+72);
                        
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=30)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>30&&sum1<=40&&sum1-x<=30)
                {
//                    player1.setCenterX(x1=x1+72*(30-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1-72*(sum1-31));
//                    player1.toFront();
                    for(int i=0; i<30-sum1+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-31; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==32)
                    {
//                        player1.setCenterX(x1=x1-72*4);
//                        player1.setCenterY(y1 = y1 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1-72);
                            av1.setY(y1=y1+32.5);
                        }
                        sum1=5;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=40)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==40)
                    {
//                        player1.setCenterX(x1=x1+72*3);
//                        player1.setCenterY(y1 = y1 - 170);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1+72);
                            av1.setY(y1=y1-56);
                        }
                        sum1=77;
                    }
                    if(sum1==32)
                    {
//                        player1.setCenterX(x1=x1-72*4);
//                        player1.setCenterY(y1 = y1 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1-72);
                            av1.setY(y1=y1+31);
                        }
                        sum1=5;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>40&&sum1<=50&&sum1-x<=40)
                {
//                    player1.setCenterX(x1=x1-72*(40-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-41));
//                    player1.toFront();
                    for(int i=0; i<40-sum1+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-41; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(sum1==43)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+120);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+30);
                        }
                        sum1=17;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=50)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(sum1==47)
                    {
//                        player1.setCenterX(x1=x1-72);
//                        player1.setCenterY(y1=y1-85);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-42.5);
                        }
                        sum1=66;
                    }
                    if(sum1==50)
                    {
//                        player1.setCenterX(x1=x1-72*2);
//                        player1.setCenterY(y1=y1-212);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1-48);
                            av1.setY(y1=y1-73);
                        }
                        sum1=93;
                    }
                    if(sum2==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+30);
                        }
                        sum2=17;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>50&&sum1<=60&&sum1-x<=50)
                {
//                    player1.setCenterX(x1=x1+72*(50-sum1+x));
//                    player1.setCenterY(y1=y1-42);
//                    player1.setCenterX(x1=x1-72*(sum1-51));
//                    player1.toFront();
                    for(int i=0; i<50-sum1+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-51; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==52)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=11;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=60)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==52)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=11;
                    }
                    if(sum1==57)
                    {
//                        player1.setCenterY(y1=y1+120);
                        for(int i=0; i<3; i++)
                        {
                            av1.setY(y1=y1+40);
                        }
                        sum1=24;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>60&&sum1<=70&&sum1-x<=60)
                {
//                    player1.setCenterX(x1=x1-72*(60-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-61));
//                    player1.toFront();
                    for(int i=0; i<60-sum1+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-61; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(sum1==61)
                    {
//                        player1.setCenterX(x1=x1+72*2);
//                        player1.setCenterY(y1=y1-120);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1+48);
                            av1.setY(y1=y1-44);
                        }
                        sum1=98;
                    }
                    if(sum1==62)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=22;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=70)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(sum1==68)
                    {
//                        player1.setCenterX(x1=x1-72);
//                        player1.setCenterY(y1=y1+85);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-42.5);
                        }
                        sum1=87;
                    }
                    if(sum1==62)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=22;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>70&&sum1<=80&&sum1-x<=70)
                {
//                    player1.setCenterX(x1=x1+72*(70-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-71));
//                    player1.toFront();
                    for(int i=0; i<70-sum1+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-45);
                    for(int i=0; i<sum1-71; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=80)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>80&&sum1<=90&&sum1-x<=80)
                {
//                    player1.setCenterX(x1=x1-72*(80-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1+72*(sum1-81));
//                    player1.toFront();
                    for(int i=0; i<80-sum1+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-81; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<=90)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>90&&sum1<=100&&sum1-x<=90)
                {
//                    player1.setCenterX(x1=x1+72*(90-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-91));
//                    player1.toFront();
                    for(int i=0; i<90-sum1+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<sum1-91; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==91)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=51;
                    }
                    if(sum1==95)
                    {
//                        player1.setCenterY(y1=y1+85);
//                        player1.setCenterX(x1=x1-72);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=76;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1<100)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(sum1==95)
                    {
//                        player1.setCenterY(y1=y1+85);
//                        player1.setCenterX(x1=x1-72);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1+42.5);
                        }
                        sum1=76;
                    }
                    if(sum1==99)
                    {
//                        player1.setCenterY(y1=y1+360);
//                        player1.setCenterX(x1=x1-72*8);
                        for(int i=0; i<8; i++)
                        {
                            av1.setY(y1=y1+45);
                            av1.setX(x1=x1-72);
                        }
                        sum1=10;
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+sum1);
                    tp1++;
                    p1turn = false;
                    p2turn = true;
                }
                else if(sum1>=100)
                {
//                    player1.setCenterX(x1=x1-72*(100-sum1+x));
//                    player1.toFront();
                    for(int i=0; i<100-sum1+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    tp1++;
                    p1.setText("PLAYER 1: "+100);
                    l.setText("Player 1 Won!");
                    p1turn = false;
                    p2turn = false;
                }
            }
        }
        else if(p2turn)
        {
            if(tp2==0&&x==1)
            {
//                player2.setCenterY(y2=y2-70);
//                player2.setCenterX(x2=x2+5);
//                player2.toFront();
                av2.setY(y2=y2-70);
                av2.setX(x2=x2+5);
                tp2++;
                p2turn=false;
                p1turn=true;
                sum2=sum2+x;
                p2.setText("PLAYER 2: "+sum2);
            }
            else if(tp2==0&&x>1)
            {
                p2turn=false;
                p1turn=true;
            }
            else if(tp2>0)
            {
                sum2=sum2+x;
                if(sum2<=10)
                {
//                    player2.setCenterX(x2 = x2 + 72 * x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(sum2==4)
                    {
//                        player2.setCenterX(x2 = x2 + 72);
//                        player2.setCenterY(y2 = y2 - 170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2-44);
                        }
                        sum2=45;
                    }
                    if(sum2==6)
                    {
//                        player2.setCenterX(x2 = x2 - 72);
//                        player2.setCenterY(y2 = y2 - 75);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-38);
                        }
                        sum2=25;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>10&&sum2<=20&&sum2-x<=10)
                {
//                    player2.setCenterX(x2=x2+72*(10-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-11));
//                    player2.toFront();
                    for(int i=0; i<10-sum2+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-45);
                    for(int i=0; i<sum2-11; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=20)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>20&&sum2<=30&&sum2-x<=20)
                {
//                    player2.setCenterX(x2=x2-72*(20-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-21));
//                    player2.toFront();
                    for(int i=0; i<20-sum2+x; i++);
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-21; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=30)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>30&&sum2<=40&&sum2-x<=30)
                {
//                    player2.setCenterX(x2=x2+72*(30-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2-72*(sum2-31));
//                    player2.toFront();
                    for(int i=0; i<30-sum2+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-31; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==32)
                    {
//                        player2.setCenterX(x2=x2-72*4);
//                        player2.setCenterY(y2 = y2 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2-72);
                            av2.setY(y2=y2+32.5);
                        }
                        sum2=5;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=40)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==40)
                    {
//                        player2.setCenterX(x2=x2+72*3);
//                        player2.setCenterY(y2 = y2 - 170);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1+72);
                            av1.setY(y1=y1-56);
                        }
                        sum2=77;
                    }
                    if(sum2==32)
                    {
//                        player2.setCenterX(x2=x2-72*4);
//                        player2.setCenterY(y2 = y2 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1-72);
                            av1.setY(y1=y1+31);
                        }
                        sum2=5;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>40&&sum2<=50&&sum2-x<=40)
                {
//                    player2.setCenterX(x2=x2-72*(40-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-41));
//                    player2.toFront();
                    for(int i=0; i<40-sum2+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-41; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(sum2==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+30);
                        }
                        sum2=17;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=50)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(sum2==47)
                    {
//                        player2.setCenterX(x2=x2-72);
//                        player2.setCenterY(y2=y2-85);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-42.5);
                        }
                        sum2=66;
                    }
                    if(sum2==50)
                    {
//                        player2.setCenterX(x2=x2-72*2);
//                        player2.setCenterY(y2=y2-212);
                        for(int i=0; i<3; i++)
                        {
                            av2.setX(x2=x2-48);
                            av2.setY(y2=y2-73);
                        }
                        sum2=93;
                    }
                    if(sum2==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+30);
                        }
                        sum2=17;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>50&&sum2<=60&&sum2-x<=50)
                {
//                    player2.setCenterX(x2=x2+72*(50-sum2+x));
//                    player2.setCenterY(y2=y2-42);
//                    player2.setCenterX(x2=x2-72*(sum2-51));
//                    player2.toFront();
                    for(int i=0; i<50-sum2+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-51; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==52)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+42.5);
                        }
                        sum1=11;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=60)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==52)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=11;
                    }
                    if(sum2==57)
                    {
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<3; i++)
                        {
                            av2.setY(y2=y2+40);
                        }
                        sum2=24;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>60&&sum2<=70&&sum2-x<=60)
                {
//                    player2.setCenterX(x2=x2-72*(60-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-61));
//                    player2.toFront();
                    for(int i=0; i<60-sum2+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-61; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(sum2==61)
                    {
//                        player2.setCenterX(x2=x2+72*2);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<3; i++)
                        {
                            av2.setX(x2=x2+48);
                            av2.setY(y2=y2-40);
                        }
                        sum2=98;
                    }
                    if(sum2==62)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=22;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=70)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(sum2==68)
                    {
//                        player2.setCenterX(x2=x2-72);
//                        player2.setCenterY(y2=y2-85);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-42.5);
                        }
                        sum2=87;
                    }
                    if(sum2==62)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=22;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>70&&sum2<=80&&sum2-x<=70)
                {
//                    player2.setCenterX(x2=x2+72*(70-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-71));
//                    player2.toFront();
                    for(int i=0; i<70-sum2+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-45);
                    for(int i=0; i<sum2-71; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=80)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>80&&sum2<=90&&sum2-x<=80)
                {
//                    player2.setCenterX(x2=x2-72*(80-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2+72*(sum2-81));
//                    player2.toFront();
                    for(int i=0; i<80-sum2+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-81; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<=90)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>90&&sum2<=100&&sum2-x<=90)
                {
//                    player2.setCenterX(x2=x2+72*(90-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-91));
//                    player2.toFront();
                    for(int i=0; i<90-sum2+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<sum2-91; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==91)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=51;
                    }
                    if(sum2==95)
                    {
//                        player2.setCenterY(y2=y2+85);
//                        player2.setCenterX(x2=x2-72);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=76;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2<100)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(sum2==95)
                    {
//                        player2.setCenterY(y2=y2+85);
//                        player2.setCenterX(x2=x2-72);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2+42.5);
                        }
                        sum2=76;
                    }
                    if(sum2==99)
                    {
//                        player2.setCenterY(y2=y2+360);
//                        player2.setCenterX(x2=x2+72*8);
                        for(int i=0; i<8; i++)
                        {
                            av2.setY(y2=y2+45);
                            av2.setX(x2=x2-72);
                        }
                        sum2=10;
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+sum2);
                    tp2++;
                    p2turn = false;
                    p1turn = true;
                }
                else if(sum2>=100)
                {
//                    player2.setCenterX(x2=x2-72*(100-sum2+x));
//                    player2.toFront();
                    for(int i=0; i<100-sum2+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    tp2++;
                    p2.setText("PLAYER 2: "+100);
                    l.setText("Player 2 Won!");
                    p1turn = false;
                    p2turn = false;
                }
            }
        }
    }
}