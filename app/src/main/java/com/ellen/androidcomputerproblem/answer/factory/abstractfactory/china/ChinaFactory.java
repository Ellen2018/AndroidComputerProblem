package com.ellen.androidcomputerproblem.answer.factory.abstractfactory.china;


import com.ellen.androidcomputerproblem.answer.factory.abstractfactory.AbstractFactory;
import com.ellen.androidcomputerproblem.answer.factory.simplefactory.IProduct;

public class ChinaFactory implements AbstractFactory {
    @Override
    public IProduct makeProductA() {
        return new ChinaProductA();
    }

    @Override
    public IProduct makeProductB() {
        return new ChinaProductB();
    }

    @Override
    public IProduct makeProductC() {
        return new ChinaProductC();
    }
}
