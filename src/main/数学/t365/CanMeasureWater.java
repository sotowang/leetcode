package 数学.t365;

/**
 * @auther: sotowang
 * @date: 2020/3/22 23:12
 */
public class CanMeasureWater {
    public boolean canMeasureWater(int x, int y, int z) {
        if(x == 0 || y == 0){
            if(z== x|| z==y) return true;
            return false;
        }
        if(x+y<z){
            return false;
        }
        int min = x>y?y:x;
        int max = x>y?x:y;
        //寻找最大公约数
        int common;
        boolean flag = true;
        int index = 1;
        int tem = -1;
        while(flag){
            tem = min/index++;
            if(max%tem == 0 && min % tem == 0){
                flag = false;
            }
        }
        return z%tem == 0;
    }
}
