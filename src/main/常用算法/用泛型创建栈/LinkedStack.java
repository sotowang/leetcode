package 常用算法.用泛型创建栈;

/**
 * @author: sotowang
 * @date: 2020/08/10 16:30
 */
public class LinkedStack<T> {
    class Node<T>{
        T item;
        Node<T> next;

        public Node() {
            this.item = null;
            this.next = null;
        }

        public Node(T item, Node<T> next) {
            this.item = item;
            this.next = next;
        }

        public Node(T item) {
            this.item = item;
        }
    }

    Node<T> top = new Node<T>();

    public void push(T item) {
        Node<T> node = new Node<>(item, top);
        top = node;
    }
    public T pop() {
        if (top.item == null) {
            return null;
        }
        T  item = top.item;
        top = top.next;
        return item;
    }

    public static void main(String[] args) {
        LinkedStack stack = new LinkedStack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
