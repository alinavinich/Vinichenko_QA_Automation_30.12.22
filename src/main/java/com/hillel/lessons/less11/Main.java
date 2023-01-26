package com.hillel.lessons.less11;

public class Main {

    public static void main(String[] args){

        Androids android = new Androids();
        Iphones iphone = new Iphones();

        android.versionLinux(2.0);
        android.call("555621");
        android.sms("test sms");
        android.internet("www");

        System.out.println();
        System.out.println();

        iphone.versionIos(1.2);
        iphone.call("444562");
        iphone.sms("sms test");
        iphone.internet("http");

    }
}
