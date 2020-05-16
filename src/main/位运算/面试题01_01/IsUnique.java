package 位运算.面试题01_01;

/**
 * @author: wangsongtao
 * @date: 2020/05/16 20:41
 */
public class IsUnique {
    public boolean isUnique(String astr) {
        int len = astr.length();
        int res = 0;
        for(int i=0;i<len;i++){
            int index = astr.charAt(i)-'a';
            if((res & (1<<index)) != 0){
                return false;
            }else{
                res |= (1<<index);
            }
        }
        return true;
    }
}
