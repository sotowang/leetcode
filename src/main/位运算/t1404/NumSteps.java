package 位运算.t1404;

/**
 * @auther: sotowang
 * @date: 2020/4/21 19:29
 */
public class NumSteps {
    public int numSteps(String s) {
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        while(sb.length() > 1 || Integer.valueOf(sb.toString())!=1){
            if(sb.charAt(len-1) == '1'){
                count++;
                int index = len-1;
                while(index>=0 && sb.charAt(index) == '1'){
                    sb.replace(index , index+1, "0");
                    index--;
                }

                if(index<0){
                    sb.insert(0,'1');
                    len++;
                }else{
                    sb.replace(index,index+1,"1");
                }
            }else{
                int index = len-1;
                while(index >=0 && sb.charAt(index) == '0' ){
                    index--;
                }
                sb.delete(index+1,len);
                count += len-(index+1);
                len = index+1;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(new NumSteps().numSteps("1101"));
    }
}
