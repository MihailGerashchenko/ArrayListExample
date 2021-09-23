package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ListWithoutRemoval<E> extends ArrayList<E> {

    @Override
    public boolean removeIf(Predicate<? super E> filter) {
        System.out.println("You are not allowed to remove");
        return false;
    }

    @Override
    public void replaceAll(UnaryOperator<E> operator) {
        System.out.println("You are not allowed to replace");
    }

    @Override
    public E remove(int index) {
        System.out.println("You are not allowed to remove");
        return null;
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        System.out.println("You are not allowed to remove");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        System.out.println("You are not allowed to remove");
        return false;
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("You are not allowed to remove");
        return false;
    }

    @Override
    public void clear() {
        System.out.println("You are not allowed to clear");
    }
}
