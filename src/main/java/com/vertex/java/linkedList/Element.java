package com.vertex.java.linkedList;

public class Element<T> {
    private Element next;
    private Element prev;
    private T value;

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrev() {
        return prev;
    }

    public void setPrev(Element prev) {
        this.prev = prev;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    Element(T value){
        this.value = value;
    }


}