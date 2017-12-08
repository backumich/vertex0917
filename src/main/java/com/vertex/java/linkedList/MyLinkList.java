package com.vertex.java.linkedList;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class MyLinkList<T> implements Iterable {
    private Element first;
    private Element last;

    public void add(T value) {
        Element el = new Element(value);
        if (last == null) {
            first = el;
            last = el;
        } else {
            last.setNext(el);
            el.setPrev(last);
            last = el;

        }
    }

    public int size() {
        int size = 1;
        Element current = first;
        if (first == null) return 0;
        if (first.getNext() == null) {
            return size;
        }
        while (current.getNext() != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public Element get(int index) {
        if (size() < index - 1) {
            return null;
        }
        Element current = first;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }
        return current;
    }

    public void printList() {
        Element current = first;
        while (current != null) {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }

    @Override
    public Iterator iterator() {
        Iterator iter = new Iterator() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return (index < MyLinkList.this.size());
            }

            @Override
            public Object next() {
                return MyLinkList.this.get(index++);

            }
        };
        return iter;
    }

    @Override
    public void forEach(Consumer action) {
        Iterator iter = this.iterator();
        while (iter.hasNext()) {
            iter.next();
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}

