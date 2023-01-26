package com.hillel.lessons.less11;

public class Iphones implements Smartphones, IOS{
    @Override
    public void versionIos(double version) {
        System.out.println("iPhone version - " + version);
    }

    @Override
    public void call(String number) {
        System.out.println("Call - " + number);

    }

    @Override
    public void sms(String text) {
        System.out.println("Sms - " + text);

    }

    @Override
    public void internet(String link) {
        System.out.println("Internet - " + link);

    }
}
