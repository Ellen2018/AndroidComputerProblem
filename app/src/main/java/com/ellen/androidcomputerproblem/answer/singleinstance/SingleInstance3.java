package com.ellen.androidcomputerproblem.answer.singleinstance;

/**
 * DCL双重检测锁机制 & 线程安全
 *
 * 多数项目中会采用这种
 *
 * 其他写法:http://www.blogjava.net/kenzhh/archive/2013/03/15/357824.html
 */
public class SingleInstance3 {

    private volatile static SingleInstance3 singleInstance;

    private SingleInstance3(){}

    public static SingleInstance3 getInstance(){
        if(singleInstance == null){
            synchronized (SingleInstance3.class){
                if(singleInstance == null){
                    singleInstance = new SingleInstance3();
                }
            }
        }

        return singleInstance;
    }

}
