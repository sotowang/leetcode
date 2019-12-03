package 设计.t284;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @auther: sotowang
 * @date: 2019/12/03 17:47
 */
public class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;
    private Integer cache;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (cache == null) {
            cache = iterator.next();
        }
        return cache;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (cache != null) {
            int temp = cache;
            cache = null;
            return temp;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        if (cache == null) {
            return iterator.hasNext();
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        Iterator<Integer> iterator = list.iterator();
        PeekingIterator pk = new PeekingIterator(iterator);
//        System.out.println(pk.hasNext());
//        System.out.println(pk.peek());
//        System.out.println(pk.peek());
//        System.out.println(pk.next());
//        System.out.println(pk.next());
//        System.out.println(pk.peek());
//        System.out.println(pk.peek());
//        System.out.println(pk.next());
//        System.out.println(pk.hasNext());
//        System.out.println(pk.peek());
//        System.out.println(pk.hasNext());
//        System.out.println(pk.next());
//        System.out.println(pk.hasNext());

        //["PeekingIterator","hasNext","peek","peek","next","next","peek","peek","next","hasNext","peek","hasNext","next","hasNext"]
        //[[[1,2,3,4]],[],[],[],[],[],[],[],[],[],[],[],[],[]]
        System.out.println(pk.hasNext());
        System.out.println(pk.peek());
        System.out.println(pk.peek());
        System.out.println(pk.next());
        System.out.println(pk.next());
        System.out.println(pk.peek());
        System.out.println(pk.peek());
        System.out.println(pk.next());
        System.out.println(pk.hasNext());
        System.out.println(pk.peek());
        System.out.println(pk.hasNext());
        System.out.println(pk.next());
        System.out.println(pk.hasNext());
    }
}
