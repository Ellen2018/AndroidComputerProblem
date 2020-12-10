package com.ellen.androidcomputerproblem.answer.singleinstance;

/**
 * 饱汉 & 非线程安全
 */
public class SingleInstance1 {

    private static SingleInstance1 singleInstance;

    private SingleInstance1(){}

    public static SingleInstance1 getInstance(){
        if(singleInstance == null){
            singleInstance = new SingleInstance1();
        }
        return singleInstance;
    }
}
