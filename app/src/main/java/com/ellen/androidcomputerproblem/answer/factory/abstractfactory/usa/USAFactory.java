package com.ellen.androidcomputerproblem.answer.factory.abstractfactory.usa;

import com.ellen.androidcomputerproblem.answer.factory.abstractfactory.AbstractFactory;
import com.ellen.androidcomputerproblem.answer.factory.simplefactory.IProduct;

public class USAFactory implements AbstractFactory {
    @Override
    public IProduct makeProductA() {
        return new USAProductA();
    }

    @Override
    public IProduct makeProductB() {
        return new USAProductB();
    }

    @Override
    public IProduct makeProductC() {
        return new USAProductC();
    }
}
