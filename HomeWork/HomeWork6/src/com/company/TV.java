package com.company;

import java.util.Random;
import java.util.Scanner;

public class TV {
    private String[] channel;
    private Channel channelClass;
    private int i;

    public TV(String[] channel) {
        this.channel = new String[3];
        this.channel = channel;
    }

    public int getI() {
        return i;
    }

    public int getNumberChannel(int button) {
        channel[0] = "Sport Channel";
        channel[1] = "Fun Channel";
        channel[2] = "News Channel";

       while(i <= channel.length - 1) {
           if (button == i) {
               break;
           }
           i++;
       }
       return i;
   }

   public void setProgram(Channel channelClass){
        this.channelClass = channelClass;
        this.channelClass.setChannel(this);
   }




}
