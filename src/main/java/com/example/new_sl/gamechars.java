package com.example.new_sl;

abstract public class gamechars {
    private int tnum;
    private int gTnum;
    gamechars(int x,int gtx){
        this.tnum=x;
        this.gTnum=gtx;
    }

    public int getTnum() {
        return tnum;
    }

    public int getGetTnum() {
        return gTnum;
    }
}

class snake extends gamechars implements inter{
    private String sname;
    snake(int x, int gtx,String sname) {
        super(x,gtx);

        this.sname=sname;
    }
    @Override
    public String getName() {
        return this.sname;
    }
}

class ladders extends gamechars implements inter{
    private String lname;
    ladders(int x, int gtx,String lname) {
        super(x,gtx);
        this.lname=lname;
    }

    @Override
    public String getName() {
        return this.lname;
    }
}
