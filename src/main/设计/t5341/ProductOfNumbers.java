package 设计.t5341;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/2/16 17:25
 */
public class ProductOfNumbers {
    List<Integer> list;

    public ProductOfNumbers() {
        list = new ArrayList<>();
    }

    public void add(int num) {
        if (num == 0) {
            list.clear();
            return;
        }
        if (list.isEmpty()) {
            list.add(1);
        }
        list.add(num * list.get(list.size() - 1));


    }

    public int getProduct(int k) {
        if (k >= list.size()) {
            return 0;
        }
        return list.get(list.size() - 1) / list.get(list.size() - k - 1);
    }

    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);
        productOfNumbers.add(0);
        productOfNumbers.add(2);
        productOfNumbers.add(5);
        productOfNumbers.add(4);

        assert productOfNumbers.getProduct(4) == 0;
        assert productOfNumbers.getProduct(3) == 40;
        assert productOfNumbers.getProduct(2) == 20;
    }
}
