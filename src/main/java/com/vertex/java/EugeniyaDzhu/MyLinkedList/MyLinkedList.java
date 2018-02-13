package com.vertex.java.EugeniyaDzhu.MyLinkedList;

import javax.xml.crypto.Data;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class MyLinkedList<T> implements MLL<T> {

    DataAndNext first;
    DataAndNext last;

    int size =0;

    private class Iterator<T> implements java.util.Iterator {

        DataAndNext current;
        boolean isBegin;

        public Iterator() {
            isBegin = true;
        }

        @Override
        public boolean hasNext() {

            boolean forReturn = false;
            if (isBegin) {
                current =first;
                isBegin = false;
                forReturn = true;
            } else {
                if (current != last) {
                    forReturn = true;
                    current = current.getNextElement();
                }
            }
           return forReturn;
        }

        @Override
        public T next() {
            return (T) current.getDataElement();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>();
    }

    @Override
    public Boolean add(T element) {

        DataAndNext<T> dataAndNext = new DataAndNext();
        dataAndNext.setDataElement(element);
        if (first == null) {
            first = dataAndNext;
        }else {
            last.setNextElement(dataAndNext);
        };
        last = dataAndNext;
        size++;
        return true;
    }



}
