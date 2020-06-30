package 数组.t1122;

/**
 * @auther: sotowang
 * @date: 2020/06/22 22:35
 */
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] tem = new int[1001];
        int[] res = new int[arr1.length];
        for(int arr:arr1){
            tem[arr]++;
        }
        int index = 0;
        for(int i=0;i<arr2.length;i++){
            while(tem[arr2[i]]-- > 0){
                res[index++] = arr2[i];
            }
        }
        for(int i=0;i<=1000;i++){
            while(tem[i]-->0){
                res[index++] = i;
            }
        }
        return res;

    }
}
