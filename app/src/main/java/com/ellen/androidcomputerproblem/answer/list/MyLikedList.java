package com.ellen.androidcomputerproblem.answer.list;

public class MyLikedList<T> implements MyList<T> {

    private int size = 0;
    /**
     * 链表头部
     */
    private Node<T> header = new Node<>(null);

    /**
     * 记录游标
     */
    private Node<T> currentNode = header;

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
        Node<T> node = new Node<>(t);
        node.pre = currentNode;
        currentNode.next = node;
        size++;
        //调整当前游标到下一个
        currentNode = node;
        return false;
    }

    @Override
    public boolean add(int index, T t) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (index == i) {
                break;
            }
        }
        Node<T> addNode = new Node<>(t);
        addNode.pre = node.pre;
        addNode.next = node;
        node.pre.next = addNode;
        node.pre = addNode;
        size++;
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
        if (index >= size) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        for (int i = 0; i < list.size(); i++) {
            add(index, list.get(i));
            index++;
        }
        return true;
    }

    @Override
    public boolean set(int index, T t) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (i == index) {
                break;
            }
        }
        node.value = t;
        return false;
    }

    @Override
    public boolean remove(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (i == index) {
                if(node == currentNode){
                    //删除的是末尾的
                    currentNode = node.pre;
                    currentNode.next = null;
                }else {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
                size--;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean remove(T t) {
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (node.getValue().equals(t)) {
                if(node == currentNode){
                    //删除的是末尾的
                    currentNode = node.pre;
                    currentNode.next = null;
                }else {
                    node.pre.next = node.next;
                    node.next.pre = node.pre;
                }
                size--;
                break;
            }
        }
        return true;
    }

    @Override
    public boolean contains(T t) {
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (node.value.equals(t)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T get(int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException(String.valueOf(index));
        }
        Node<T> node = header;
        for (int i = 0; i < size; i++) {
            node = node.next;
            if (index == i) {
                break;
            }
        }
        return node.value;
    }

    @Override
    public boolean clear() {
        header = new Node<>(null);
        currentNode = header;
        size = 0;
        return false;
    }

    /**
     * 用于链表的结点封装
     *
     * @param <E>
     */
    private class Node<E> {
        private Node<E> pre;
        private E value;
        private Node<E> next;

        public Node(E value) {
            this.value = value;
        }

        public Node<E> getPre() {
            return pre;
        }

        public void setPre(Node<E> pre) {
            this.pre = pre;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }
}
