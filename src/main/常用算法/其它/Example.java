package 常用算法.其它;


import java.util.Arrays;

/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public static void main(String[] args) {
        String s = "we are happy now";
//        s = s.replaceAll("\\s+", "%20");
        s = s.replace(" ", "20%");

        int[] aa = new int[2];
        aa[0] = 1;
        aa[1] = 2;
        int max  = Arrays.stream(aa).max().getAsInt();
        System.out.println(max);
    }

}
