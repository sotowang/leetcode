package 双指针.t925;

/**
 * @author: sotowang
 * @date: 2020/11/08 17:25
 */
public class IsLongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int lenN = name.length();
        int lenT = typed.length();
        if(lenN>lenT){
            return false;
        }
        int first = 0;
        int sec = 0;
        while(first<lenN && sec<lenT){
            if( name.charAt(first) == typed.charAt(sec)){
                first++;
                sec++;
            }else if(sec> 0 && name.charAt(first-1) == typed.charAt(sec)){
                sec++;
            }else{
                return false;
            }
        }
        if(sec < typed.length()){
            while(sec<typed.length()){
                if(name.charAt(lenN-1) == typed.charAt(sec)){
                    sec++;
                }else{
                    return false;
                }
            }
        }

        return first == lenN;

    }
}
