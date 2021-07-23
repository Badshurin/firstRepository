package chapter35_8_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Solution {
    public static <D> void add(List<D> destinationList, List<? extends D> sourceList) {
        ListIterator<D> destListIterator = destinationList.listIterator();
        ListIterator<? extends D> srcListIterator = sourceList.listIterator();
        for (int i = 0; i < sourceList.size(); i++) {
            destinationList.add(srcListIterator.next());
        }
    }

    public static void main(String[] args) {
        List<B> destination = new ArrayList<>();
        destination.add(new B());
        List<C> source = new ArrayList<>();
        source.add(new C());
        add(destination, source);
        System.out.println(destination);
        System.out.println(source);
    }

    static class A {
    }

    static class B extends A {
    }

    static class C extends B {
    }

}
