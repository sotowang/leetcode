package 贪心算法.t881;

import java.util.Arrays;

/**
 * @auther: sotowang
 * @date: 2020/4/26 16:48
 */
public class NumRescueBoats {
    public int numRescueBoats(int[] people, int limit) {
        int count = 0;
        int len = people.length;
        Arrays.sort(people);
        int left = 0;
        int right = len-1;
        while(left<=right){
            if(people[right]+people[left]<=limit){
                left++;
            }
            right--;
            count++;
            //System.out.print(count);
        }
        return count;

    }
}
