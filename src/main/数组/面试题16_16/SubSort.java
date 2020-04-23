package 数组.面试题16_16;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/23 18:50
 */
public class SubSort {
    public int[] subSort(int[] array) {
        int[] cpy = new int[array.length];
        cpy = Arrays.copyOf(array,array.length);
        int left = -1;
        int right = -1;
        int index =0;
        Arrays.sort(array);
        while(index<array.length){
            if(array[index] == cpy[index]){
                index++;
            }else{
                left = index;
                break;
            }
        }
        if(left!=-1){
            index = array.length-1;
            while(index>=0){
                if(array[index] == cpy[index]){
                    index--;
                }else{
                    right = index;
                    break;
                }
            }
        }
        return new int[]{left,right};
    }
}
