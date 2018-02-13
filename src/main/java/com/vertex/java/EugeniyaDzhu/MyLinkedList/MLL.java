package com.vertex.java.EugeniyaDzhu.MyLinkedList;

import java.util.Iterator;

public interface MLL<T> {

    DataAndNext first = null;
    DataAndNext last = null;

    Iterator<T> iterator();

    Boolean add(T element);



}

