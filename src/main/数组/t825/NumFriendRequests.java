package 数组.t825;

/**
 * @auther: sotowang
 * @date: 2020/06/10 22:40
 */
public class NumFriendRequests {
    public int numFriendRequests(int[] ages) {
        int[] count = new int[121];
        for(int age:ages){
            count[age]++;
        }
        int res = 0;
        for(int i=1;i<=120;i++){
            //同龄人
            if(i>14){
                res += count[i]*(count[i]-1);
            }
            //非同龄人
            for(int j=i-1;j>=0;j--){
                if(j>(i>>1)+7){
                    res += count[i]*count[j];
                }
            }
        }
        return res;
    }
}
