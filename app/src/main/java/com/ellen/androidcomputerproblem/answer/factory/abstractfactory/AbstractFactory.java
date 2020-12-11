package com.ellen.androidcomputerproblem.answer.factory.abstractfactory;

import com.ellen.androidcomputerproblem.answer.factory.simplefactory.IProduct;

/**
 * 抽象工厂
 */
public interface AbstractFactory {
    IProduct makeProductA();
    IProduct makeProductB();
    IProduct makeProductC();
}
