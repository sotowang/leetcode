package 数组.t605;

/**
 * @auther: sotowang
 * @date: 2020/4/19 18:16
 */
public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int countOfZero = 0;
        int[] newFlowerbed = new int[flowerbed.length+2];
        for(int i=0;i<flowerbed.length;i++){
            newFlowerbed[i+1] = flowerbed[i];
        }
        for(int i=0;i<newFlowerbed.length && n>0;i++){
            if(newFlowerbed[i] == 0){
                if(i>0 && newFlowerbed[i-1] == 1){
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
