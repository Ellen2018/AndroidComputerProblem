package com.ellen.androidcomputerproblem.answer.singleinstance;

/**
 * 懒汉 & 非线程安全
 */
public class SingleInstance2 {
    private static SingleInstance2 singleInstance = new SingleInstance2();

    private SingleInstance2(){}

    public static SingleInstance2 getInstance(){
        return singleInstance;
    }
}
