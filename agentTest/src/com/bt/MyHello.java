package com.bt;

import javassist.ClassPool;

public class MyHello {

    public static void main(String[] args) {
        sayHello();
    }

    public  static  void sayHello(){
        System.out.println( "this is hello from sayHello now is = " + System.currentTimeMillis());
    }

}
