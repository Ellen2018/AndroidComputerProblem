package com.ellen.androidcomputerproblem.answer.observer.basic;

/**
 * T 为被观察的对象
 * @param <T>
 */
public interface Observer<T> {
    void update(T t);
}
