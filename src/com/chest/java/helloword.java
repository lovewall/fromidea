package com.chest.java;

import java.util.ArrayList;

public class helloword {
    public static void main(String[] args) {
        System.out.println("args = " + args);
        System.out.println(args);
        String[] ssr=new String[]{"123","231","tome","jes"};
        for (int i = 0; i < ssr.length; i++) {
            System.out.println(ssr[i]);
        }
//        for (String s : ssr) {
//            System.out.println(s);
//        }
        
        for (int i = 0; i < ssr.length; i++) {
            String s = ssr[i];
            System.out.println(s+s);
        }
        ArrayList list= new ArrayList();
        for (int i = 0; i < 4; i++) {
            list.add(i);
        }
        for (Object s : list) {
            System.out.println(s);
        }

    }
}
