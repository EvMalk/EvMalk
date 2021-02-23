package com.company;


public class Channel {
    private String[] programs;

    private TV tv;

    public Channel(){
    }

    public void setChannel(TV tv){
        this.tv = tv;
    }

    public void printChannel(){
        int i = tv.getI();
        System.out.println(i);
    }

}


