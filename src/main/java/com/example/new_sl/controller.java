package com.example.new_sl;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import javax.crypto.spec.PSource;
import java.lang.Math;

import java.util.Random;

import static java.lang.System.exit;

public class controller {
    private die D=new die();
    private gameobjstr<gamechars> store;
    @FXML
    private ImageView wbg;
    @FXML
    private ImageView wtrpy;
    @FXML
    private Button gfinish;
    @FXML
    private Label wlabel;
    @FXML private Group wing;
    @FXML
    private Button dback;
    @FXML
    private ImageView c1;
    @FXML
    private ImageView c2;

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
    private ImageView av1;
    @FXML
    private ImageView av2;
    @FXML
    private Rectangle rect;
    @FXML
    private ImageView dice;
    @FXML
    private ImageView img;
    @FXML
    private Label l;
    @FXML
    private Label n1;
    @FXML
    private Label n2;
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

//    boolean p1turn=true;
//    boolean p2turn=false;

    int tp1=0;
//    int sum1=0;
    int tp2=0;
//    int sum2=0;
    player pl1=new player(true,av1);
    player pl2=new player(false,av2);
    private ladders cl(int x,int y,int c){
        String s="l"+Integer.toString(c);
        return new ladders(x,y,s);
    }
    private snake cs(int x,int y,int c){
        String s="s"+Integer.toString(c);
        return new snake(x,y,s);
    }
    private void gameover(boolean w1,boolean w2){

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
        grp.setDisable(true);
        wing.setVisible(true);
        wbg.setVisible(true);
        wtrpy.setVisible(true);
        wlabel.setVisible(true);
        if(w1){
            wlabel.setText("Player 1 won");
        }
        else if(w2){
            wlabel.setText("Player 2 won");
        }
    }
    private void create(){
        store=new gameobjstr<>();
        int c=0;
        int t=0;
        store.add(cl(4,45,c++));
        store.add(cl(6,25,c++));
        store.add(cl(40,77,c++));
        store.add(cl(47,66,c++));
        store.add(cl(50,93,c++));
        store.add(cl(61,98,c++));
        store.add(cl(68,87,c++));

        store.add(cs(32,5,t++));
        store.add(cs(43,17,t++));
        store.add(cs(52,11,t++));
        store.add(cs(57,24,t++));
        store.add(cs(62,22,t++));
        store.add(cs(91,51,t++));
        store.add(cs(95,76,t++));
        store.add(cs(99,10,t++));




    }
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
//        System.out.println(av1);
        create();
        n1.setVisible(true);
        n2.setVisible(true);
        c1.setVisible(true);
        tap.setText("Tap on dice");
        tap.setAlignment(Pos.CENTER);
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
            c1.setVisible(false);
            c2.setVisible(true);
        }
        else {

            l1.setDisable(false);
            p1.setDisable(false);
            l2.setDisable(true);
            p2.setDisable(true);
            c1.setVisible(true);
            c2.setVisible(false);
        }
    }
    public void move(ActionEvent e) throws InterruptedException {
        n1.setVisible(false);
        n2.setVisible(false);
        show(pl1.isTurn(), pl2.isTurn());
        tap.setText("Waiting for game object encounter");
        int x = D.rolldie();
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
        if(pl1.isTurn())
        {
            if(tp1==0&&x==1)
            {
//                player1.setCenterY(y1=y1-70);
//                player1.setCenterX(x1=x1+5);
//                player1.toFront();
                av1.setY(y1=y1-60);
                av1.setX(x1=x1+5);


                tp1++;
                pl1.setTurn(false);
                pl2.setTurn(true);
                pl1.setScore(pl1.getScore()+x);
                p1.setText("PLAYER 1: "+pl1.getScore());
            }
            else if(tp1==0&&x>1)
            {
                pl1.setTurn(false);
                pl2.setTurn(true);
            }
            else if(tp1>0)
            {
                pl1.setScore(pl1.getScore()+x);
                if(pl1.getScore()<=10) {

//                    player1.setCenterX(x1 = x1 + 72 * x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);

                    }
                    if(pl1.getScore()==4)
                    {
//                        player1.setCenterX(x1 = x1 + 72);
//                        player1.setCenterY(y1 = y1 - 170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1-42);

                        }
                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(45);
                    }
                    if(pl1.getScore()==6)
                    {
//                        player1.setCenterX(x1 = x1 - 72);
//                        player1.setCenterY(y1 = y1 - 75);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-40);

                        }
                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));

                        pl1.setScore(25);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>10&&pl1.getScore()<=20&&pl1.getScore()-x<=10)
                {
//                    player1.setCenterX(x1=x1+72*(10-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-11));
//                    player1.toFront();
                    for(int i=0; i<10-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1+72);

                    }
                    av1.setY(y1=y1-45);
                    for(int i=0; i<pl1.getScore()-11; i++)
                    {
                        av1.setX(x1=x1-72);

                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=20)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);

                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>20&&pl1.getScore()<=30&&pl1.getScore()-x<=20)
                {
//                    player1.setCenterX(x1=x1-72*(20-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-21));
//                    player1.toFront();
                    for(int i=0; i<20-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1-72);

                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<pl1.getScore()-21; i++)
                    {
                        av1.setX(x1=x1+72);

                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=30)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>30&&pl1.getScore()<=40&&pl1.getScore()-x<=30)
                {
//                    player1.setCenterX(x1=x1+72*(30-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1-72*(sum1-31));
//                    player1.toFront();
                    for(int i=0; i<30-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<pl1.getScore()-31; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==32)
                    {
//                        player1.setCenterX(x1=x1-72*4);
//                        player1.setCenterY(y1 = y1 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1-72);
                            av1.setY(y1=y1+30);
                        }
                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));


                        pl1.setScore(5);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=40)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==40)
                    {
//                        player1.setCenterX(x1=x1+72*3);
//                        player1.setCenterY(y1 = y1 - 170);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1+72);
                            av1.setY(y1=y1-58);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(77);
                    }
                    if(pl1.getScore()==32)
                    {
//                        player1.setCenterX(x1=x1-72*4);
//                        player1.setCenterY(y1 = y1 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1-72);
                            av1.setY(y1=y1+30);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(5);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>40&&pl1.getScore()<=50&&pl1.getScore()-x<=40)
                {
//                    player1.setCenterX(x1=x1-72*(40-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-41));
//                    player1.toFront();
                    for(int i=0; i<40-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-44);
                    for(int i=0; i<pl1.getScore()-41; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(pl1.getScore()==43)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+120);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+30);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(17);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=50)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(pl1.getScore()==47)
                    {
//                        player1.setCenterX(x1=x1-72);
//                        player1.setCenterY(y1=y1-85);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-43);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(66);
                    }
                    if(pl1.getScore()==50)
                    {
//                        player1.setCenterX(x1=x1-72*2);
//                        player1.setCenterY(y1=y1-212);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1-48);
                            av1.setY(y1=y1-73);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(93);
                    }
                    if(pl1.getScore()==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+30);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(17);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>50&&pl1.getScore()<=60&&pl1.getScore()-x<=50)
                {
//                    player1.setCenterX(x1=x1+72*(50-sum1+x));
//                    player1.setCenterY(y1=y1-42);
//                    player1.setCenterX(x1=x1-72*(sum1-51));
//                    player1.toFront();
                    for(int i=0; i<50-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<pl1.getScore()-51; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==52)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+42.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(11);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=60)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==52)
                    {
//                        player1.setCenterX(x1=x1+72);
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setX(x1=x1+18);
                            av1.setY(y1=y1+42.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(11);
                    }
                    if(pl1.getScore()==57)
                    {
//                        player1.setCenterY(y1=y1+120);
                        for(int i=0; i<3; i++)
                        {
                            av1.setY(y1=y1+42);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(24);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>60&&pl1.getScore()<=70&&pl1.getScore()-x<=60)
                {
//                    player1.setCenterX(x1=x1-72*(60-sum1+x));
//                    player1.setCenterY(y1=y1-40);
//                    player1.setCenterX(x1=x1+72*(sum1-61));
//                    player1.toFront();
                    for(int i=0; i<60-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<pl1.getScore()-61; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(pl1.getScore()==61)
                    {
//                        player1.setCenterX(x1=x1+72*2);
//                        player1.setCenterY(y1=y1-120);
                        for(int i=0; i<3; i++)
                        {
                            av1.setX(x1=x1+48);
                            av1.setY(y1=y1-44);
                        }
                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(98);
                    }
                    if(pl1.getScore()==62)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(22);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=70)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    if(pl1.getScore()==68)
                    {
//                        player1.setCenterX(x1=x1-72);
//                        player1.setCenterY(y1=y1+85);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1-45);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(87);
                    }
                    if(pl1.getScore()==62)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(22);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>70&&pl1.getScore()<=80&&pl1.getScore()-x<=70)
                {
//                    player1.setCenterX(x1=x1+72*(70-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-71));
//                    player1.toFront();
                    for(int i=0; i<70-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-45);
                    for(int i=0; i<pl1.getScore()-71; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=80)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>80&&pl1.getScore()<=90&&pl1.getScore()-x<=80)
                {
//                    player1.setCenterX(x1=x1-72*(80-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1+72*(sum1-81));
//                    player1.toFront();
                    for(int i=0; i<80-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    av1.setY(y1=y1-44);
                    for(int i=0; i<pl1.getScore()-81; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<=90)
                {
//                    player1.setCenterX(x1=x1+72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>90&&pl1.getScore()<=100&&pl1.getScore()-x<=90)
                {
//                    player1.setCenterX(x1=x1+72*(90-sum1+x));
//                    player1.setCenterY(y1=y1-45);
//                    player1.setCenterX(x1=x1-72*(sum1-91));
//                    player1.toFront();
                    for(int i=0; i<90-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1+72);
                    }
                    av1.setY(y1=y1-40);
                    for(int i=0; i<pl1.getScore()-91; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==91)
                    {
//                        player1.setCenterY(y1=y1+170);
                        for(int i=0; i<4; i++)
                        {
                            av1.setY(y1=y1+42.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(51);
                    }
                    if(pl1.getScore()==95)
                    {
//                        player1.setCenterY(y1=y1+85);
//                        player1.setCenterX(x1=x1-72);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1+45);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(76);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()<100)
                {
//                    player1.setCenterX(x1=x1-72*x);
//                    player1.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    if(pl1.getScore()==95)
                    {
//                        player1.setCenterY(y1=y1+85);
//                        player1.setCenterX(x1=x1-72);
                        for(int i=0; i<2; i++)
                        {
                            av1.setX(x1=x1-36);
                            av1.setY(y1=y1+45);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(76);
                    }
                    if(pl1.getScore()==99)
                    {
//                        player1.setCenterY(y1=y1+360);
//                        player1.setCenterX(x1=x1+72*8);
                        for(int i=0; i<8; i++)
                        {
                            av1.setY(y1=y1+48);
                            av1.setX(x1=x1+72.5);
                        }

                        tap.setText("Player 1 encounterd a "+store.getcname(pl1.getScore())+" , moved to "+Integer.toString(store.goneto(pl1.getScore())));
                        pl1.setScore(10);
                    }
//                    player1.toFront();
                    p1.setText("PLAYER 1: "+pl1.getScore());
                    tp1++;
                    pl1.setTurn(false);
                    pl2.setTurn(true);
                }
                else if(pl1.getScore()>=100)
                {
//                    player1.setCenterX(x1=x1-72*(100-sum1+x));
//                    player1.toFront();
                    for(int i=0; i<100-pl1.getScore()+x; i++)
                    {
                        av1.setX(x1=x1-72);
                    }
                    tp1++;
                    p1.setText("PLAYER 1: "+100);
//                    l.setText("Player 1 Won!");
                    pl1.setTurn(false);
                    pl2.setTurn(false);
                    gameover(true,false);
                }
            }
        }
        else if(pl2.isTurn())
        {
            if(tp2==0&&x==1)
            {
//                player2.setCenterY(y2=y2-70);
//                player2.setCenterX(x2=x2+5);
//                player2.toFront();
                av2.setY(y2=y2-60);
                av2.setX(x2=x2+5);
                tp2++;
                pl2.setTurn(false);
                pl1.setTurn(true);
//                sum2=sum2+x;
                pl2.setScore(pl2.getScore()+x);
                p2.setText("PLAYER 2: "+pl2.getScore());
            }
            else if(tp2==0&&x>1)
            {
                pl2.setTurn(false);
                pl1.setTurn(true);
            }
            else if(tp2>0)
            {
//                sum2=sum2+x;
                pl2.setScore(pl2.getScore()+x);
                if(pl2.getScore()<=10)
                {
//                    player2.setCenterX(x2 = x2 + 72 * x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(pl2.getScore()==4)
                    {
//                        player2.setCenterX(x2 = x2 + 72);
//                        player2.setCenterY(y2 = y2 - 170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2-42);
                        }
//                        sum2=45;

                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(45);
                    }
                    if(pl2.getScore()==6)
                    {
//                        player2.setCenterX(x2 = x2 - 72);
//                        player2.setCenterY(y2 = y2 - 75);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-40);
                        }
//                        sum2=25;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(25);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>10&&pl2.getScore()<=20&&pl2.getScore()-x<=10)
                {
//                    player2.setCenterX(x2=x2+72*(10-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-11));
//                    player2.toFront();
                    for(int i=0; i<10-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-45);
                    for(int i=0; i<pl2.getScore()-11; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=20)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>20&&pl2.getScore()<=30&&pl2.getScore()-x<=20)
                {
//                    player2.setCenterX(x2=x2-72*(20-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-21));
//                    player2.toFront();
                    for(int i=0; i<20-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2-72);

                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<pl2.getScore()-21; i++)
                    {
                        av2.setX(x2=x2+72);

                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=30)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>30&&pl2.getScore()<=40&&pl2.getScore()-x<=30)
                {
//                    player2.setCenterX(x2=x2+72*(30-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2-72*(sum2-31));
//                    player2.toFront();
                    for(int i=0; i<30-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<pl2.getScore()-31; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==32)
                    {
//                        player2.setCenterX(x2=x2-72*4);
//                        player2.setCenterY(y2 = y2 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2-72);
                            av2.setY(y2=y2+30);
                        }
//                        sum2=5;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(5);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=40)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==40)
                    {
//                        player2.setCenterX(x2=x2+72*3);
//                        player2.setCenterY(y2 = y2 - 170);
                        for(int i=0; i<3; i++)
                        {
                            av2.setX(x2=x2+72);
                            av2.setY(y2=y2-58);
                        }
//                        sum2=77;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(77);
                    }
                    if(pl2.getScore()==32)
                    {
//                        player2.setCenterX(x2=x2-72*4);
//                        player2.setCenterY(y2 = y2 + 130);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2-72);
                            av2.setY(y2=y2+30);
                        }
//                        sum2=5;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(5);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>40&&pl2.getScore()<=50&&pl2.getScore()-x<=40)
                {
//                    player2.setCenterX(x2=x2-72*(40-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-41));
//                    player2.toFront();
                    for(int i=0; i<40-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-44);
                    for(int i=0; i<pl2.getScore()-41; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(pl2.getScore()==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+30);
                        }
//                        sum2=17;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(17);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=50)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(pl2.getScore()==47)
                    {
//                        player2.setCenterX(x2=x2-72);
//                        player2.setCenterY(y2=y2-85);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-43);
                        }
//                        sum2=66;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(66);
                    }
                    if(pl2.getScore()==50)
                    {
//                        player2.setCenterX(x2=x2-72*2);
//                        player2.setCenterY(y2=y2-212);
                        for(int i=0; i<3; i++)
                        {
                            av2.setX(x2=x2-48);
                            av2.setY(y2=y2-73);
                        }
//                        sum2=93;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(93);
                    }
                    if(pl2.getScore()==43)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+30);
                        }
//                        sum2=17;

                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(17);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>50&&pl2.getScore()<=60&&pl2.getScore()-x<=50)
                {
//                    player2.setCenterX(x2=x2+72*(50-sum2+x));
//                    player2.setCenterY(y2=y2-42);
//                    player2.setCenterX(x2=x2-72*(sum2-51));
//                    player2.toFront();
                    for(int i=0; i<50-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<pl2.getScore()-51; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==52)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+42.5);
                        }
//                        sum1=11;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl1.setScore(11);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=60)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==52)
                    {
//                        player2.setCenterX(x2=x2+72);
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setX(x2=x2+18);
                            av2.setY(y2=y2+42.5);
                        }
//                        sum2=11;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(11);
                    }
                    if(pl2.getScore()==57)
                    {
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<3; i++)
                        {
                            av2.setY(y2=y2+42);
                        }
//                        sum2=24;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(24);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>60&&pl2.getScore()<=70&&pl2.getScore()-x<=60)
                {
//                    player2.setCenterX(x2=x2-72*(60-sum2+x));
//                    player2.setCenterY(y2=y2-40);
//                    player2.setCenterX(x2=x2+72*(sum2-61));
//                    player2.toFront();
                    for(int i=0; i<60-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<pl2.getScore()-61; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(pl2.getScore()==61)
                    {
//                        player2.setCenterX(x2=x2+72*2);
//                        player2.setCenterY(y2=y2+120);
                        for(int i=0; i<3; i++)
                        {
                            av2.setX(x2=x2+48);
                            av2.setY(y2=y2-44);
                        }
//                        sum2=98;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(98);
                    }
                    if(pl2.getScore()==62)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
//                        sum2=22;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(22);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=70)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    if(pl2.getScore()==68)
                    {
//                        player2.setCenterX(x2=x2-72);
//                        player2.setCenterY(y2=y2-85);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2-45);
                        }
//                        sum2=87;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(87);
                    }
                    if(pl2.getScore()==62)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
//                        sum2=22;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(22);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>70&&pl2.getScore()<=80&&pl2.getScore()-x<=70)
                {
//                    player2.setCenterX(x2=x2+72*(70-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-71));
//                    player2.toFront();
                    for(int i=0; i<70-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-45);
                    for(int i=0; i<pl2.getScore()-71; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=80)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>80&&pl2.getScore()<=90&&pl2.getScore()-x<=80)
                {
//                    player2.setCenterX(x2=x2-72*(80-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2+72*(sum2-81));
//                    player2.toFront();
                    for(int i=0; i<80-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    av2.setY(y2=y2-44);
                    for(int i=0; i<pl2.getScore()-81; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<=90)
                {
//                    player2.setCenterX(x2=x2+72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>90&&pl2.getScore()<=100&&pl2.getScore()-x<=90)
                {
//                    player2.setCenterX(x2=x2+72*(90-sum2+x));
//                    player2.setCenterY(y2=y2-45);
//                    player2.setCenterX(x2=x2-72*(sum2-91));
//                    player2.toFront();
                    for(int i=0; i<90-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2+72);
                    }
                    av2.setY(y2=y2-40);
                    for(int i=0; i<pl2.getScore()-91; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==91)
                    {
//                        player2.setCenterY(y2=y2+170);
                        for(int i=0; i<4; i++)
                        {
                            av2.setY(y2=y2+42.5);
                        }
//                        sum2=51;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(51);
                    }
                    if(pl2.getScore()==95)
                    {
//                        player2.setCenterY(y2=y2+85);
//                        player2.setCenterX(x2=x2-72);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2+45);
                        }
//                        sum2=76;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(76);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()<100)
                {
//                    player2.setCenterX(x2=x2-72*x);
//                    player2.toFront();
                    for(int i=0; i<x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    if(pl2.getScore()==95)
                    {
//                        player2.setCenterY(y2=y2+85);
//                        player2.setCenterX(x2=x2-72);
                        for(int i=0; i<2; i++)
                        {
                            av2.setX(x2=x2-36);
                            av2.setY(y2=y2+45);
                        }
//                        sum2=76;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(76);
                    }
                    if(pl2.getScore()==99)
                    {
//                        player2.setCenterY(y2=y2+360);
//                        player2.setCenterX(x2=x2+72*8);
                        for(int i=0; i<8; i++)
                        {
                            av2.setY(y2=y2+48);
                            av2.setX(x2=x2+72.5);
                        }
//                        sum2=10;
                        tap.setText("Player 2 encounterd a "+store.getcname(pl2.getScore())+" , moved to "+Integer.toString(store.goneto(pl2.getScore())));
                        pl2.setScore(10);
                    }
//                    player2.toFront();
                    p2.setText("PLAYER 2: "+pl2.getScore());
                    tp2++;
                    pl2.setTurn(false);
                    pl1.setTurn(true);
                }
                else if(pl2.getScore()>=100)
                {
//                    player2.setCenterX(x2=x2-72*(100-sum2+x));
//                    player2.toFront();
                    for(int i=0; i<100-pl2.getScore()+x; i++)
                    {
                        av2.setX(x2=x2-72);
                    }
                    tp2++;
                    p2.setText("PLAYER 2: "+100);
//                    l.setText("Player 2 Won!");
                    pl2.setTurn(false);
                    pl1.setTurn(false);
                    gameover(false,true);
                }
            }
        }
    }
}