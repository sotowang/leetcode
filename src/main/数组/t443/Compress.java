package 数组.t443;

/**
 * @auther: sotowang
 * @date: 2020/07/11 22:16
 */
public class Compress {
    public int compress(char[] chars) {
        if(chars == null || chars.length == 0){
            return 0;
        }
        int index = -1;
        for(int i=0;i<chars.length;){
            int j=i+1;
            while(j< chars.length && chars[j] == chars[i]){
                j++;
            }
            if(j-i>1){
                String countStr = String.valueOf(j-i);
                chars[++index] = chars[j-1];
                for(int k=1;k<=countStr.length();k++){
                    chars[index+k] = countStr.charAt(k-1);
                }
                index = index+countStr.length();
            }else{
                chars[++index] = chars[j-1];
            }
            i = j;

        }
        return index+1;
    }

    public static void main(String[] args) {
//        char[] chars = {'a', 'a', 'a', 'b', 'b', 'a', 'a'};
//        char[] chars = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};
        char[] chars = {'a', 'a', 'a', 'a', 'a', 'b',};
        new Compress().compress(chars);
        for (char c : chars) {
            System.out.println(c);
        }
    }
}
