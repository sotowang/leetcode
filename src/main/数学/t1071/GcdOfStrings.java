package 数学.t1071;

/**
 * @auther: sotowang
 * @date: 2020/4/7 16:08
 */
public class GcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        return gcd(str1,str2);

    }
    private String gcd(String str1,String str2){
        if(str2.isEmpty()){
            return str1;
        }
        String tem = str2;
        str2 = str1.replace(str2,"");
        str1 =  tem;

        return gcd(str1,str2);
    }
}
