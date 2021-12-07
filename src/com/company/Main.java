package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        Carp carp = new Carp("Talker", "2021/5/1");
        Eagle eagle = new Eagle("Pilot", "2020/2/1");
        Kangaroo kangaroo = new Kangaroo("Bouncy", "2019/3/1");
        Lynx lynx = new Lynx("Kitty","2021/1/1");
        Raccoon raccoon = new Raccoon("Gargle", "2019/6/1");
        Ram ram = new Ram("Snack", "2021/7/1");
        Ostrich ostrich = new Ostrich("Nut", "2018/9/1");

       
        List<String> infoAll0 = carp.showPersonalInfo;
        List<String> infoAll1 = eagle.showPersonalInfo;
        List<String> infoAll2 = kangaroo.showPersonalInfo;
        List<String> infoAll3 = lynx.showPersonalInfo;
        List<String> infoAll4 = ostrich.showPersonalInfo;
        List<String> infoAll5 = raccoon.showPersonalInfo;
        List<String> infoAll6 = ram.showPersonalInfo;


        List<String> personalInfoAll = showPersonalInfoAll(infoAll0, infoAll1, infoAll2, infoAll3, infoAll4, infoAll5, infoAll6);



    }
    public static List<String> showPersonalInfoAll(List<String> infoAll0, List<String> infoAll1, List<String> infoAll2, List<String> infoAll3, List<String> infoAll4, List<String> infoAll5, List<String> infoAll6) {
        List<String> infoAll = new ArrayList<>();
        infoAll.add(0, String.valueOf(infoAll0));
        System.out.println("Carp: " + infoAll0);
        infoAll.add(1, String.valueOf(infoAll1));
        System.out.println("Eagle: " + infoAll1);
        infoAll.add(2, String.valueOf(infoAll2));
        System.out.println("Kangaroo: " + infoAll2);
        infoAll.add(3, String.valueOf(infoAll3));
        System.out.println("Lynx: " + infoAll3);
        infoAll.add(4, String.valueOf(infoAll4));
        System.out.println("Ostrich: " + infoAll4);
        infoAll.add(5, String.valueOf(infoAll5));
        System.out.println("Raccoon: " + infoAll5);
        infoAll.add(6, String.valueOf(infoAll6));
        System.out.println("Ram: " + infoAll6);
        return infoAll;
    }
}
