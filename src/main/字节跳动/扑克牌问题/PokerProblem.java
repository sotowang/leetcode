package 字节跳动.扑克牌问题;

import java.util.LinkedList;

/**
 * @auther: sotowang
 * @date: 2020/07/12 23:43
 */
public class PokerProblem {
    public void pokerPro(int n){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(n);
        for(int i=n-1;i>=1;i--){
            list.addFirst(list.removeLast());
            list.addFirst(i);
        }
        for (Integer tem : list) {
            System.out.print(tem+"->");

        }
    }

    public static void main(String[] args) {
        new PokerProblem().pokerPro(13);

    }
}
