package com.ellen.androidcomputerproblem.answer.builder;

/**
 * 以Dog为例进行Builder模式
 *
 * Dog的成员属性：
 * name(名字)
 * color(颜色)
 * height(体重)
 * high(高度)
 */
public class Dog {

    private String name;
    private String color;
    private float height;
    private float high;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHigh() {
        return high;
    }

    public void setHigh(float high) {
        this.high = high;
    }

    public static class Builder{

        private String name;
        private String color;
        private float height;
        private float high;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder color(String color){
            this.color = color;
            return this;
        }

        public Builder height(float height){
            this.height = height;
            return this;
        }

        public Builder high(float high){
            this.high = high;
            return this;
        }

        public Dog build(){
            Dog dog = new Dog();
            dog.setName(name);
            dog.setColor(color);
            dog.setHeight(height);
            dog.setHigh(high);
            return dog;
        }
    }

}
