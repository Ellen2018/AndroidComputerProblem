package com.ellen.androidcomputerproblem.answer.list;



public interface MyList<T> {
    /**
     * 当前集合的元素个数
     * @return
     */
    int size();

    /**
     * 集合是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 添加元素
     * @param t
     */
    boolean add(T t);

    /**
     * 在指定位置添加元素
     * @param index
     * @param t
     * @return
     */
    boolean add(int index, T t);

    /**
     * 添加一个集合
     * @param list
     * @return
     */
    boolean addAll(MyList<T> list);

    /**
     * 在指定位置添加一个集合
     * @param index
     * @param list
     * @return
     */
    boolean addAll(int index, MyList<T> list);

    /**
     * 设置对应位置的值
     * @param index
     * @param t
     * @return
     */
    boolean set(int index, T t);

    /**
     * 移除指定位置的元素
     * @param index
     * @return
     */
    boolean remove(int index);


    /**
     * 移除元素
     * @param t
     * @return
     */
    boolean remove(T t);

    /**
     * 是否包含
     * @param t
     * @return
     */
    boolean contains(T t);

    /**
     * 查询所在的位置的元素
     * @param index
     * @return
     */
    T get(int index);

    /**
     * 清空
     * @return
     */
    boolean clear();
}
