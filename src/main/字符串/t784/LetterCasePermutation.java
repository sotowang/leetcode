package 字符串.t784;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther: sotowang
 * @date: 2020/06/12 22:38
 */
public class LetterCasePermutation {
    List<String> resList = new ArrayList<>();
    public List<String> letterCasePermutation(String S) {
        change(S,0,"");
        return resList;
    }
    private void change(String s,int start,String temString){
        if(start == s.length()){
            resList.add(temString);
            return;
        }
        if(s.charAt(start)>='a' && s.charAt(start) <= 'z'){
            change(s,start+1,temString+(char)(s.charAt(start)-'a'+'A'));
            change(s,start+1,temString+s.charAt(start));
        }else if(s.charAt(start)>='A' && s.charAt(start) <= 'Z'){
            change(s,start+1,temString+(char)(s.charAt(start)-'A'+'a'));
            //System.out.println(temString+(char)(s.charAt(start)-'A'+'a'));
            change(s,start+1,temString+s.charAt(start));
            //System.out.println(temString+(char)(s.charAt(start)));
        }else{
            change(s,start+1,temString+s.charAt(start));
        }
    }

    public static void main(String[] args) {
        new LetterCasePermutation().letterCasePermutation("C");
    }
}
