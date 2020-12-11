package com.ellen.androidcomputerproblem.answer.observer.basic;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject<T> {

    private List<Observer<T>> observerList;

    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer<T> observer){
        if(observerList == null){
            observerList = new ArrayList<>();
        }
        observerList.add(observer);
    }

    /**
     * 注销观察者
     * @param observer
     */
    public void unRegisterObserver(Observer<T> observer){
        if(observerList== null || observerList.size() == 0){
            return;
        }else {
            observerList.remove(observer);
        }
    }

    /**
     * 被观察这状态发生改变的时候调用
     */
    public void statusChange(T t){
        if(!(observerList == null || observerList.size() == 0)){
            for(Observer<T> observer:observerList){
                observer.update(t);
            }
        }
    }
}
