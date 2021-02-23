package com.company;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String[] channel = new String[3];
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();

        RemoteController remoteController = new RemoteController(button);
        TV tv = new TV(channel);
        Channel channelClass = new Channel();

        tv.getNumberChannel(button);
        channelClass.printChannel();


    }
}
