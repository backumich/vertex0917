package com.vertex.java.EugeniyaDzhu.MyLinkedList;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.function.Consumer;


public class DataAndNext<T> {
    private T dataElement;
    private DataAndNext<T> nextElement;

    public T getDataElement() {
        return dataElement;
    }

    public DataAndNext<T> getNextElement() {
        return nextElement;
    }

    public void setDataElement(T dataElement) {

        this.dataElement = (T) dataElement;
    }

    public void setNextElement(DataAndNext<T> nextElement) {
        this.nextElement = nextElement;
    }


}
