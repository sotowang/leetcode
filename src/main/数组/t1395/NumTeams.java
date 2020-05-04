package 数组.t1395;

/**
 * @auther: sotowang
 * @date: 2020/05/04 17:50
 */
public class NumTeams {
    public int numTeams(int[] rating) {
        int sum = 0;
        for(int i=0;i<rating.length;i++){
            int leftCount1 = 0;
            int rightCount1 = 0;
            int leftCount2 = 0;
            int rightCount2 = 0;
            for(int j=i-1;j>=0;j--){
                if(rating[j]<rating[i]){
                    leftCount1++;
                }else{
                    leftCount2++;
                }
            }
            for(int j=i+1;j<rating.length;j++){
                if(rating[j]>rating[i]){
                    rightCount1++;
                }else{
                    rightCount2++;
                }
            }
            sum += leftCount1*rightCount1 + leftCount2*rightCount2;
        }
        return sum;
    }
}
