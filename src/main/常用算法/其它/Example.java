package 常用算法.其它;



/**
 * @auther: sotowang
 * @date: 2020/3/13 20:22
 */
public class Example {

    public static void main(String[] args) {
        String s2 = "a" + "b";
        String s1 = new String("ab");
        String s3 = "ab";
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        StringBuilder sb = new StringBuilder(s3);

    }

}
