package 数学.面试题16_01;

/**
 * @author: wangsongtao
 * @date: 2020/05/20 20:55
 */
public class SwapNumbers {
    public int[] swapNumbers(int[] numbers) {
        numbers[0] = numbers[0]-numbers[1];
        numbers[1] = numbers[0]+numbers[1];
        numbers[0] = numbers[1] - numbers[0];
        return numbers;
    }
}
