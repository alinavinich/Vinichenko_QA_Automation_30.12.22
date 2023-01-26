package com.hillel.lessons.less11;

public class Androids implements Smartphones,LinuxOS  {


    @Override
    public void versionLinux(double version) {
        System.out.println("Android version - " + version);
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
