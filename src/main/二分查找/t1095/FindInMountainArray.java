package 二分查找.t1095;

/**
 * @auther: sotowang
 * @date: 2020/4/29 17:04
 */
public class FindInMountainArray {
    class MountainArray{
        public int length(){
            return  0;
        }

        public int get(int index) {
            return 0;
        }
    }
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len = mountainArr.length();
        int left = 0;
        int right = len-1;
        int mid = -1;
        while(left<=right){
            mid = left+right >>1;
            int midNum  = mountainArr.get(mid);
            int preMid = -1;
            int postMid = -1;
            if(mid>0){
                preMid = mountainArr.get(mid-1);
            }
            if(mid<len){
                postMid = mountainArr.get(mid+1);
            }
            if(midNum>preMid && midNum>postMid){
                break;
            }else if(midNum<postMid){
                left = mid+1;
            }else if(midNum<preMid){
                right = mid-1;
            }
        }
        //左峰
        int res = binSearchLeft(mountainArr,0,mid,target);
        if(res == -1){
            res = binSearchRight(mountainArr,mid+1,len-1,target);
        }
        return res;

    }
    private int binSearchLeft(MountainArray mountainArr,int left,int right,int target){
        while(left<=right){
            int mid = left+right>>1;
            int midNum = mountainArr.get(mid);
            if(midNum== target){
                return mid;
            }else if(midNum>target){
                right= mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
    private int binSearchRight(MountainArray mountainArr,int left,int right,int target){
        while(left<=right){
            int mid = left+right>>1;
            int midNum = mountainArr.get(mid);
            if(midNum== target){
                return mid;
            }else if(midNum>target){
                left= mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}
