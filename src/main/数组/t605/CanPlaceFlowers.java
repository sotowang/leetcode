package 数组.t605;

/**
 * @auther: sotowang
 * @date: 2020/4/19 18:16
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int countOfZero = 0;
        int[] newFlowerbed = new int[len+2];
        for(int i=0;i<len;i++){
            newFlowerbed[i+1] = flowerbed[i];
        }
        for(int i=0;i<len+2 && n>0;i++){
            if(newFlowerbed[i] == 0){
                if((i>0 && newFlowerbed[i-1] == 1) ||(i==0)){
                    countOfZero = 0;
                }
                countOfZero++;
                if(countOfZero == 3){
                    countOfZero=1;
                    n--;
                }
            }
        }
        return n==0;

    }
}
