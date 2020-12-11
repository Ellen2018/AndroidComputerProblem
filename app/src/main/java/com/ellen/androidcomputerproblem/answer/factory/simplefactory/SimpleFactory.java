package com.ellen.androidcomputerproblem.answer.factory.simplefactory;

/**
 * 简单工厂模式
 */
public class SimpleFactory {

    enum ProductType{
        A,B,C;
    }

    public static IProduct makeProduce(ProductType productType){
        IProduct iProduct = null;
        switch (productType){
            case A:
                iProduct =  new ProductA();
                break;
            case B:
                iProduct = new ProductB();
                break;
            case C:
                iProduct =  new ProductC();
                break;
            default:
        }
        return iProduct;
    }
}
