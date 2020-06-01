package 数组.t1431;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: wangsongtao
 * @date: 2020/06/01 19:48
 */
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        for(int i=0;i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            }else{
                res.add(false);
            }
        }
        return res;
    }
}
