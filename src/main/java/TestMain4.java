import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lesson_3.Deque.Deque;
import lesson_3.Deque.DequeImpl;
import lesson_4.SimpleLinkedListImpl;

public class TestMain4 {

    public static void main(String[] args) {
        //ForEach
        testForEach();


        //Deque
        Deque<Integer> deq = new DequeImpl<>(6);
        insertRight(deq, 1);
        insertRight(deq, 2);
        insertRight(deq, 3);
        insertRight(deq, 4);
        insertLeft(deq, 5);
        insertLeft(deq, 6);

        removeLeft(deq);
        removeRight(deq);

        displayLeftToRight(deq);
        //displayRightToLeft(deq);

    }


    private static void testForEach() {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        for (Integer integer : arrayList) {
            System.out.println(integer);
        }


        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }

        SimpleLinkedListImpl<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        linkedList.display();

        for(Integer value: linkedList) {
            System.out.println(value);
        }
    }


    private static <E> void insertRight(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertRight(value);
        }
    }

    private static <E> void insertLeft(Deque<E> deq, E value) {
        if ( !deq.isFull() ) {
            deq.insertLeft(value);
        }
    }

    private static <E> void removeRight(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeRight();
        }
    }

    private static <E> void removeLeft(Deque<E> deq) {
        if ( !deq.isEmpty() ) {
            deq.removeLeft();
        }
    }

    private static <E> void displayRightToLeft(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeRight());
        }
    }

    private static <E> void displayLeftToRight(Deque<E> deq) {
        while ( !deq.isEmpty() ) {
            System.out.println(deq.removeLeft());
        }
    }
}


