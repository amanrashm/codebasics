package com.MYCODES;

import java.util.Scanner;

public class Main {

/*    static int sum(int a, int b){
        return a+b;
    }*/

    public static void main(String[] args) {

        A a=new A();
        System.out.println(a.a);

        B a1=new B();
        System.out.println(a1.a);

        A a3=new B();
        System.out.println(a3.a);

    }
}

class A{
    int a=20;
}

class B extends A{

    int a=30;
}