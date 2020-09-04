package 常用算法.其它.华为;


import java.util.LinkedList;
import java.util.Random;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {
    public static void insertData(LinkedList<Integer> queue) {
        int insertCount = 1;
        int deleteCount = 2;
        Random random = new Random();
        while (!queue.isEmpty()) {
            //插入数据
            for (int i = 0; i < insertCount; i++) {
                int insert = i + random.nextInt(10000);
                queue.offer(insert);
                System.out.println("插入元素：" + insert);
            }
            //删除数据
            for (int i = 0; i < deleteCount; i++) {
                int index = random.nextInt(queue.size());
                System.out.println("删除元素：" + queue.get(index));
                queue.remove(index);
            }
            insertCount++;
            deleteCount++;
        }
    }
    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            queue.offer(i);
        }
        insertData(queue);
    }

}
