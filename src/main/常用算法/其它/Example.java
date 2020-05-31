package 常用算法.其它;


/**
 * @author: sotowang
 * @date: 2020/3/13 20:22
 */
public  class Example {

    public static void main(String[] args) {
        String s = "we are happy now";
//        s = s.replaceAll("\\s+", "%20");
        s = s.replace(" ", "20%");
        System.out.println(s);
    }

}
