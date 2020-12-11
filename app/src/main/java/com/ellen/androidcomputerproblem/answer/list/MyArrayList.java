package com.ellen.androidcomputerproblem.answer.list;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    /**
     * 容器,初始容量为10
     */
    private Object[] container = new Object[10];

    /**
     * 元素个数
     */
    private int size = 0;

    /**
     * 容量
     */
    private int capacity = 10;

    /**
     * 扩容因子
     */
    private final float EXPANSION_FACTOR = 0.75f;

    /**
     * 最大容量
     */
    private final int MAX_SIZE = Integer.MAX_VALUE - 8;


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(T t) {
        //先进行检测是否需要扩容
        checkGrow();
        container[size++] = t;
        return true;
    }

    @Override
    public boolean add(int index, T t) {
        checkGrow();
        size++;
        moveBack(1, index);
        container[index] = t;
        return true;
    }

    @Override
    public boolean addAll(MyList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(list.get(i));
        }
        return true;
    }

    @Override
    public boolean addAll(int index, MyList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            add(index,list.get(i));
            index++;
        }
        return true;
    }

    @Override
    public boolean set(int index, T t) {
        if (index > size - 1) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            container[index] = t;
        }
        return true;
    }

    @Override
    public boolean remove(T t) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (container[i].equals(t)) {
                index = i;
                break;
            }
        }
        if (index > 0) {
            return remove(index);
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(int index) {
        moveForward(1, index);
        size--;
        return true;
    }

    @Override
    public boolean contains(T t) {
        for (int i = 0; i < size; i++) {
            if (container[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index > size - 1) {
            throw new ArrayIndexOutOfBoundsException(index);
        } else {
            return (T) container[index];
        }
    }

    @Override
    public boolean clear() {
        container = new Object[10];
        size = 0;
        capacity = 10;
        return true;
    }

    /**
     * 检测是否需要扩容
     */
    private void checkGrow() {
        if (size > capacity * EXPANSION_FACTOR) {
            //需要扩容(1.5倍扩容)
            capacity = capacity + (capacity >> 1);

            //不能无限扩容,需要有个限制
            if (capacity - MAX_SIZE >= 0) {
                if (capacity == MAX_SIZE) {
                    //最后一次扩容
                    capacity = Integer.MAX_VALUE;
                } else if (capacity == Integer.MAX_VALUE) {
                    //已经达到最大容量,抛出OOM异常
                    throw new OutOfMemoryError();
                } else {
                    capacity = MAX_SIZE;
                }
            }
            container = Arrays.copyOf(container, capacity);
        }
    }

    /**
     * 后移
     *
     * @param count
     */
    private void moveBack(int count, int index) {
        //数组元素向后移动count位
        System.arraycopy(container, index, container, index + count, size - count);
    }

    /**
     * 前移
     *
     * @param count
     * @param index
     */
    private void moveForward(int count, int index) {
        for (int j = 0; j < size - index; j++) {
            container[j + index] = container[count + j + index];
        }
    }
}
