package 字符串.t657;

/**
 * @author: sotowang
 * @date: 2020/08/28 13:23
 */
public class JudgeCircle {
    public boolean judgeCircle(String moves) {
        int x = 0;
        int y = 0;
        for(int i=0;i<moves.length();i++){
            char c = moves.charAt(i);
            if(c == 'U'){
                y++;
            }else if(c == 'D'){
                y--;
            }else if(c == 'L'){
                x--;
            }else if(c == 'R'){
                x++;
            }
        }
        return x == 0 && y==0;
    }
}
